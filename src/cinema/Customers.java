/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cinema;
import java.security.SecureRandom;   

/**
 *
 * @author esmil
 */
public class Customers extends Humain
{
    String m_email ;
    int m_age;
    int m_IdCustomers =-1 ;
    
    public Customers ()
    { //For guest 
        SecureRandom random = new SecureRandom();
         m_IdCustomers= random.nextInt(); // besoin de verifier s'il cette ID n'existe pas deja 
    
    }
    
    public Customers(String nom , String Password , String email , int age )
    {
        //create object for customer who are connected 
        
        this.m_nom= nom ;
        this.m_password=Password;
        m_email = email ;
        m_age= age ;
         SecureRandom random = new SecureRandom();
         m_IdCustomers= random.nextInt(); // besoin de verifier s'il cette ID n'existe pas deja 
        
                
    }
    
    
    
    
    
}
