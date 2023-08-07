package Examen.Interfaz;

import Examen.Logica.textbased;
import java.awt.Color;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;

public class Ruta_2 extends javax.swing.JFrame {

    int Posicion_x, Posicion_y;

    public Ruta_2() {
        initComponents();
        jTextArea1.select(1, 1);
        jrdRuta1.setText(textbased.arrayRutas[2].getRutaOpcion1());
        jrdRuta2.setText(textbased.arrayRutas[2].getRutaOpcion2());
        jrdRuta3.setText(textbased.arrayRutas[3].getRutaOpcion3());

        //Se unifican los radiobuttons en un unico grupo.
        //GRUPO TIPO DE PRESTAMO - CLASE PRESTAMO
        ButtonGroup RutasButtonGroup = new ButtonGroup();
        RutasButtonGroup.add(jrdRuta1);
        RutasButtonGroup.add(jrdRuta2);
        RutasButtonGroup.add(jrdRuta3);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpCuerpo = new javax.swing.JPanel();
        jpBarra = new javax.swing.JPanel();
        btnExit = new javax.swing.JPanel();
        lblExit = new javax.swing.JLabel();
        btnMenu = new javax.swing.JPanel();
        lblMenu = new javax.swing.JLabel();
        jsSeparador3 = new javax.swing.JSeparator();
        lblFondo1 = new javax.swing.JLabel();
        lblFondo = new javax.swing.JLabel();
        btnSiguiente = new javax.swing.JPanel();
        lblSiguiente = new javax.swing.JLabel();
        btnAnterior = new javax.swing.JPanel();
        lblAnterior = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jrdRuta1 = new javax.swing.JRadioButton();
        jrdRuta2 = new javax.swing.JRadioButton();
        jrdRuta3 = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jpCuerpo.setBackground(new java.awt.Color(0, 0, 0));
        jpCuerpo.setMinimumSize(new java.awt.Dimension(780, 460));
        jpCuerpo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpBarra.setBackground(new java.awt.Color(0, 0, 0));
        jpBarra.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jpBarraMouseDragged(evt);
            }
        });
        jpBarra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jpBarraMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jpBarraLayout = new javax.swing.GroupLayout(jpBarra);
        jpBarra.setLayout(jpBarraLayout);
        jpBarraLayout.setHorizontalGroup(
            jpBarraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 780, Short.MAX_VALUE)
        );
        jpBarraLayout.setVerticalGroup(
            jpBarraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jpCuerpo.add(jpBarra, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 40));

        btnExit.setBackground(new java.awt.Color(0, 153, 204));

        lblExit.setFont(new java.awt.Font("Roboto Condensed", 1, 18)); // NOI18N
        lblExit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblExit.setText("Exit");
        lblExit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblExitMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblExitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblExitMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnExitLayout = new javax.swing.GroupLayout(btnExit);
        btnExit.setLayout(btnExitLayout);
        btnExitLayout.setHorizontalGroup(
            btnExitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblExit, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
        );
        btnExitLayout.setVerticalGroup(
            btnExitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblExit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jpCuerpo.add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 410, 90, 40));

        btnMenu.setBackground(new java.awt.Color(0, 153, 204));

        lblMenu.setFont(new java.awt.Font("Roboto Condensed", 1, 18)); // NOI18N
        lblMenu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMenu.setText(" Menu");
        lblMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMenuMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblMenuMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblMenuMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnMenuLayout = new javax.swing.GroupLayout(btnMenu);
        btnMenu.setLayout(btnMenuLayout);
        btnMenuLayout.setHorizontalGroup(
            btnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblMenu, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
        );
        btnMenuLayout.setVerticalGroup(
            btnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblMenu, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jpCuerpo.add(btnMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 410, 90, 40));
        jpCuerpo.add(jsSeparador3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 400, 390, 10));

        lblFondo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Examen/Recursos/Grass_background_1.png"))); // NOI18N
        jpCuerpo.add(lblFondo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 200, 390));

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Examen/Recursos/moon.png"))); // NOI18N
        jpCuerpo.add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 200, 390));

        btnSiguiente.setBackground(new java.awt.Color(0, 153, 204));

        lblSiguiente.setFont(new java.awt.Font("Roboto Condensed", 1, 18)); // NOI18N
        lblSiguiente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSiguiente.setText("Siguiente");
        lblSiguiente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblSiguiente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSiguienteMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblSiguienteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblSiguienteMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnSiguienteLayout = new javax.swing.GroupLayout(btnSiguiente);
        btnSiguiente.setLayout(btnSiguienteLayout);
        btnSiguienteLayout.setHorizontalGroup(
            btnSiguienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblSiguiente, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
        );
        btnSiguienteLayout.setVerticalGroup(
            btnSiguienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblSiguiente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jpCuerpo.add(btnSiguiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 410, 90, 40));

        btnAnterior.setBackground(new java.awt.Color(0, 153, 204));

        lblAnterior.setFont(new java.awt.Font("Roboto Condensed", 1, 18)); // NOI18N
        lblAnterior.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAnterior.setText("Anterior");
        lblAnterior.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblAnterior.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAnteriorMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblAnteriorMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblAnteriorMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnAnteriorLayout = new javax.swing.GroupLayout(btnAnterior);
        btnAnterior.setLayout(btnAnteriorLayout);
        btnAnteriorLayout.setHorizontalGroup(
            btnAnteriorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblAnterior, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
        );
        btnAnteriorLayout.setVerticalGroup(
            btnAnteriorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblAnterior, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jpCuerpo.add(btnAnterior, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 410, 90, 40));

        jLabel1.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("El miedo me hacía ver cosas pero...");
        jpCuerpo.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 40, 390, 30));

        jTextArea1.setEditable(false);
        jTextArea1.setBackground(new java.awt.Color(0, 0, 0));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        jTextArea1.setForeground(new java.awt.Color(255, 255, 255));
        jTextArea1.setRows(5);
        jTextArea1.setText("Lentamente voy abriéndome camino por donde consigo ver, \nla luz de luna es gentil y me muestra un sendero por el cual andar. \n\nA pesar de que el miedo florece en mí, logro aferrarme a mi razón \ny a la poca cordura que me queda, tratando de olvidar \nlas terribles cosas que vi en la ciudad.\n\nUn caminar pausado me ayudó a enfriar la cabeza, \na preocuparme por desgastarme. \n\nRecuerdo que al final de este bosque había una cabaña \nde guardabosques y trato de dirigirme allí, \na pesar de que la última vez que estuve allí fue hace varios \naños ya.\n\nQuizás lo que sucedió en la ciudad no había alcanzado \notros poblados, quería ser optimista y sin embargo, \nhabía una razón por la cual no podía terminar de convencerme \na mi mismo. \n\nÉl amanecer seguía negro, tanto como si la obsidiana \ncon la cual se decoraba el firmamento fuese a tragarme \na mí también. \n\nDebo tomar una decisión, rendirme ante el miedo o \ncreer en mi mismo hasta el amargo final.\n");
        jTextArea1.setToolTipText("");
        jTextArea1.setWrapStyleWord(true);
        jScrollPane1.setViewportView(jTextArea1);

        jpCuerpo.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 70, 410, 220));

        jrdRuta1.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        jrdRuta1.setForeground(new java.awt.Color(255, 255, 255));
        jrdRuta1.setText("jRadioButton1");
        jpCuerpo.add(jrdRuta1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 310, 420, -1));

        jrdRuta2.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        jrdRuta2.setForeground(new java.awt.Color(255, 255, 255));
        jrdRuta2.setText("jRadioButton1");
        jpCuerpo.add(jrdRuta2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 340, 420, -1));

        jrdRuta3.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        jrdRuta3.setForeground(new java.awt.Color(255, 255, 255));
        jrdRuta3.setText("jRadioButton1");
        jpCuerpo.add(jrdRuta3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 370, 420, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpCuerpo, javax.swing.GroupLayout.PREFERRED_SIZE, 660, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpCuerpo, javax.swing.GroupLayout.DEFAULT_SIZE, 460, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jpBarraMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpBarraMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - Posicion_x, y - Posicion_y);
    }//GEN-LAST:event_jpBarraMouseDragged

    private void jpBarraMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpBarraMousePressed
        Posicion_x = evt.getX();
        Posicion_y = evt.getY();
    }//GEN-LAST:event_jpBarraMousePressed

    private void lblExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_lblExitMouseClicked

    private void lblExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExitMouseEntered
        btnExit.setBackground(Color.BLACK);
        lblExit.setForeground(Color.WHITE);
    }//GEN-LAST:event_lblExitMouseEntered

    private void lblExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExitMouseExited
        btnExit.setBackground(new Color(0, 153, 204));
        lblExit.setForeground(Color.BLACK);
    }//GEN-LAST:event_lblExitMouseExited

    private void lblMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMenuMouseClicked
        MainMenu menu = new MainMenu();
        menu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblMenuMouseClicked

    private void lblMenuMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMenuMouseEntered
        btnMenu.setBackground(Color.BLACK);
        lblMenu.setForeground(Color.WHITE);
    }//GEN-LAST:event_lblMenuMouseEntered

    private void lblMenuMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMenuMouseExited
        btnMenu.setBackground(new Color(0, 153, 204));
        lblMenu.setForeground(Color.BLACK);
    }//GEN-LAST:event_lblMenuMouseExited

    private void lblAnteriorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAnteriorMouseClicked
        Ruta_0 anteriorRuta_0 = new Ruta_0();
        anteriorRuta_0.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblAnteriorMouseClicked

    private void lblAnteriorMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAnteriorMouseEntered
        btnAnterior.setBackground(Color.BLACK);
        lblAnterior.setForeground(Color.WHITE);
    }//GEN-LAST:event_lblAnteriorMouseEntered

    private void lblAnteriorMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAnteriorMouseExited
        btnAnterior.setBackground(new Color(0, 153, 204));
        lblAnterior.setForeground(Color.BLACK);
    }//GEN-LAST:event_lblAnteriorMouseExited

    private void lblSiguienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSiguienteMouseClicked
        Conflict();
    }//GEN-LAST:event_lblSiguienteMouseClicked

    private void lblSiguienteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSiguienteMouseEntered
        btnSiguiente.setBackground(Color.BLACK);
        lblSiguiente.setForeground(Color.WHITE);
    }//GEN-LAST:event_lblSiguienteMouseEntered

    private void lblSiguienteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSiguienteMouseExited
        btnSiguiente.setBackground(new Color(0, 153, 204));
        lblSiguiente.setForeground(Color.BLACK);
    }//GEN-LAST:event_lblSiguienteMouseExited

    public void Conflict() {

        if (jrdRuta3.isSelected() == true) {
            Good_Ending Ending_1 = new Good_Ending();
            Ending_1.setVisible(true);
            this.dispose();
        }
        if (jrdRuta1.isSelected() == true) {
            Bad_Ending Ending_2 = new Bad_Ending();
            Ending_2.setVisible(true);
            this.dispose();
        }
        if (jrdRuta2.isSelected() == true) {
            Neutral_Ending Ending_3 = new Neutral_Ending();
            Ending_3.setVisible(true);
            this.dispose();
        }
        if (jrdRuta1.isSelected() == false && jrdRuta2.isSelected() == false && jrdRuta3.isSelected() == false) {
            JOptionPane.showMessageDialog(null, "Escoge una opción para continuar!",
                    "Espera!", JOptionPane.ERROR_MESSAGE);
        }

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnAnterior;
    private javax.swing.JPanel btnExit;
    private javax.swing.JPanel btnMenu;
    private javax.swing.JPanel btnSiguiente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JPanel jpBarra;
    private javax.swing.JPanel jpCuerpo;
    private javax.swing.JRadioButton jrdRuta1;
    private javax.swing.JRadioButton jrdRuta2;
    private javax.swing.JRadioButton jrdRuta3;
    private javax.swing.JSeparator jsSeparador3;
    private javax.swing.JLabel lblAnterior;
    private javax.swing.JLabel lblExit;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblFondo1;
    private javax.swing.JLabel lblMenu;
    private javax.swing.JLabel lblSiguiente;
    // End of variables declaration//GEN-END:variables
}
