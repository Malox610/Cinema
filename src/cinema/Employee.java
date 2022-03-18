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
public class Employee extends Humain {
    
      String m_job;
      int m_IDEmployee =-1 ;
    
    
    
    
    public Employee (String name , String Password , String job  )
    {
        //create object for customer who are connected 
        
        this.m_name= name ;
        this.m_password=Password;
        m_job=job;
         SecureRandom random = new SecureRandom();
         m_IDEmployee= random.nextInt(); // besoin de verifier s'il cette ID n'existe pas deja 
        
                
    }

    Employee() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
