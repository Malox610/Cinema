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
    public int Prix1 = 15;
    public int Prix2 = 15;
    public int Prix3 = 15;
    public int Prix4 = 12;

    public int FilmID1 = 1999;
    public int FilmID2 = 2001;
    public int FilmID3 = 2006;
    public int FilmID4 = 1995;

    public static void main(String[] args) {
        // TODO code application logic here

        Cinema c = new Cinema();
        WelcomePage g = new WelcomePage();
        g.setVisible(true);

    }
}
