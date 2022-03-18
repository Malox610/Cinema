/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cinema;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author esmil
 */
public class EmployeeDAOImp implements EmployeeDAO{
    
        public Employee getEmployee(int id)
    {
        Connection conn = null;
        try {
            DataBase dataSource = new DataBase();
            conn = dataSource.createConnection();
            Statement stmt = conn.createStatement();
            ResultSet result = stmt.executeQuery("select * from Customers where id = " + id);
            while (result.next()) {            // String name , String Password , String job // je sais pas ca correspond a quoi
                Employee emp =new Employee(result.getString(2) ,result.getString(2) , result.getString(3));
                
                return emp;
                
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return new Employee();
    }
    
    
}

