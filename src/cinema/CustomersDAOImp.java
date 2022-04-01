/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cinema;

import Menu.*;
import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author esmil
 */
public class CustomersDAOImp implements CustomersDAO {

    public Customers getCustomerId(int id) {
        Connection conn = null;
        try {
            DataBase dataSource = new DataBase();
            conn = dataSource.createConnection();
            Statement stmt = conn.createStatement();
            ResultSet result = stmt.executeQuery("SELECT * FROM customer WHERE `ID_customer` = " + id+";");
            while (result.next()) {    
                String mdp =result.getString(4);
        char[] ch =mdp.toString().toCharArray();
        int clé = ch[0];
        int clé2 =ch[1];
        switch(clé){
            case 49: 
                clé =1 ;
                break;
                case 50: 
                clé =2 ;
                break;
                case 51: 
                clé =3 ;
                break;
                case 52: 
                clé =4 ;
                break;
                case 53: 
                clé =5 ;
                break;
                case 54: 
                clé =6 ;
                break;
                case 55: 
                clé =7 ;
                break;
                case 56: 
                clé =8 ;
                break;
                 case 57: 
                clé =9 ;
                break;
                
            default:
                clé =0 ;
                break;
        }
        
       
        
        for(int j =2 ; j<ch.length ; j++)
        {
            if(clé2==49)
            { 
                ch[j] =(char)((int)ch[j]-clé); 
            }else if(clé2==48)
            {
            ch[j] =(char)((int)ch[j]+clé); 
            }
        }
        String dechiffre ="";
      for(char c : ch)
       {
           dechiffre+=c;//rajoue du chiffrage
       }
                // String name , String Password , String email , int age 
                Customers cust = new Customers(result.getString(2), dechiffre, result.getString(3), result.getInt(5), result.getInt(1));

                return cust;

            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return new Customers();
    }

    public Customers getCustomersConnexion(String login, String password) {
        Connection conn = null;
        try {
            DataBase dataSource = new DataBase();
            conn = dataSource.createConnection();
            Statement stmt = conn.createStatement();
         //   String sqlquery ="SELECT * FROM customer WHERE `email` = '" + login + "' AND `password` = '" + password+"';";
          String sqlquery ="SELECT * FROM customer WHERE `email` = '" + login +"';";
            ResultSet result = stmt.executeQuery(sqlquery);
              
             while (result.next()) {// String name , String Password , String email , int age , int idcustomer
                 String mdp =result.getString(4);
        char[] ch =mdp.toString().toCharArray();
        int clé = ch[0];
        int clé2 =ch[1];
        switch(clé){
            case 49: 
                clé =1 ;
                break;
                case 50: 
                clé =2 ;
                break;
                case 51: 
                clé =3 ;
                break;
                case 52: 
                clé =4 ;
                break;
                case 53: 
                clé =5 ;
                break;
                case 54: 
                clé =6 ;
                break;
                case 55: 
                clé =7 ;
                break;
                case 56: 
                clé =8 ;
                break;
                 case 57: 
                clé =9 ;
                break;
                
            default:
                clé =0 ;
                break;
        }
        
       
        
        for(int j =2 ; j<ch.length ; j++)
        {
            if(clé2==49)
            { 
                ch[j] =(char)((int)ch[j]-clé); 
            }else if(clé2==48)
            {
            ch[j] =(char)((int)ch[j]+clé); 
            }
        }
        String dechiffre ="";
      for(char c : ch)
       {
           dechiffre+=c;//rajoue du chiffrage
       }
                Customers cust = new Customers(result.getString(2), dechiffre, result.getString(3), result.getInt(5), result.getInt(1));
                Projet.connectid =result.getInt(1);
                return cust;
             }
            
        } catch (SQLException e) {
            System.out.println(e);
        }
        return new Customers();
    }

    public ArrayList<Customers> getCustomers() {
        ArrayList<Customers> custList = new ArrayList<>();
        Connection conn = null;
        try {
            DataBase dataSource = new DataBase();
            conn = dataSource.createConnection();
            Statement stmt = conn.createStatement();
            ResultSet result = stmt.executeQuery("select * from customer");

            while (result.next()) {
                Customers cust = new Customers(result.getString(2), result.getString(4), result.getString(3), result.getInt(5), result.getInt(1));

                custList.add(cust);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return custList;
    }

    @Override
    public void addCustomers(Customers cust) {
        Connection con = null;
        try {
            DataBase dataSource = new DataBase();
            con = dataSource.createConnection();
            Statement stmt = con.createStatement();
            String sqlStatement = "INSERT INTO `customer`(`ID_customer`, `name`, `email`, `password`, `age`) VALUES ('" + cust.getID() + "','" + cust.getName() + "','" + cust.getEmail() + "','" + cust.getPassword() + "','" + cust.getAge() + "')";
            stmt.executeUpdate(sqlStatement);
            //int rows = stmt.executeUpdate(sqlStatement);
            ResultSet result = stmt.executeQuery("select * from customer");
            while (result.next()) {
                if (result.getString(3).equals(cust.getEmail())) {
                    cust.setID(result.getInt(1));
                }
            }

            // System.out.println("rows=" + rows);
            //  S1Project.patientList.add(pat);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void modifCustomer(Customers cust) {
        Connection conn = null;
        try {
            DataBase dataSource = new DataBase();
            conn = dataSource.createConnection();
            Statement stmt = conn.createStatement();
            String sqlStatement = "UPDATE `customer` "
                    + "SET `password` = '" + cust.getPassword()
                    + " 'WHERE "
                    + "`ID_customer`= " + cust.getID() + " ;";
            stmt.executeUpdate(sqlStatement);
            //  System.out.println("rows=" + rows);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
