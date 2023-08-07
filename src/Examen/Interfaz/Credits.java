package Examen.Interfaz;

import Examen.Logica.Text_Animate;
import java.awt.Color;

public class Credits extends javax.swing.JFrame {

    int Posicion_x, Posicion_y;
    Text_Animate threatAnimate = new Text_Animate();

    public Credits() {
        initComponents();
        jTextArea1.select(1, 1);

        threatAnimate.animarTexto(jLabel2);
        threatAnimate.start();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();

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

        jpCuerpo.add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 410, 90, 40));

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

        jpCuerpo.add(btnMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 410, 90, 40));
        jpCuerpo.add(jsSeparador3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 400, 190, 10));

        lblFondo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Examen/Recursos/Background_0.png"))); // NOI18N
        jpCuerpo.add(lblFondo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 200, 290));

        jTextArea1.setEditable(false);
        jTextArea1.setBackground(new java.awt.Color(0, 0, 0));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        jTextArea1.setForeground(new java.awt.Color(255, 255, 255));
        jTextArea1.setRows(5);
        jTextArea1.setText("¿Le dedicaste un tiempo a mi primer programa de juegos?\nEl text-based games siempre me ha gustado y fue entretenido.\nEspero un día poder hacer una novela visual.\n\nGracias por llegar hasta aquí, pese a no ser un juego \nsumamente elaborado espero que haya sido una \nexperiencia interesante.\n\nAssets:\nBackgrounds de uso libre\nAutor: @anokolisa\n\nCodigo y elaboración: \nAlvaro Enrique Cascante Moraga \n116260532\nUNED - 2023\n\n");
        jScrollPane1.setViewportView(jTextArea1);

        jpCuerpo.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 90, 410, 290));

        jLabel2.setFont(new java.awt.Font("Microsoft YaHei", 3, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("¡CREDITOS!");
        jpCuerpo.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, 410, 70));

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

        threatAnimate.stop();
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
        threatAnimate.stop();
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnExit;
    private javax.swing.JPanel btnMenu;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JPanel jpBarra;
    private javax.swing.JPanel jpCuerpo;
    private javax.swing.JSeparator jsSeparador3;
    private javax.swing.JLabel lblExit;
    private javax.swing.JLabel lblFondo1;
    private javax.swing.JLabel lblMenu;
    // End of variables declaration//GEN-END:variables
}
