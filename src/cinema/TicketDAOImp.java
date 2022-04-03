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

    @Override
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
                            Ticket tick = new Ticket(result.getInt(1),result.getString(2),result.getInt(4),result.getInt(3) ,Cinema.CustList.get(k), Cinema.ShowList.get(j));
                            Cinema.CustList.get(k).getTicket().add(tick);
                        }
                    }
                }
            }
        } catch (SQLException e){
            System.out.println(e);
        }
        return TicketList;
    }

    @Override
    public void addTicket(Ticket ti)
    {
        Connection con = null;
        try {
            DataBase dataSource = new DataBase();
            con = dataSource.createConnection();
            Statement stmt = con.createStatement();
            String sqlStatement = "INSERT INTO ticket (`ID_Ticket`, `date`, `price`, `nb_ticket`, `id_customer`, `id_show`) "
                    + "VALUES ('" + ti.getIDTicket() + "', '" + ti.getDate() + "', '" + ti.getprice() + "', '" + ti.getnbTicket() + "', '" + ti.getCust().getIDCustomer() + "', '" + ti.getShow().getIDshow() + "');";
            stmt.executeUpdate(sqlStatement);

        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    @Override
    public Ticket getTick(int id)
    {
        Connection conn = null;
        try {
            DataBase dataSource = new DataBase();
            conn = dataSource.createConnection();
            Statement stmt = conn.createStatement();
            ResultSet result = stmt.executeQuery("SELECT t.date, t.nb_ticket, t.id_customer, t.id_show" + "FROM ticket t " 
                                + "INNER JOIN customer c ON c.id_customer=t.id_customer");
                                
            while(result.next())
            {
                for(int i=0; i < Cinema.ShowList.size();++i){
                        if(Cinema.ShowList.get(i).m_IDshow == result.getInt(6)){
                            Ticket ticketcusto = new Ticket(result.getInt(1), result.getString(2), result.getInt(3), result.getInt(4), Cinema.CustList.get(id), Cinema.ShowList.get(i));
                        }
                }
            }
        } catch (SQLException e){
            System.out.println(e);
        }
        return new Ticket();
    }

    @Override
    public void modifTicket(Ticket ti)
    {
     Connection conn = null;
        try {
            DataBase dataSource = new DataBase();
            conn = dataSource.createConnection();
            Statement stmt = conn.createStatement();
            String sqlStatement = "UPDATE ticket " + 
                    "ID =" + ti.getIDTicket() + "Date =" + ti.getDate() + "NbTicket =" + ti.getnbTicket() + "Price =" + ti.getCust().m_IdCustomers + "Show" + ti.getShow().getIDshow()
                    + "WHERE " + "id =" + ti.getIDTicket();
            
            stmt.executeUpdate(sqlStatement);
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
}
