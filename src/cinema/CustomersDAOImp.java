/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cinema;
import java.sql.*;

/**
 *
 * @author esmil
 */
public class CustomersDAOImp implements CustomersDAO{
    
      public Customers getCustomers(int id)
    {
        Connection conn = null;
        try {
            DataBase dataSource = new DataBase();
            conn = dataSource.createConnection();
            Statement stmt = conn.createStatement();
            ResultSet result = stmt.executeQuery("select * from Customers where id = " + id);
            while (result.next()) {            // String name , String Password , String email , int age // je sais pas ca correspond a quoi
                Customers cust =new Customers(result.getString(2) ,result.getString(2) , result.getString(3) , result.getInt(8));
                
                return cust;
                
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return new Customers();
    }
      @Override
       public void addCustomers(Customers cust)
    {
        Connection con = null;
        try {
            DataBase dataSource = new DataBase();
            con = dataSource.createConnection();
            Statement stmt = con.createStatement();
            String sqlStatement = "INSERT INTO Customers " +
                      "(Name, Email, Password, age)" +
                      " VALUES " +
                      "('" + cust.getName() + "','" + cust.getEmail() + "','" + cust.getPassword() + "','" + cust.getAge() + ")" ;
            int rows = stmt.executeUpdate(sqlStatement);
            ResultSet result = stmt.executeQuery("select * from Csutomers");
            while (result.next()) {
                if(result.getString(5).equals(cust.getEmail()))
                {
               ///     cust.setId(result.getInt(1));
                }
            }
            
            System.out.println("rows=" + rows);
          //  S1Project.patientList.add(pat);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
       
         public void modifCustomer(Customers cust)
    {
        Connection conn = null;
        try {
            DataBase dataSource = new DataBase();
            conn = dataSource.createConnection();
            Statement stmt = conn.createStatement();
            String sqlStatement = "UPDATE patient " +
                      "SET Password='" + cust.getPassword()+
                      " WHERE " +
                      "ID_customers='" + cust.getID() + "'";
            int rows = stmt.executeUpdate(sqlStatement);
            System.out.println("rows=" + rows);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
}