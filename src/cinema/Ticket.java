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
    
   private int m_IDticket;
   private String m_Date;
   private int m_nbTicket;
   private int m_price;
   private Customers m_Cust;
   private Show m_Show;
   
    public Ticket()
    {
       this.m_IDticket=0;
       this.m_Date="";
       this.m_nbTicket=0;
       this.m_price=0;
       this.m_Cust=null;
       this.m_Show=null;
    }
    
    public Ticket( int IDTicket , String Date,int nbTicket,int price,Customers cust, Show show)
    {
        m_IDticket=IDTicket;
        m_Date= Date;
        m_nbTicket=nbTicket;
        m_price=price ;
        m_Cust=cust;
        m_Show=show;
    }
    
     int getIDTicket()
     {
         return m_IDticket;
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
    Customers getCust()
     {
         return m_Cust;
     }

    Show getShow()
     {
         return m_Show;
     }
   
    
    public void setIdticket(int id){
        this.m_IDticket=id;
    }
    
    public void setPrice(int price){
        this.m_price=price;
    }
        
    public void setnbTicket(int nbticket){
        this.m_nbTicket=nbticket;
    }
    
    public void setDate(String date){
        this.m_Date = date;
    }
    
    public void setCustomer(Customers custo){
        this.m_Cust=custo;
    }
    
    public void setShow(Show showe){
        this.m_Show=showe;
    }
  

    public String toString(){
        return "Ticket -" + "Movie: " + m_Show.m_movie.m_title + "Customer: " + m_Cust.m_name + "Date: " + "Ticket id: " + m_IDticket + "Price: " + m_price + "Number of people: " + m_nbTicket+ "-";
    }
   
}
