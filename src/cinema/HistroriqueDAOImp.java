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
    public ArrayList<Histrorique> getHistorique() {
        ArrayList<Histrorique> historisque = new ArrayList<>();
        Connection conn = null;
        try {
            DataBase dataSource = new DataBase();//connexion avec la base de données
            conn = dataSource.createConnection();
            Statement stmt = conn.createStatement();
              //requête SQL en jointure pour retrouver les récupérer l'historique des commandes
            ResultSet result = stmt.executeQuery("SELECT t.ID_Ticket,t.date, t.nb_ticket, t.id_customer, t.id_show FROM `ticket` t "
                    + "INNER JOIN `customer` c ON c.id_customer=t.id_customer ;");

            while (result.next()) {

                if (Projet.connectid == result.getInt(4)) {
                   //si l'id de l'utilisateur connecté est le même que celui du résultat de la base de donnée
                //on récupère les données et on créé un objet historique
                //String Date , int nbTicket , int idCust,int IdShow
                    Histrorique histo = new Histrorique(result.getInt(1), result.getString(2), result.getInt(3), result.getInt(4), result.getInt(5));
                    historisque.add(histo);//on l'ajoute à la liste historique qui est l'historique lui-même

                } else {
                        //si rien 
                        Histrorique histo = new Histrorique(0, "", 0, Projet.connectid, 1);
                    historisque.add(histo);
                        
                      
                }
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return historisque;
    }

}
