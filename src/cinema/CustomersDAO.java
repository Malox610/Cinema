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
public interface CustomersDAO {
    
     public Customers getCustomers(int id);
    public void addCustomers(Customers cust);
    
}
