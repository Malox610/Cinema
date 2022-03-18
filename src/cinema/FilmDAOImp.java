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

/**
 *
 * @author esmil
 */
public class FilmDAOImp implements FilmDAO{
      @Override
      public Films getFilms(int id)
    {
        Connection conn = null;
        try {
            DataBase dataSource = new DataBase();
            conn = dataSource.createConnection();
            Statement stmt = conn.createStatement();
            ResultSet result = stmt.executeQuery("select * from Films where id = " + id);
            while (result.next()) 
            {  // String title , String director , String genre , String time , int IDmovie // je sais pas ce que les result correspond a quoi
                Films fil =new Films (result.getString(2) ,result.getString(2) , result.getString(3) ,result.getString(3), result.getInt(8));
                
                return fil ;
                
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
         return new Films(); 
    }
    
}
