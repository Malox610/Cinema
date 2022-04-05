/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cinema;

import Menu.*;
import java.util.*;

/**
 *
 * @author esmil
 */
public class Cinema {
    public static ArrayList<Show> ShowList =new ArrayList<>();
    public static ArrayList<Customers> CustList =new ArrayList<>();
    public static ArrayList<Films> FilmList =new ArrayList<>();
    public static ArrayList<Ticket> TicketList = new ArrayList<>();
    
    public Cinema()
    {
     /*  CustomersDAO cust = new CustomersDAOImp();
       CustList=cust.getCustomers();*/
       ShowDAO sho =new ShowDAOImp();
      
       FilmDAO fil =new FilmDAOImp();
       FilmList=fil.getFilm();   
        ShowList=sho.getShow();
       TicketDAOImp tick = new TicketDAOImp();
       TicketList = tick.getTick();
    System.out.println("dddd");
    }
    
    
    public static void main(String[] args) {
        // TODO code application logic here
            Cinema c =new Cinema();
             WelcomePage a =new WelcomePage();
             a.setVisible(true);
    }
    
}
