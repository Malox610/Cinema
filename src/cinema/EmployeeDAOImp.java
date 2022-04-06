/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cinema;

import Menu.Projet;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author esmil
 */
public class EmployeeDAOImp implements EmployeeDAO{
    
        @Override
        public Employee getEmployee(int id) //retourne le bon employé à partir de l'id de l'employé en paramètre
    {
        Connection conn = null;
        try {
            DataBase dataSource = new DataBase(); //connexion avec la base de donnée
            conn = dataSource.createConnection();
            Statement stmt = conn.createStatement();
            ResultSet result = stmt.executeQuery("select * from `employee` where `ID_employee`  = '" + id+"';");//requête SQL pour afficher le bon employé
            while (result.next()) {            // String name , String Password , String job
                  //récupération des données associées à l'employé qui a cette id
                 Employee emp = new Employee(result.getInt(1),result.getString(2) ,result.getString(3));
                return emp;
                
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return new Employee();
    }
        
        public Employee getEmployeeConnexion( String job) {//connexion d'un employé sur l'interface via son job  
        Connection conn = null;
        try {
            DataBase dataSource = new DataBase();
            conn = dataSource.createConnection();
            Statement stmt = conn.createStatement();
         //   String sqlquery ="SELECT * FROM customer WHERE `email` = '" + login + "' AND `password` = '" + password+"';";
          String sqlquery ="SELECT * FROM `employee` WHERE `job` = '" + job +"';";
            ResultSet result = stmt.executeQuery(sqlquery);
              
             while (result.next()) {// String name , String Password , String email , int age , int idcustomer
             
                 Employee emp = new Employee(result.getInt(1),result.getString(2) ,result.getString(3));
             
                return emp;
             }
            
        } catch (SQLException e) {
            System.out.println(e);
        }
        return new Employee();
        }
    
}

