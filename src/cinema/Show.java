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
public class Show {
    protected int m_IDshow;
   protected String m_Date;
   protected int m_nbseat;
   protected int m_room ;
    protected Films m_movie;
    
    public Show()
    {
    
    }
    
    public Show( int IDshow , String Date,int nbseat,int room ,Films idmovie)
    {
        m_IDshow=IDshow;
        m_Date= Date;
        m_nbseat=nbseat;
        m_room =room ;
        m_movie=idmovie;
    
    }
    
     int getIDshow()
     {
         return m_IDshow;
     }
     
    String getDate()
    {
    return m_Date ;
    }
    
     int getNbSeat()
     {
         return  m_nbseat;
     }
     
    public int getRoom()
     {
      return m_room ;
     }
    public Films getIdMovie()
     {
         return m_movie;
     }
    
    void setNbSeat(int nbticket)
    {
        int newnombre=m_nbseat-nbticket;
        if(newnombre>=0)
        {
        m_nbseat=newnombre;
        
        }else
        {
         JOptionPane.showMessageDialog(null, "You have taken too much ticket");
        }
        
    
    }
    
}
