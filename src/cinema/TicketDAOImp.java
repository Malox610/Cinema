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
        ArrayList<Ticket> ticketList= new ArrayList<>();
        Connection conn = null;

        return ticketList;
    }

    public void addTicket(Ticket ti)
    {
      
    }

    public void deleteTicket(Ticket ti)
    {

    }

    public Ticket getTick(int id)
    {
        return null;
    }

    public void modifTicket(Ticket ti)
    {

    }
}
