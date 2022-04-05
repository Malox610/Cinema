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
public interface EmployeeDAO {
    public Employee getEmployee(int id);
     public Employee getEmployeeConnexion( String job);
    
}
