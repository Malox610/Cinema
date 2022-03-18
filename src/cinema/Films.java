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
   protected  float m_review;
   protected  int m_IDmovie =-1 ; 
     // ajouter du le truc pour mettre les images

    /**
     *
     */
    public Films()
    {
       m_review=0; 
    }
    public Films (String title , String director , String genre , String time , int IDmovie )
    {
        //create object for customer who are connected 
        
         m_title= title ;
         m_director=director;
         m_genre=genre;
         m_time=time;
         m_IDmovie=IDmovie;  
    }
    
    String getTitle()
    {
    return m_title ;
    }
    
    String getDirector()
    {
    return m_director ;
    }
    
    String getGenre()
    {
    return m_genre ;
    }
     String getTime()
    {
    return m_time ;
    }
     float getReview()
     {
     return m_review;
     }
     
     int getIDMovie()
     {
         return m_IDmovie;
     }
    
    
}
