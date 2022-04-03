/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cinema;

import Menu.Projet;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author esmil
 */
public class HistroriqueDAOImp implements HistroriqueDAO {
    
    
      @Override
      public ArrayList<Histrorique> getHistorique( ) {
        ArrayList<Histrorique> historisque = new ArrayList<>();
        Connection conn = null;
        try {
            DataBase dataSource = new DataBase();
            conn = dataSource.createConnection();
            Statement stmt = conn.createStatement();
            ResultSet result = stmt.executeQuery("SELECT t.ID_Ticket,t.date, t.nb_ticket, t.id_customer, t.id_show FROM `ticket` t " +
         "INNER JOIN `customer` c ON c.id_customer=t.id_customer ;");

            while (result.next()) {
                 
                        if(Projet.connectid == result.getInt(4)){
                //SString Date , int nbTicket , int idCust,int IdShow
                Histrorique histo = new Histrorique(result.getInt(1) ,result.getString(2) ,result.getInt(3) , result.getInt(4) ,result.getInt(5));
                historisque.add(histo);
                   
                }
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return historisque;
    }
    
}
