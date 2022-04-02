/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cinema;

import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author thomas
 */


public class TicketDAOImp implements TicketDAO{

    public ArrayList<Ticket> getTick()
    {
        ArrayList<Ticket> TicketList = new ArrayList<>();
        Connection conn = null;
        try {
            DataBase dataSource = new DataBase();
            conn = dataSource.createConnection();
            Statement stmt = conn.createStatement();
            ResultSet result = stmt.executeQuery("SELECT * from ticket");
                                
            while(result.next())
            {
                for (int j=0; j< Cinema.ShowList.size(); ++j){
                    for (int k=0; k< Cinema.CustList.size(); ++k){
                        if(Cinema.ShowList.get(j).getIDshow()==result.getInt(6) && Cinema.CustList.get(k).getIDCustomer()==result.getInt(1)){
                            
                        }
                    }
                }
            }
        } catch (SQLException e){
            System.out.println(e);
        }
        return TicketList;
    }

    public void addTicket(Ticket ti)
    {
      
    }

    public void deleteTicket(Ticket ti)
    {

    }

    public Ticket getTick(int id)
    {
        Ticket TicketCusto;
        Connection conn = null;
        try {
            DataBase dataSource = new DataBase();
            conn = dataSource.createConnection();
            Statement stmt = conn.createStatement();
            ResultSet result = stmt.executeQuery("SELECT t.date, t.nbticket, t.id_customer, t.id_show FROM ticket t" 
                                + "INNER JOIN show s ON s.id_show=t.id_show" + "INNER JOIN customer c ON c.id_customer=t.id_customer"
                                + "WHERE s.date = t.date");
                                
            while(result.next())
            {
                
            }
        } catch (SQLException e){
            System.out.println(e);
        }
        return TicketCusto;
    }

    public void modifTicket(Ticket ti)
    {

    }
}
