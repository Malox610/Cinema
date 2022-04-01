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
            ResultSet result = stmt.executeQuery("select * from show");

            while (result.next()) {
                                    //int IDshow , String Date,int nbseat,int room ,int idmovie
                Show s = new Show(result.getInt(1), result.getString(2), result.getInt(3), result.getInt(4), result.getInt(5));

                ShowList.add(s);
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
                    +"VALUES ('"+sho.getIDshow()+"', '"+ sho.getDate() +"', '"+sho.getNbSeat()+"', '"+sho.getRoom()+"', '"+sho.getIdMovie()+"');";
            stmt.executeUpdate(sqlStatement);

        } catch (Exception e) {
            System.out.println(e);
        }
    }

}

