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
    
    public static void main(String[] args) {
        // TODO code application logic here
             WelcomePage a =new WelcomePage();
             a.setVisible(true);
    }
    
}
