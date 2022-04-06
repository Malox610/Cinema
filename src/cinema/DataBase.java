/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cinema;
import java.io.File;
import java.sql.*;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author esmil
 */
public class DataBase {
    //classe pour charger le driver
    String filename =null;
    public static String path;
     Connection con = null;
 
    
    public Connection createConnection()//connexion avec la database
    {
        try
        {
            String URL = "jdbc:mysql://localhost:3306/cinebdd";//chargement de la page phpmyadmin
            String login = "root";
            String password = "";
            con=DriverManager.getConnection(URL, login, password);
            
        }catch (SQLException e) {
            System.out.println(e);
            return null;
        }
        return con;
    }
    public void filen()//méthode de recup et chargement d'images depuis la base de données
    {
        try{
        JFileChooser chooser = new JFileChooser();
        chooser.setDialogTitle("choose an image");
        chooser.setApproveButtonText("add an image");
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        filename=f.getAbsolutePath();
        this.path=(filename);
        }catch(Exception e)//dwxfqe
        {
           System.out.println(e);
        JOptionPane.showMessageDialog(null , "Please choose an image");
        }
    }
    
    public String getp(){
             return path;
    }
    
}
