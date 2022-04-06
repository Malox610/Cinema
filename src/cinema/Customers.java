/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cinema;

import java.security.SecureRandom;
import java.util.ArrayList;

/**
 *
 * @author esmil
 */
public class Customers extends Humain { //classe client héritant de Humain

    String m_email; //attributs de la classe client
    int m_age;
    int m_IdCustomers = -1;
    ArrayList<Ticket> TicketList = new ArrayList<>(); //chaque client aura une liste de ticket attaché

    public Customers() { //pour les invités sans compte
        this.m_name="";
        this.m_password="";
        this.m_age=0;
        this.m_email="";
        this.m_IdCustomers=0;
    }

    public Customers(String name, String password, String email, int age, int id) {  //pour les clients avec un compte

        this.m_name=name;
        this.m_password=password;
        m_email = email;
        m_age = age;
        m_IdCustomers = id;
        /*  SecureRandom random = new SecureRandom();
         m_IdCustomers= random.nextInt(); // besoin de verifier s'il cette ID n'existe pas deja
         */
    }


    public void setPassword(String pass) { //fonction qui implémente et chiffre le mot de passe des clients

        SecureRandom random2 = new SecureRandom(); //déclaration d'un objet pour chiffrer les mdp
        boolean randclé = random2.nextBoolean();
        String Xclé = ""; //première clé de chiffrage
        String Xclé2 = ""; //deuxième clé de chiffrage
        if (randclé == false) {
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
    
    public String getEmail() {return m_email;}
    public int getAge() {return m_age;}
    @Override
    public String getName() {return this.m_name;}
    @Override
    public String getPassword() {return this.m_password;}
    public int getIDCustomer() {return m_IdCustomers;}
    public ArrayList<Ticket> getTicket(){return TicketList;}
    public void setEmail(String email) {this.m_email = email;}
    public void setID(int id) {this.m_IdCustomers = id;}
    public void setAge(int age) {this.m_age = age;}
    
    public void addTickets(Ticket myticket){
        TicketList.add(myticket);
    }
    
    @Override
    public String toString(){
        String str="";
        for(Ticket tick: TicketList)
        {
            str += " " + tick.toString();
        }
        return "Customer -" + "Name" + m_name + ", email" + m_email + ", age" + m_age + ", id" + m_IdCustomers + ", password" + m_password + "-";
    }

}
