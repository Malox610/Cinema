/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cinema;

import java.util.ArrayList;

/**
 *
 * @author esmil
 */
public interface CustomersDAO {

    public Customers getCustomersConnexion(String login, String password);

    public Customers getCustomerId(int id);

    public ArrayList<Customers> getCustomers();

    public void addCustomers(Customers cust);
    
    public void modifCustomer(Customers cust);
            

}
