/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Menu;
import cinema.*;
import javax.swing.JOptionPane;
import java.util.*;

/**
 *
 * @author esmil
 */
public class SignInPage extends javax.swing.JFrame {

    /** Creates new form SignInPage */
    public SignInPage() {
        initComponents();
       ArrayList<Customers> customers =new ArrayList<>();
       customers=Cinema.custList;
       System.out.print("");
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        BackButtonName = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Mail = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        ConnexionButton = new javax.swing.JButton();
        password = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        CreerComptePassword = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));

        BackButtonName.setBackground(new java.awt.Color(0, 0, 0));
        BackButtonName.setFont(new java.awt.Font("Showcard Gothic", 0, 12)); // NOI18N
        BackButtonName.setText("Back");
        BackButtonName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonNameActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Showcard Gothic", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(240, 240, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("SE Connecter");

        Mail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MailActionPerformed(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(240, 240, 0));
        jLabel3.setFont(new java.awt.Font("Showcard Gothic", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 0));
        jLabel3.setText("PASSWORD");

        jLabel2.setBackground(new java.awt.Color(240, 240, 0));
        jLabel2.setFont(new java.awt.Font("Showcard Gothic", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 0));
        jLabel2.setText("Email");

        ConnexionButton.setBackground(new java.awt.Color(240, 240, 0));
        ConnexionButton.setFont(new java.awt.Font("Showcard Gothic", 0, 18)); // NOI18N
        ConnexionButton.setText("Connecter");
        ConnexionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConnexionButtonActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(240, 240, 0));
        jLabel4.setText("Vous n'avez pas encore de compte ?");

        CreerComptePassword.setBackground(new java.awt.Color(240, 240, 0));
        CreerComptePassword.setFont(new java.awt.Font("Showcard Gothic", 0, 18)); // NOI18N
        CreerComptePassword.setText("Créer un compte");
        CreerComptePassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreerComptePasswordActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ConnexionButton)
                .addGap(402, 402, 402))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(Mail, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(BackButtonName)
                                .addGap(286, 286, 286)
                                .addComponent(jLabel1))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(230, 230, 230)
                        .addComponent(jLabel4)
                        .addGap(26, 26, 26)
                        .addComponent(CreerComptePassword)))
                .addContainerGap(259, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(69, 69, 69)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Mail)
                            .addComponent(jLabel2))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(BackButtonName))
                .addGap(55, 55, 55)
                .addComponent(ConnexionButton)
                .addGap(53, 53, 53)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(CreerComptePassword))
                .addContainerGap(71, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 2, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackButtonNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BackButtonNameActionPerformed

    private void ConnexionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConnexionButtonActionPerformed
        // TODO add your handling code here:
        
        boolean conn = false;
      
       String clienttmail = Mail.getText();
       char[] clientpassword = password.getPassword();
       String pass = "";
       for(char c : clientpassword)
       {
           pass+=c;//rajoue du chiffrage
       }
       
       for(Customers s : Cinema.custList )
       {
           String mail = s.getEmail();
           if(mail.equals(clienttmail))
           {
               if(s.getPassword().equals(pass))
               {
                   conn = true;
                   Projet.connectid = s.getID();
                   Cinema.cust=s;
                   WelcomePage a = new WelcomePage();
                   a.setVisible(true);
                   this.setVisible(false);
               }
           }
       }
       if(conn==false)
       {
          JOptionPane.showMessageDialog(null, "Wrong user/password"); 
       }
        
        
       
    }//GEN-LAST:event_ConnexionButtonActionPerformed

    private void CreerComptePasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreerComptePasswordActionPerformed
        // TODO add your handling code here:
       SignUpPage a =new SignUpPage();
       a.setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_CreerComptePasswordActionPerformed

    private void MailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MailActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SignInPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignInPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignInPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignInPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignInPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackButtonName;
    private javax.swing.JButton ConnexionButton;
    private javax.swing.JButton CreerComptePassword;
    private javax.swing.JTextField Mail;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPasswordField password;
    // End of variables declaration//GEN-END:variables

}
