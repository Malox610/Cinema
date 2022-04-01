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
public class Ticket {
    
  protected int m_IDTicket;
   protected String m_Date;
   protected int m_nbTicket;
   protected int m_price;
   protected int m_idCust;
   protected int m_idShow;
   
     public Ticket()
    {
    
    }
    
    public Ticket( int IDTicket , String Date,int nbTicket,int price,int idCust ,int idShow)
    {
        m_IDTicket=IDTicket;
        m_Date= Date;
        m_nbTicket=nbTicket;
        m_price=price ;
        m_idCust=idCust;
        m_idShow=idShow;
    
    }
    
     int getIDTicket()
     {
         return m_IDTicket;
     }
     
    String getDate()
    {
    return m_Date ;
    }
    int getnbTicket()
     {
         return m_nbTicket ;
     }
    int getprice()
     {
         return m_price ;
     }
    int getIdCust()
     {
         return m_idCust;
     }
    int getIdShow()
     {
         return m_idShow;
     }
    
   
   
   
}
