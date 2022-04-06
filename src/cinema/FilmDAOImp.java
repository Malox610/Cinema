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
      public Films getFilmsID(int id) //récupération des données d'un film à partir de l'id du film
    {
        Connection conn = null;
        try {
            DataBase dataSource = new DataBase(); //connexion avec la base de donnée
            conn = dataSource.createConnection();
            Statement stmt = conn.createStatement();
             //requête SQL de la table film pour afficher le film correspondant à l'id en paramètre
            ResultSet result = stmt.executeQuery("SELECT * FROM movie WHERE `ID_movie` = " + id);
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
      
      @Override
      public ArrayList<Films> getFilm() {//récupération de l'ensemble des films de la table film et de leur données
        ArrayList<Films> FilmList = new ArrayList<>();
        Connection conn = null;
        try {
            DataBase dataSource = new DataBase();
            conn = dataSource.createConnection();
            Statement stmt = conn.createStatement();
            ResultSet result = stmt.executeQuery("select * from movie");//requête SQL pour la table film

            while (result.next()) {//String title , String director , String genre , String time , int IDmovie , String synopsis
                Films fil = new Films(result.getString(2) ,result.getString(3) , result.getString(4) ,result.getString(5), result.getInt(1),result.getString(6),result.getBytes(7));

                FilmList.add(fil);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return FilmList;
    }
    
      @Override
       public int getFilmsTitle(String title)//récupération de l'id du film grâce au titre passé en paramètre
    {
        int id =0 ;
        Connection conn = null;
        try {
            DataBase dataSource = new DataBase();
            conn = dataSource.createConnection();
            Statement stmt = conn.createStatement();
            ResultSet result = stmt.executeQuery("SELECT ID_movie FROM movie WHERE `Name` = '" + title+"';" );
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
