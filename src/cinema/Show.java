/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cinema;

import javax.swing.JOptionPane;

/**
 *
 * @author esmil
 */
public class Show {//classe des séances
    protected int m_IDshow;//attributs
    protected String m_Date;
    protected int m_nbseat;
    protected int m_room ;
    protected Films m_movie;
    
    public Show()//onstructeur par défaut 
    {
    
    }
    
    public Show( int IDshow , String Date,int nbseat,int room ,Films idmovie)//constructeur par paramètre
    {
        m_IDshow=IDshow;
        m_Date= Date;
        m_nbseat=nbseat;
        m_room =room ;
        m_movie=idmovie;
    
    }
    
    //getters
     public int getIDshow()
     {
         return m_IDshow;
     }
     
    public String getDate()
    {
    return m_Date ;
    }
    
   public  int getNbSeat()
     {
         return  m_nbseat;
     }
     
    public int getRoom()
     {
      return m_room ;
     }
    public Films getMovie()
     {
         return m_movie;
     }
    //setters
  public  void setNbSeat(int nbticket)
    {
        int newnombre=m_nbseat-nbticket;
        if(newnombre>=0)
        {
        m_nbseat=newnombre;
        
        }else // condition pas possible pour commander ses tickets
        {
         JOptionPane.showMessageDialog(null, "You have taken too much ticket");
        }
        
    
    }
    
}
