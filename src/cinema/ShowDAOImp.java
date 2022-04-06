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
            DataBase dataSource = new DataBase();//connexion à la base de données
            conn = dataSource.createConnection();
            Statement stmt = conn.createStatement();
            ResultSet result = stmt.executeQuery("SELECT * FROM `show` ");//requête SQL pour afficher les séances

            while (result.next()) {//Int idshow , String date , int nbseat , int room , int IDmovie
                for(int i=0; i < Cinema.FilmList.size();++i){//pour tout les films
                    if(Cinema.FilmList.get(i).getIDMovie() == result.getInt(5)){//pour chaque séance correspondant au film
                        //on crée un objet séance
                        Show showe = new Show(result.getInt(1), result.getString(2), result.getInt(3), result.getInt(4), Cinema.FilmList.get(i));
                        ShowList.add(showe);   //ajout de la séance à la liste des séances du même film
                    }
                }
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return ShowList;//retourner la liste des séances
    }
    
    @Override
    public ArrayList<Show> getShow(int id) {//récupérer toute les séances correspondant au même film
        ArrayList<Show> ShowList = new ArrayList<>();
        Connection conn = null;
        try {
            DataBase dataSource = new DataBase();//connexion base de données
            conn = dataSource.createConnection();
            Statement stmt = conn.createStatement();
            ResultSet result = stmt.executeQuery("SELECT * FROM `show` WHERE `ID_movie` = " + id);//réquête SQL pour afficher toute les séances du même film via son id en paramètre
          //tant qu'il y a des résultats pour la recherche
            while (result.next()) {//Int idshow , String date , int nbseat , int room , int IDmovie
                FilmDAO fil = new FilmDAOImp();
                    Show showe = new Show(result.getInt(1), result.getString(2), result.getInt(3), result.getInt(4),fil.getFilmsID(result.getInt(5)));
                    ShowList.add(showe);  //ajout de la séance à la liste des séances du même film tant qu'il y en a dans la bdd
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
         return ShowList; //retourner la liste de séances
    }
    
    
    @Override
    public Show getShowID_Date(int idmovie , String Date)//récupérer la séances correspondant à un film et un horaire précis
    {
     Connection conn = null;
        try {
            DataBase dataSource = new DataBase();//connexion base de données
            conn = dataSource.createConnection();
            Statement stmt = conn.createStatement();
            // requête SQL cherchant les séances pour un film et un horaire donnée
            ResultSet result = stmt.executeQuery("SELECT * FROM `show` WHERE `ID_movie` = " + idmovie + " AND `date`='"+Date+"'; " );
            while (result.next()) 
            {  // String title , String director , String genre , String time , int IDmovie // je sais pas ce que les result correspond a quoi
                FilmDAO fil = new FilmDAOImp();
                Show showe = new Show(result.getInt(1), result.getString(2), result.getInt(3), result.getInt(4),fil.getFilmsID(result.getInt(5)));
                   
                return showe ;
                
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
         return new Show(); 
    
    }
    
     public Show getShowID(int id ) //récupére la séance correpondant à un id unique de séance
    {
     Connection conn = null;
        try {
            DataBase dataSource = new DataBase();//connexion
            conn = dataSource.createConnection();
            Statement stmt = conn.createStatement();
             //requête SQL cherchant la séance correspondant à l'id envoyé en paramètre
            ResultSet result = stmt.executeQuery("SELECT * FROM `show` WHERE `ID_show` = " + id +" ; " );
            while (result.next()) //tant qu'il y a des résultats pour la recherche
            {  // String title , String director , String genre , String time , int IDmovie // je sais pas ce que les result correspond a quoi
                FilmDAO fil = new FilmDAOImp();
                  //création d'un objet séance
                Show showe = new Show(result.getInt(1), result.getString(2), result.getInt(3), result.getInt(4),fil.getFilmsID(result.getInt(5)));
                   //retourne la séance correspondant à l'id en paramètre
                return showe ;
                
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
         return new Show(); 
    
    }
    
            
    @Override
    public void addShow(Show sho) {//ajouter une séance en passant une séance en paramètre
        Connection con = null;
        try {
            DataBase dataSource = new DataBase();//connexion à la base de donnée
            con = dataSource.createConnection();
            Statement stmt = con.createStatement();
            //requête SQL permettant d'ajouter les données d'une séance à la base de données
            String sqlStatement = "INSERT INTO `show` (`ID_show`, `date`, `nb_seat`, `room_number`, `id_Movie`) "
                    + "VALUES ('" + sho.getIDshow() + "', '" + sho.getDate() + "', '" + sho.getNbSeat() + "', '" + sho.getRoom() + "', '" + sho.getMovie() + "');";
            stmt.executeUpdate(sqlStatement); //effectuer la recherche

        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public void deleteShow(Show sho) {//supprimer une séance passée en paramètres
        Connection conn = null;
        try {
            DataBase dataSource = new DataBase();//connexion à la base de données
            conn = dataSource.createConnection();
            Statement stmt = conn.createStatement();
            Statement stmt2 = conn.createStatement();
            //requête SQL 
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
