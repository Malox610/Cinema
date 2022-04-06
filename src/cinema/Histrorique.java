/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cinema;

/**
 *
 * @author esmil
 */
public class Histrorique {//classe historique de commande
    int m_idTicket; //Attributs
    String m_Date ;
    int m_nbTicket;
    Customers m_cust;
    Films m_film;
    
    
    public Histrorique()//constructeur par défaut
    {
        m_idTicket=0;
     m_Date ="";
     m_nbTicket=0;
    Customers m_cust=null;
    Films m_film=null;
     
    }
    
    
      //constructeur par paramètres
    public Histrorique(int idTicket,String Date , int nbTicket , int idCust,int IdShow)
    {
        m_idTicket=idTicket;
     m_Date =Date;
     m_nbTicket= nbTicket;
     CustomersDAO cus= new CustomersDAOImp();
     ShowDAO sho = new ShowDAOImp();
     Show show = sho.getShowID(IdShow);
     m_film=show.getMovie();
     m_cust=cus.getCustomerId(idCust);

     
    }
//getters
    public String getM_Date() {
        return m_Date;
    }

    public int getM_nbTicket() {
        return m_nbTicket;
    }

    public Customers getM_cust() {
        return m_cust;
    }

    public Films getM_film() {
        return m_film;
    }

    public int getM_idTicket() {
        return m_idTicket;
    }
    
    
}
