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
public interface ShowDAO {

    public ArrayList<Show> getShow();
    public ArrayList<Show> getShow(int id);
    public Show getShowID_Date(int idmovie , String Date);
     public Show getShowID(int id );
    public void addShow(Show sho);
    public void deleteShow(Show sho);
    public void UpdateSeat(Show sho);

}
