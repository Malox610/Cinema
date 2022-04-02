/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cinema;

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
            ResultSet result = stmt.executeQuery("select * from `show`");

            while (result.next()) {
                //int IDshow , String Date,int nbseat,int room ,int idmovie

            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return ShowList;
    }

    public void addShow(Show sho) {
        Connection con = null;
        try {
            DataBase dataSource = new DataBase();
            con = dataSource.createConnection();
            Statement stmt = con.createStatement();
            String sqlStatement = "INSERT INTO `show` (`ID_show`, `date`, `nb_seat`, `room_number`, `id_Movie`) "
                    + "VALUES ('" + sho.getIDshow() + "', '" + sho.getDate() + "', '" + sho.getNbSeat() + "', '" + sho.getRoom() + "', '" + sho.getIdMovie() + "');";
            stmt.executeUpdate(sqlStatement);

        } catch (Exception e) {
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

        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
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
        } catch (Exception e) {
            System.out.println(e);
        }
    
    }

}
