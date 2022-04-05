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
public class Employee extends Humain {
    
    String m_job;
    int m_IDEmployee =-1 ;
    
    public Employee (int id, String Password, String job)
    {
        //create object for customer who are connected
        super(Password);
        m_job=job;
        m_IDEmployee=id;
          
    }
    
    public Employee()
    {
    }
}
