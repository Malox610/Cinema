/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cinema;

import Menu.Projet;
import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author thomas
 */
public class TicketDAOImp implements TicketDAO {//classe qui intéragit avec la base de données

    @Override
    public ArrayList<Ticket> getTick()//récupérer tout les tickets dans une liste de tickets
    {
        ArrayList<Ticket> TicketList = new ArrayList<>();//création de la liste
        Connection conn = null;
        try {
            DataBase dataSource = new DataBase();//connexion avec la base de données
            conn = dataSource.createConnection();
            Statement stmt = conn.createStatement();
            //requête SQL des données dans la classe ticket
            ResultSet result = stmt.executeQuery("SELECT * from `ticket`");

            while (result.next())//tant qu'il y a des résultats
            {
                for (int j = 0; j < Cinema.ShowList.size(); ++j) {//pour toute les séances
                    for (int k = 0; k < Cinema.CustList.size(); ++k) {
                        //pour tout les clients
                        //si la séance et le client correspond à la ligne de la base de données
                        if (Cinema.ShowList.get(j).getIDshow() == result.getInt(6) && Cinema.CustList.get(k).getIDCustomer() == result.getInt(1)) {
                            //créé un ticket et l'initialiser avec les données de la ligne
                            Ticket tick = new Ticket(result.getInt(1), result.getString(2), result.getInt(4), result.getInt(3), Cinema.CustList.get(k), Cinema.ShowList.get(j));
                            Cinema.CustList.get(k).getTicket().add(tick);
                            //ajouter le ticket à la liste de tickets
                        }
                    }
                }
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return TicketList;//retourner la liste de tout les tickets
    }

    @Override
    public void addTicket(Ticket ti)//ajouter un ticket passé en paramètre à la base de données
    {
        Connection con = null;
        try {
            DataBase dataSource = new DataBase();//connexion
            con = dataSource.createConnection();
            Statement stmt = con.createStatement();
            if (Projet.connectid > 0) {//si le client est connecté
                String sqlStatement = "INSERT INTO `ticket` (`ID_Ticket`, `date`, `price`, `nb_ticket`, `id_customer`, `id_show`) "
                        + "VALUES ('" + ti.getIDTicket() + "', '" + ti.getDate() + "', '" + ti.getprice() + "', '" + ti.getnbTicket() + "', '" + ti.getCust().getIDCustomer() + "', '" + ti.getShow().getIDshow() + "');";
                stmt.executeUpdate(sqlStatement);//ajouter le ticket à la base de données
            } else // si le client n'est pas connecté
            {
                String sqlStatement = "INSERT INTO `ticket` (`ID_Ticket`, `date`, `price`, `nb_ticket`, `id_customer`, `id_show`) "
                        + "VALUES ('" + ti.getIDTicket() + "', '" + ti.getDate() + "', '" + ti.getprice() + "', '" + ti.getnbTicket() + "', '" + 1 + "', '" + ti.getShow().getIDshow() + "');";
                stmt.executeUpdate(sqlStatement);
            }

        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    @Override
    public Ticket getTick(int id) //récupérer un ticket grâce à un id passé en paramètres
    {
        Connection conn = null;
        try {
            DataBase dataSource = new DataBase();//connexion
            conn = dataSource.createConnection();
            Statement stmt = conn.createStatement();
            ResultSet result = stmt.executeQuery("SELECT * from `ticket` WHERE `ID_Ticket`= " + id);//requête SQL d'un ticket précis grâce à l'id en paramètre

            while (result.next())//tant qu'il y a des résultats
            {
                ShowDAO sho = new ShowDAOImp();
                CustomersDAO cust = new CustomersDAOImp();
                Customers cus = cust.getCustomerId(result.getInt(5));//implémentation du client grâce à son id dans la base de données du ticket

                Show show = sho.getShowID(result.getInt(6));
                //implémentation du client grâce à son id dans la base de données de la séance
                //implémentation du ticket correspondant
                Ticket ticketcusto = new Ticket(result.getInt(1), result.getString(2), result.getInt(4), result.getInt(3), cus, show);
                return ticketcusto;//retourne le ticket correspondant à l'id en paramètre
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return new Ticket();
    }

    @Override
    public void modifTicket(Ticket ti)//modifier le ticket en paramètre
    {
        Connection conn = null;
        try {
            DataBase dataSource = new DataBase();//connexion à la base de données
            conn = dataSource.createConnection();
            Statement stmt = conn.createStatement();
            //requête SQL pour modifier les données du ticket en paramètre
            String sqlStatement = "UPDATE ticket "
                    + "ID =" + ti.getIDTicket() + "Date =" + ti.getDate() + "NbTicket =" + ti.getnbTicket() + "Price =" + ti.getCust().m_IdCustomers + "Show" + ti.getShow().getIDshow()
                    + "WHERE " + "id =" + ti.getIDTicket();

            stmt.executeUpdate(sqlStatement);//exécuter la requête
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
}
