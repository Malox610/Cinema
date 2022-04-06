/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cinema;

/**
 *
 * @author esmil
 */
abstract public class Humain {//classe mère (abstraite) de employé et client

    
  protected String m_name ;//attributs
  protected String m_password;
  
  
  public Humain(){};
  
  public String getName(){ return m_name;}
  public String getPassword(){ return m_password;}


  @Override
  public String toString(){
      return "Humain -" + "Name" + m_name + ", password" + m_password + "-";
  }
}
