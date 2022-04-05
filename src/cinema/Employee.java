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
    
    public Employee (int id, String job, String Password)
    {
        //create object for customer who are connected
        this.m_password=Password;
        m_job=job;
        m_IDEmployee=id;
          
    }

    public String getM_job() {
        return m_job;
    }

    public int getM_IDEmployee() {
        return m_IDEmployee;
    }

    public String getM_name() {
        return m_name;
    }

    public String getM_password() {
        return m_password;
    }
    
    public Employee()
    {
    }
}
