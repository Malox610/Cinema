/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Menu;

import cinema.*;

/**
 *
 * @author esmil
 */
public class Projet {

    public static int connectid = 0;
    public static int Prix1 = 15;
    public static int Prix2 = 15;
    public static int Prix3 = 15;
    public static int Prix4 = 12;

    public static int FilmID1 = 1999;
    public static int FilmID2 = 2001;
    public static int FilmID3 = 2006;
    public static int FilmID4 = 1995;
    public static int FilmID5 = 2014;
    public static int FilmID6 = 2009;

    public static void main(String[] args) {
        // TODO code application logic here

        Cinema c = new Cinema();
        WelcomePage g = new WelcomePage();
        g.setVisible(true);

    }
}
