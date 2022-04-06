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
     public static ArrayList<Show> ShowList =new ArrayList<>(); //Liste des séances
    public static ArrayList<Customers> CustList =new ArrayList<>(); //Liste des clients
    public static ArrayList<Films> FilmList =new ArrayList<>(); //Liste des films
    public static ArrayList<Ticket> TicketList = new ArrayList<>(); //Liste des tickets
    
    public Cinema()//constructeur
    {
     /*  CustomersDAO cust = new CustomersDAOImp();
       CustList=cust.getCustomers();*/
       ShowDAO sho =new ShowDAOImp();//déclaration d'un objet séance vide
      
        FilmDAO fil =new FilmDAOImp(); //déclaration d'un objet film vide
       FilmList=fil.getFilm(); //on récupère tout les films dispo dans la bdd
        ShowList=sho.getShow(); //on récupère les séances dispo dans la bdd
       TicketDAOImp tick = new TicketDAOImp(); //déclaration d'un objet Ticket
       TicketList = tick.getTick(); //on récupère les tickets
    }
    
    
    public static void main(String[] args) {
        // TODO code application logic here
            Cinema c =new Cinema(); //on ouvre le cinéma
             WelcomePage a =new WelcomePage(); //on lance la partie graphique
             a.setVisible(true); //on affiche le GUI
    }
    
}
