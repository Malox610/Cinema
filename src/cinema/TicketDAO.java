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

public interface TicketDAO {//classe interface Ticket pour la classe qui va intéragir avec la base de données

    public ArrayList<Ticket> getTick();

    public Ticket getTick(int id);

    public void addTicket(Ticket ti);

    public void modifTicket(Ticket ti);
}
