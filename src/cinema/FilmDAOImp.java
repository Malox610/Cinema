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
public class FilmDAOImp implements FilmDAO{
      @Override
      public Films getFilmsID(int id)
    {
        Connection conn = null;
        try {
            DataBase dataSource = new DataBase();
            conn = dataSource.createConnection();
            Statement stmt = conn.createStatement();
            ResultSet result = stmt.executeQuery("SELECT * FROM Movie WHERE `ID_movie` = " + id);
            while (result.next()) 
            {  // String title , String director , String genre , String time , int IDmovie // je sais pas ce que les result correspond a quoi
                Films fil =new Films (result.getString(2) ,result.getString(3) , result.getString(4) ,result.getString(5), result.getInt(1),result.getString(6),result.getBytes(7));
                
                return fil ;
                
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
         return new Films(); 
    }  
      
      public ArrayList<Films> getFilm() {
        ArrayList<Films> FilmList = new ArrayList<>();
        Connection conn = null;
        try {
            DataBase dataSource = new DataBase();
            conn = dataSource.createConnection();
            Statement stmt = conn.createStatement();
            ResultSet result = stmt.executeQuery("select * from Movie");

            while (result.next()) {//String title , String director , String genre , String time , int IDmovie , String synopsis
                Films fil = new Films(result.getString(2) ,result.getString(3) , result.getString(4) ,result.getString(5), result.getInt(1),result.getString(6),result.getBytes(7));

                FilmList.add(fil);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return FilmList;
    }
    
       public int getFilmsTitle(String title)
    {
        int id =0 ;
        Connection conn = null;
        try {
            DataBase dataSource = new DataBase();
            conn = dataSource.createConnection();
            Statement stmt = conn.createStatement();
            ResultSet result = stmt.executeQuery("SELECT ID_movie FROM Movie WHERE `Name` = '" + title +"';");
            while (result.next()) 
            {  
        
                id=result.getInt(1);
                return id ;
                
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
         return 0; 
    }
    
}
