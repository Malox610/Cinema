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
public class DataBase {
    //classe pour charger le driver
    
     Connection con = null;
 
    
    public Connection createConnection()
    {
        try
        {
            String URL = "jdbc:mysql://localhost:3306/cinebdd";
            String login = "root";
            String password = "";
            con=DriverManager.getConnection(URL, login, password);
            
        }catch (SQLException e) {
            System.out.println(e);
        }
        return con;
    }
    
}
