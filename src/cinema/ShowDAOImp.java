/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cinema;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author esmil
 */
public class ShowDAOImp implements ShowDAO {

    @Override
    public ArrayList<Show> getShow() {
        ArrayList<Show> ShowList = new ArrayList<>();
        Connection conn = null;
        try {
            DataBase dataSource = new DataBase();
            conn = dataSource.createConnection();
            Statement stmt = conn.createStatement();
            ResultSet result = stmt.executeQuery("SELECT * FROM `show` ");

            while (result.next()) {//Int idshow , String date , int nbseat , int room , int IDmovie
                for(int i=0; i < Cinema.FilmList.size();++i){
                    if(Cinema.FilmList.get(i).getIDMovie() == result.getInt(5)){
                        Show showe = new Show(result.getInt(1), result.getString(2), result.getInt(3), result.getInt(4), Cinema.FilmList.get(i));
                        ShowList.add(showe);   
                    }
                }
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return ShowList;
    }
    
    @Override
    public ArrayList<Show> getShow(int id) {
        ArrayList<Show> ShowList = new ArrayList<>();
        Connection conn = null;
        try {
            DataBase dataSource = new DataBase();
            conn = dataSource.createConnection();
            Statement stmt = conn.createStatement();
            ResultSet result = stmt.executeQuery("SELECT * FROM `show` WHERE `ID_movie` = " + id);
            while (result.next()) {//Int idshow , String date , int nbseat , int room , int IDmovie
                FilmDAO fil = new FilmDAOImp();
                    Show showe = new Show(result.getInt(1), result.getString(2), result.getInt(3), result.getInt(4),fil.getFilmsID(result.getInt(5)));
                    ShowList.add(showe);   
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
         return ShowList; 
    }

    @Override
    public void addShow(Show sho) {
        Connection con = null;
        try {
            DataBase dataSource = new DataBase();
            con = dataSource.createConnection();
            Statement stmt = con.createStatement();
            String sqlStatement = "INSERT INTO `show` (`ID_show`, `date`, `nb_seat`, `room_number`, `id_Movie`) "
                    + "VALUES ('" + sho.getIDshow() + "', '" + sho.getDate() + "', '" + sho.getNbSeat() + "', '" + sho.getRoom() + "', '" + sho.getIdMovie() + "');";
            stmt.executeUpdate(sqlStatement);

        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public void deleteShow(Show sho) {
        Connection conn = null;
        try {
            DataBase dataSource = new DataBase();
            conn = dataSource.createConnection();
            Statement stmt = conn.createStatement();
            Statement stmt2 = conn.createStatement();
            ResultSet result = stmt.executeQuery("select `nb_seat` from show WHERE `ID_show`=" + sho.getIDshow());
            if (result.getInt(3) != 235 || result.getInt(3) !=210 || result.getInt(3) !=154 || result.getInt(3) !=88) {
                String sqlStatement = "DELETE FROM `show` "
                        + "WHERE `ID_show`=" + sho.getIDshow();
                stmt.executeUpdate(sqlStatement);
                Cinema.ShowList.remove(sho);
            }
            else
            {
                 JOptionPane.showMessageDialog(null, "This show can't be cancelled");
            }

        } catch (HeadlessException | SQLException e) {
            System.out.println(e);
        }
    }
    
    @Override
    public void UpdateSeat(Show sho)
    {
     Connection conn = null;
        try {
            DataBase dataSource = new DataBase();
            conn = dataSource.createConnection();
            Statement stmt = conn.createStatement();
            String sqlStatement = "UPDATE `show` "
                    + "SET `nb_seat` = '" + sho.getNbSeat()
                    + " 'WHERE "
                    + "`show`.`ID_show`= " + sho.getIDshow() + " ;";
            stmt.executeUpdate(sqlStatement);
            //  System.out.println("rows=" + rows);
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
}
