/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cinema;

/**
 *
 * @author thomas
 */

import java.util.ArrayList;

public interface TicketDAO {
    public ArrayList<Ticket> getApp();
    public Ticket getApp(int id);
    public void addAppointment(Ticket ap);
    public void modifAppointment(Ticket ap);
    public void deleteAppointment(Ticket ap);
}