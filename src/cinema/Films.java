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
public class Films {
   protected  String m_title;
   protected  String m_director;
   protected  String m_genre;
   protected  String m_time;
   protected  String m_synopsis;
   protected  int m_IDmovie =-1 ; 
     // ajouter du le truc pour mettre les images

    /**
     *
     */
    public Films()
    {
      
    }
    public Films (String title , String director , String genre , String time , int IDmovie , String synopsis)
    {
        //create object for customer who are connected 
        
         m_title= title ;
         m_director=director;
         m_genre=genre;
         m_time=time;
         m_IDmovie=IDmovie;  
         m_synopsis=synopsis;
    }
    
   public String getTitle()
    {
    return m_title ;
    }
    
  public  String getDirector()
    {
    return m_director ;
    }
    
  public  String getGenre()
    {
    return m_genre ;
    }
  public   String getTime()
    {
    return m_time ;
    }
  public   String getSynopsis()
     {
     return m_synopsis;
     }
     
    public int getIDMovie()
     {
         return m_IDmovie;
     }
    
    
}
