/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cinema;

import java.security.SecureRandom;

/**
 *
 * @author esmil
 */
public class Customers extends Humain {

    String m_email;
    int m_age;
    int m_IdCustomers = -1;

    public Customers() { //For guest 

    }

    public Customers(String name, String Password, String email, int age, int id) {
        //create object for customer who are connected 

        this.m_name = name;
        this.m_password = Password;
        m_email = email;
        m_age = age;
        m_IdCustomers = id;
        /*  SecureRandom random = new SecureRandom();
         m_IdCustomers= random.nextInt(); // besoin de verifier s'il cette ID n'existe pas deja 
        
         */
    }

    public String getEmail() {
        return m_email;
    }

    public int getAge() {
        return m_age;
    }

    public String getName() {
        return this.m_name;
    }

    public String getPassword() {
        return this.m_password;
    }

    public void setPassword(String pass) {
        
        SecureRandom random2 = new SecureRandom();
        boolean randclé = random2.nextBoolean();
        String Xclé = "";
        String Xclé2 = "";
        if (randclé == true) {
            Xclé2 = "1";
        }
        if (randclé == true) {
            Xclé2 = "0";
        }
        int randclé2 = random2.nextInt(10);
        Xclé = String.valueOf(randclé2);
        pass = Xclé + Xclé2 + pass;
        char[] ch = pass.toString().toCharArray();
        int clé = ch[0];
        int clé2 = ch[1];

        System.out.println(clé);

        for (int j = 2; j < ch.length; j++) {
            if (clé2 == 49) {
                ch[j] = (char) ((int) ch[j] + clé);
            } else if (clé2 == 48) {
                ch[j] = (char) ((int) ch[j] - clé);
            }

            System.out.println(ch[j] + "-->" + (int) ch[j]);
        }
        String chiffre = "";
        for (char c : ch) {
            chiffre += c;//rajoue du chiffrage
        }
        this.m_password = chiffre;
    }

    public int getID() {
        return m_IdCustomers;
    }

    public void setID(int id) {
        this.m_IdCustomers = id;
    }

}
