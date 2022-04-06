/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cinema;

import Menu.*;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.*;
import java.awt.*;

/**
 *
 * @author esmil
 */
public class CustomersDAOImp implements CustomersDAO {//class DAO imp pour client de l'interface DAO pour client

    @Override
    public Customers getCustomerId(int id) {//récupérer l'id du client avec requête SQL sur la bdd
        Connection conn = null; //création d'un objet connexion
        try {
             DataBase dataSource = new DataBase(); //création d'un objet DataBase à partir de la classe créée
            conn = dataSource.createConnection(); //connexion avec la bdd
            Statement stmt = conn.createStatement(); //déclaration d'une requête SQL
            ResultSet result = stmt.executeQuery("SELECT * FROM customer WHERE `ID_customer` = " + id+";");
            //requête recherchant dans la table client en fonction de l'id passé en paramètre
            while (result.next()) { //tant qu'il y a des clients ressortant de cette recherche
                String mdp =result.getString(4); //récupération du mot de passe
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
        
       
        
        for(int j =2 ; j<ch.length ; j++)//chiffrage du mot de passe
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

    @Override
    public Customers getCustomersConnexion(String login, String password) {//connexion des clients sur l'interface
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
           dechiffre+=c;//rajout du chiffrage
       }
                Customers cust = new Customers(result.getString(2), dechiffre, result.getString(3), result.getInt(5), result.getInt(1));
                Projet.connectid =result.getInt(1);
                return cust;
             }
              if(result.next()==false)
              {
            // JOptionPane.showMessageDialog(null, "Wrong user/password", "OK", JOptionPane.YES_OPTION);
                  System.out.println("Error wrong Login/password");
              }
            
        } catch (SQLException e) {
            System.out.println(e);
        }
        
        return new Customers();
    }

    @Override
    public ArrayList<Customers> getCustomers() {//récupérer la liste de tout les clients
        ArrayList<Customers> CustList = new ArrayList<>();
        Connection conn = null;
        try {
            DataBase dataSource = new DataBase();
            conn = dataSource.createConnection();
            Statement stmt = conn.createStatement();
            ResultSet result = stmt.executeQuery("select * from customer");//tout les clients de la table

            while (result.next()) {//récupérer de toute les datas des clients et création des objets clients
                Customers cust = new Customers(result.getString(2), result.getString(4), result.getString(3), result.getInt(5), result.getInt(1));

                CustList.add(cust);//ajout du client à la liste
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return CustList;
    }

    @Override
    public void addCustomers(Customers cust) {//ajouter un client
        Connection con = null;
        try {
            DataBase dataSource = new DataBase();//connexion à la database
            con = dataSource.createConnection();
            Statement stmt = con.createStatement();
            String sqlStatement = "INSERT INTO `customer`(`ID_customer`, `name`, `email`, `password`, `age`) VALUES ('" + cust.getIDCustomer() + "','" + cust.getName() + "','" + cust.getEmail() + "','" + cust.getPassword() + "','" + cust.getAge() + "')";
            //requête pour ajouter dans la base de données les datas du client en paramètre
            stmt.executeUpdate(sqlStatement);
            //int rows = stmt.executeUpdate(sqlStatement);
            ResultSet result = stmt.executeQuery("select * from customer");
            while (result.next()) {//ajouter ce client à la database
                if (result.getString(3).equals(cust.getEmail())) { //si le mail du client en paramètre est le même que celui de la requête
                    cust.setID(result.getInt(1)); //on créé un id pour le client
                }
            }

        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    @Override
    public void modifCustomer(Customers cust) {//modifier les données clients
        Connection conn = null;
        try {
            DataBase dataSource = new DataBase();//connexion base de données
            conn = dataSource.createConnection();
            Statement stmt = conn.createStatement();
            String sqlStatement = "UPDATE `customer` "//requête SQL pour trouver le mot de passe et le modifier du client
                    + "SET `password` = '" + cust.getPassword()
                    + " 'WHERE "
                    + "`ID_customer`= " + cust.getIDCustomer() + " ;";
            stmt.executeUpdate(sqlStatement);//effectue la requête
           
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

}
