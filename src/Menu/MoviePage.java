/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Menu;

import cinema.*;
import menu.*;

/**
 *
 * @author esmil
 */
public class MoviePage extends javax.swing.JFrame {

    /**
     * Creates new form MoviePage
     */
    public MoviePage() {
        initComponents();

        FilmDAO movie = new FilmDAOImp();

        Films Movie1 = new Films();
        Films Movie2 = new Films();
        Films Movie3 = new Films();
        Films Movie4 = new Films();
        Films Movie5 = new Films();
        Films Movie6 = new Films();

        Movie1 = movie.getFilmsID(Projet.FilmID1);
        Movie2 = movie.getFilmsID(Projet.FilmID2);
        Movie3 = movie.getFilmsID(Projet.FilmID3);
        Movie4 = movie.getFilmsID(Projet.FilmID4);
        Movie5 = movie.getFilmsID(Projet.FilmID5);
        Movie6 = movie.getFilmsID(Projet.FilmID6);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        BackButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        Affiche1 = new javax.swing.JPanel();
        Affiche2 = new javax.swing.JPanel();
        Affiche3 = new javax.swing.JPanel();
        Affiche4 = new javax.swing.JPanel();
        MovieName1 = new javax.swing.JLabel();
        MovieYear1 = new javax.swing.JLabel();
        MovieName2 = new javax.swing.JLabel();
        MovieYear2 = new javax.swing.JLabel();
        MovieName3 = new javax.swing.JLabel();
        MovieYear3 = new javax.swing.JLabel();
        MovieYear4 = new javax.swing.JLabel();
        MovieName4 = new javax.swing.JLabel();
        Runtime1 = new javax.swing.JLabel();
        Runtime2 = new javax.swing.JLabel();
        Runtime3 = new javax.swing.JLabel();
        Runtime4 = new javax.swing.JLabel();
        MovieName5 = new javax.swing.JLabel();
        MovieYear5 = new javax.swing.JLabel();
        Affiche5 = new javax.swing.JPanel();
        Runtime5 = new javax.swing.JLabel();
        MovieYear6 = new javax.swing.JLabel();
        MovieName6 = new javax.swing.JLabel();
        Affiche6 = new javax.swing.JPanel();
        Runtime6 = new javax.swing.JLabel();
        BoutonMovie1 = new javax.swing.JButton();
        BoutonMovie3 = new javax.swing.JButton();
        BoutonMovie2 = new javax.swing.JButton();
        BoutonMovie4 = new javax.swing.JButton();
        BoutonMovie5 = new javax.swing.JButton();
        BoutonMovie6 = new javax.swing.JButton();
        BackButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(240, 240, 0));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        BackButton.setBackground(new java.awt.Color(0, 0, 0));
        BackButton.setFont(new java.awt.Font("Showcard Gothic", 0, 18)); // NOI18N
        BackButton.setText("Back");
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Showcard Gothic", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(240, 240, 0));
        jLabel1.setText("MOVIES");

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout Affiche1Layout = new javax.swing.GroupLayout(Affiche1);
        Affiche1.setLayout(Affiche1Layout);
        Affiche1Layout.setHorizontalGroup(
            Affiche1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 246, Short.MAX_VALUE)
        );
        Affiche1Layout.setVerticalGroup(
            Affiche1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 323, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout Affiche2Layout = new javax.swing.GroupLayout(Affiche2);
        Affiche2.setLayout(Affiche2Layout);
        Affiche2Layout.setHorizontalGroup(
            Affiche2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 236, Short.MAX_VALUE)
        );
        Affiche2Layout.setVerticalGroup(
            Affiche2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 323, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout Affiche3Layout = new javax.swing.GroupLayout(Affiche3);
        Affiche3.setLayout(Affiche3Layout);
        Affiche3Layout.setHorizontalGroup(
            Affiche3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 235, Short.MAX_VALUE)
        );
        Affiche3Layout.setVerticalGroup(
            Affiche3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout Affiche4Layout = new javax.swing.GroupLayout(Affiche4);
        Affiche4.setLayout(Affiche4Layout);
        Affiche4Layout.setHorizontalGroup(
            Affiche4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 236, Short.MAX_VALUE)
        );
        Affiche4Layout.setVerticalGroup(
            Affiche4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        MovieName1.setFont(new java.awt.Font("Showcard Gothic", 0, 18)); // NOI18N
        MovieName1.setForeground(new java.awt.Color(240, 240, 0));
        MovieName1.setText("Movie Name");

        MovieYear1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        MovieYear1.setForeground(new java.awt.Color(240, 240, 0));
        MovieYear1.setText("Année");

        MovieName2.setFont(new java.awt.Font("Showcard Gothic", 0, 18)); // NOI18N
        MovieName2.setForeground(new java.awt.Color(240, 240, 0));
        MovieName2.setText("Nom fILM");

        MovieYear2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        MovieYear2.setForeground(new java.awt.Color(240, 240, 0));
        MovieYear2.setText("Année");

        MovieName3.setFont(new java.awt.Font("Showcard Gothic", 0, 18)); // NOI18N
        MovieName3.setForeground(new java.awt.Color(240, 240, 0));
        MovieName3.setText("Nom fILM");

        MovieYear3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        MovieYear3.setForeground(new java.awt.Color(240, 240, 0));
        MovieYear3.setText("Année");

        MovieYear4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        MovieYear4.setForeground(new java.awt.Color(240, 240, 0));
        MovieYear4.setText("Année");

        MovieName4.setFont(new java.awt.Font("Showcard Gothic", 0, 18)); // NOI18N
        MovieName4.setForeground(new java.awt.Color(240, 240, 0));
        MovieName4.setText("Nom fILM");

        Runtime1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Runtime1.setForeground(new java.awt.Color(240, 240, 0));
        Runtime1.setText("Temps");

        Runtime2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Runtime2.setForeground(new java.awt.Color(240, 240, 0));
        Runtime2.setText("Temps");

        Runtime3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Runtime3.setForeground(new java.awt.Color(240, 240, 0));
        Runtime3.setText("Temps");

        Runtime4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Runtime4.setForeground(new java.awt.Color(240, 240, 0));
        Runtime4.setText("Temps");

        MovieName5.setFont(new java.awt.Font("Showcard Gothic", 0, 18)); // NOI18N
        MovieName5.setForeground(new java.awt.Color(240, 240, 0));
        MovieName5.setText("Nom fILM");

        MovieYear5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        MovieYear5.setForeground(new java.awt.Color(240, 240, 0));
        MovieYear5.setText("Année");

        javax.swing.GroupLayout Affiche5Layout = new javax.swing.GroupLayout(Affiche5);
        Affiche5.setLayout(Affiche5Layout);
        Affiche5Layout.setHorizontalGroup(
            Affiche5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 236, Short.MAX_VALUE)
        );
        Affiche5Layout.setVerticalGroup(
            Affiche5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 323, Short.MAX_VALUE)
        );

        Runtime5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Runtime5.setForeground(new java.awt.Color(240, 240, 0));
        Runtime5.setText("Temps");

        MovieYear6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        MovieYear6.setForeground(new java.awt.Color(240, 240, 0));
        MovieYear6.setText("Année");

        MovieName6.setFont(new java.awt.Font("Showcard Gothic", 0, 18)); // NOI18N
        MovieName6.setForeground(new java.awt.Color(240, 240, 0));
        MovieName6.setText("Nom fILM");

        javax.swing.GroupLayout Affiche6Layout = new javax.swing.GroupLayout(Affiche6);
        Affiche6.setLayout(Affiche6Layout);
        Affiche6Layout.setHorizontalGroup(
            Affiche6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 236, Short.MAX_VALUE)
        );
        Affiche6Layout.setVerticalGroup(
            Affiche6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 323, Short.MAX_VALUE)
        );

        Runtime6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Runtime6.setForeground(new java.awt.Color(240, 240, 0));
        Runtime6.setText("Temps");

        BoutonMovie1.setBackground(new java.awt.Color(0, 0, 0));
        BoutonMovie1.setFont(new java.awt.Font("Showcard Gothic", 0, 18)); // NOI18N
        BoutonMovie1.setText("J'y vais");
        BoutonMovie1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BoutonMovie1ActionPerformed(evt);
            }
        });

        BoutonMovie3.setBackground(new java.awt.Color(0, 0, 0));
        BoutonMovie3.setFont(new java.awt.Font("Showcard Gothic", 0, 18)); // NOI18N
        BoutonMovie3.setText("J'y vais");
        BoutonMovie3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BoutonMovie3ActionPerformed(evt);
            }
        });

        BoutonMovie2.setBackground(new java.awt.Color(0, 0, 0));
        BoutonMovie2.setFont(new java.awt.Font("Showcard Gothic", 0, 18)); // NOI18N
        BoutonMovie2.setText("J'y vais");
        BoutonMovie2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BoutonMovie2ActionPerformed(evt);
            }
        });

        BoutonMovie4.setBackground(new java.awt.Color(0, 0, 0));
        BoutonMovie4.setFont(new java.awt.Font("Showcard Gothic", 0, 18)); // NOI18N
        BoutonMovie4.setText("J'y vais");
        BoutonMovie4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BoutonMovie4ActionPerformed(evt);
            }
        });

        BoutonMovie5.setBackground(new java.awt.Color(0, 0, 0));
        BoutonMovie5.setFont(new java.awt.Font("Showcard Gothic", 0, 18)); // NOI18N
        BoutonMovie5.setText("J'y vais");
        BoutonMovie5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BoutonMovie5ActionPerformed(evt);
            }
        });

        BoutonMovie6.setBackground(new java.awt.Color(0, 0, 0));
        BoutonMovie6.setFont(new java.awt.Font("Showcard Gothic", 0, 18)); // NOI18N
        BoutonMovie6.setText("J'y vais");
        BoutonMovie6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BoutonMovie6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(58, 58, 58)
                                .addComponent(Runtime1))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addComponent(Affiche1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(91, 91, 91)
                                .addComponent(BoutonMovie1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(114, 114, 114)
                                .addComponent(MovieName1)))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(89, 89, 89)
                                        .addComponent(MovieYear2))
                                    .addComponent(Affiche2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(66, 66, 66)
                                        .addComponent(MovieName2))
                                    .addComponent(Runtime2)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(95, 95, 95)
                                .addComponent(BoutonMovie2, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(79, 79, 79)
                                        .addComponent(MovieName3))
                                    .addComponent(Affiche3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Runtime3))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(BoutonMovie3, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(41, 41, 41))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addComponent(MovieYear1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(MovieYear3)
                        .addGap(97, 97, 97)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Affiche4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Runtime4)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(74, 74, 74)
                                        .addComponent(MovieName4)))
                                .addGap(77, 77, 77))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(BoutonMovie4, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addComponent(MovieYear4)))
                .addGap(60, 60, 60)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGap(40, 40, 40)
                            .addComponent(BoutonMovie5, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(Runtime5)
                        .addComponent(Affiche5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(MovieYear5)
                        .addGap(104, 104, 104))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(MovieName5)
                        .addGap(81, 81, 81)))
                .addGap(67, 67, 67)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(Runtime6)
                                .addComponent(Affiche6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(MovieYear6)
                                .addGap(98, 98, 98))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(BoutonMovie6, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50)))
                        .addGap(52, 52, 52))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(MovieName6)
                        .addGap(120, 120, 120))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(134, 134, 134)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(MovieName5)
                        .addGap(32, 32, 32)
                        .addComponent(MovieYear5)
                        .addGap(26, 26, 26)
                        .addComponent(Affiche5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Runtime5)
                        .addGap(36, 36, 36)
                        .addComponent(BoutonMovie5, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(MovieName4)
                        .addGap(78, 78, 78)
                        .addComponent(Affiche4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Runtime4)
                        .addGap(158, 158, 158))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(MovieName2)
                            .addComponent(MovieName1))
                        .addGap(32, 32, 32)
                        .addComponent(MovieYear2)
                        .addGap(26, 26, 26)
                        .addComponent(Affiche2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Runtime2)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(MovieName3)
                                        .addGap(78, 78, 78)
                                        .addComponent(Affiche3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Runtime3)
                                        .addGap(45, 45, 45))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(55, 55, 55)
                                        .addComponent(MovieYear4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(428, 428, 428)))
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(BoutonMovie3, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(BoutonMovie4, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                .addComponent(MovieName6)
                                .addGap(32, 32, 32)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(MovieYear6)
                                    .addComponent(MovieYear1)
                                    .addComponent(MovieYear3))
                                .addGap(26, 26, 26)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(Affiche1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(Runtime1)
                                        .addGap(45, 45, 45))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(Affiche6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(Runtime6)
                                        .addGap(36, 36, 36)))
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(BoutonMovie1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(BoutonMovie6, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(BoutonMovie2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(69, 69, 69))))
        );

        BackButton1.setBackground(new java.awt.Color(0, 0, 0));
        BackButton1.setFont(new java.awt.Font("Showcard Gothic", 0, 18)); // NOI18N
        BackButton1.setText("My Profile");
        BackButton1.setToolTipText("");
        BackButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 1756, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(BackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 584, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(666, 666, 666)
                        .addComponent(BackButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(49, 49, 49))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BackButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addGap(2, 2, 2)))
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(70, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 29, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        // TODO add your handling code here:
        WelcomePage a = new WelcomePage();
        a.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BackButtonActionPerformed

    private void BoutonMovie1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BoutonMovie1ActionPerformed
        // TODO add your handling code here:
         MovieDetails a = new MovieDetails(Projet.FilmID1);
        a.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_BoutonMovie1ActionPerformed

    private void BackButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BackButton1ActionPerformed

    private void BoutonMovie3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BoutonMovie3ActionPerformed
        // TODO add your handling code here:

         MovieDetails a = new MovieDetails(Projet.FilmID3);
        a.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_BoutonMovie3ActionPerformed

    private void BoutonMovie2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BoutonMovie2ActionPerformed
        // TODO add your handling code here:
         MovieDetails a = new MovieDetails(Projet.FilmID2);
        a.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_BoutonMovie2ActionPerformed

    private void BoutonMovie4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BoutonMovie4ActionPerformed
        // TODO add your handling code here:
         MovieDetails a = new MovieDetails(Projet.FilmID4);
        a.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_BoutonMovie4ActionPerformed

    private void BoutonMovie5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BoutonMovie5ActionPerformed
        // TODO add your handling code here:
         MovieDetails a = new MovieDetails(Projet.FilmID5);
        a.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_BoutonMovie5ActionPerformed

    private void BoutonMovie6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BoutonMovie6ActionPerformed
        // TODO add your handling code here:
         MovieDetails a = new MovieDetails(Projet.FilmID6);
        a.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_BoutonMovie6ActionPerformed

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
            java.util.logging.Logger.getLogger(MoviePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MoviePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MoviePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MoviePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MoviePage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Affiche1;
    private javax.swing.JPanel Affiche2;
    private javax.swing.JPanel Affiche3;
    private javax.swing.JPanel Affiche4;
    private javax.swing.JPanel Affiche5;
    private javax.swing.JPanel Affiche6;
    private javax.swing.JButton BackButton;
    private javax.swing.JButton BackButton1;
    private javax.swing.JButton BoutonMovie1;
    private javax.swing.JButton BoutonMovie2;
    private javax.swing.JButton BoutonMovie3;
    private javax.swing.JButton BoutonMovie4;
    private javax.swing.JButton BoutonMovie5;
    private javax.swing.JButton BoutonMovie6;
    private javax.swing.JLabel MovieName1;
    private javax.swing.JLabel MovieName2;
    private javax.swing.JLabel MovieName3;
    private javax.swing.JLabel MovieName4;
    private javax.swing.JLabel MovieName5;
    private javax.swing.JLabel MovieName6;
    private javax.swing.JLabel MovieYear1;
    private javax.swing.JLabel MovieYear2;
    private javax.swing.JLabel MovieYear3;
    private javax.swing.JLabel MovieYear4;
    private javax.swing.JLabel MovieYear5;
    private javax.swing.JLabel MovieYear6;
    private javax.swing.JLabel Runtime1;
    private javax.swing.JLabel Runtime2;
    private javax.swing.JLabel Runtime3;
    private javax.swing.JLabel Runtime4;
    private javax.swing.JLabel Runtime5;
    private javax.swing.JLabel Runtime6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
