/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cinema;

import Menu.*;
import java.util.*;

/**
 *
 * @author esmil
 */
public class Cinema {
    public static ArrayList<Films> listeFilm =new ArrayList<>();
    public static ArrayList<Customers> custList =new ArrayList<>();
    public static Customers cust =new Customers();
    
    public Cinema()
    {
        CustomersDAO cust = new CustomersDAOImp();
        custList=cust.getCustomers();
    }
    
    
    public static void main(String[] args) {
        // TODO code application logic here
            Cinema c =new Cinema();
             WelcomePage a =new WelcomePage();
             a.setVisible(true);
    }
    
}
