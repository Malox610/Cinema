/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cinema;

import java.util.ArrayList;

/**
 *
 * @author esmil
 */
public interface FilmDAO {
    
    public Films getFilmsID(int id);
    public ArrayList<Films> getFilm() ;
     public int getFilmsTitle(String Title);
    
}
