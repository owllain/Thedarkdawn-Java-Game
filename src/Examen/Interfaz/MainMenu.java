package Examen.Interfaz;

import Examen.Logica.Background_Animate;
import java.awt.Color;
import javax.swing.ImageIcon;

public class MainMenu extends javax.swing.JFrame {

    //Posición del mouse para los botones x y -
    int Posicion_x, Posicion_y;
    Background_Animate background_Animate = new Background_Animate();

    public MainMenu() {
        initComponents();
        background_Animate.animarTexto(lblFondo);
        background_Animate.start();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpCuerpo = new javax.swing.JPanel();
        lblEncabezado = new javax.swing.JLabel();
        lblSubtitulo = new javax.swing.JLabel();
        jpBarra = new javax.swing.JPanel();
        jpExit = new javax.swing.JPanel();
        lblExit = new javax.swing.JLabel();
        jpMinimize = new javax.swing.JPanel();
        lblMinimize = new javax.swing.JLabel();
        btnCreditos = new javax.swing.JPanel();
        lblCreditos = new javax.swing.JLabel();
        btnStart = new javax.swing.JPanel();
        lblStart = new javax.swing.JLabel();
        jsSeparador3 = new javax.swing.JSeparator();
        lblFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jpCuerpo.setBackground(new java.awt.Color(0, 0, 0));
        jpCuerpo.setMinimumSize(new java.awt.Dimension(780, 460));
        jpCuerpo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblEncabezado.setFont(new java.awt.Font("Roboto Condensed", 1, 48)); // NOI18N
        lblEncabezado.setForeground(new java.awt.Color(255, 255, 255));
        lblEncabezado.setText("The black dawn");
        jpCuerpo.add(lblEncabezado, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 50, 340, 80));

        lblSubtitulo.setFont(new java.awt.Font("Roboto Condensed", 2, 26)); // NOI18N
        lblSubtitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblSubtitulo.setText("a storytelling game");
        jpCuerpo.add(lblSubtitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 90, 250, 60));

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

        jpExit.setBackground(new java.awt.Color(0, 0, 0));
        jpExit.setForeground(new java.awt.Color(255, 255, 255));

        lblExit.setFont(new java.awt.Font("Roboto Condensed", 0, 24)); // NOI18N
        lblExit.setForeground(new java.awt.Color(255, 255, 255));
        lblExit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblExit.setText("X");
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

        javax.swing.GroupLayout jpExitLayout = new javax.swing.GroupLayout(jpExit);
        jpExit.setLayout(jpExitLayout);
        jpExitLayout.setHorizontalGroup(
            jpExitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblExit, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jpExitLayout.setVerticalGroup(
            jpExitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblExit, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jpMinimize.setBackground(new java.awt.Color(0, 0, 0));
        jpMinimize.setForeground(new java.awt.Color(255, 255, 255));

        lblMinimize.setFont(new java.awt.Font("Roboto Condensed", 0, 24)); // NOI18N
        lblMinimize.setForeground(new java.awt.Color(255, 255, 255));
        lblMinimize.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMinimize.setText("—");
        lblMinimize.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblMinimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMinimizeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblMinimizeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblMinimizeMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jpMinimizeLayout = new javax.swing.GroupLayout(jpMinimize);
        jpMinimize.setLayout(jpMinimizeLayout);
        jpMinimizeLayout.setHorizontalGroup(
            jpMinimizeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpMinimizeLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblMinimize, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
        );
        jpMinimizeLayout.setVerticalGroup(
            jpMinimizeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpMinimizeLayout.createSequentialGroup()
                .addComponent(lblMinimize, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jpBarraLayout = new javax.swing.GroupLayout(jpBarra);
        jpBarra.setLayout(jpBarraLayout);
        jpBarraLayout.setHorizontalGroup(
            jpBarraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpBarraLayout.createSequentialGroup()
                .addComponent(jpExit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpMinimize, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 700, Short.MAX_VALUE))
        );
        jpBarraLayout.setVerticalGroup(
            jpBarraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpBarraLayout.createSequentialGroup()
                .addGroup(jpBarraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpExit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jpMinimize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jpCuerpo.add(jpBarra, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 40));

        btnCreditos.setBackground(new java.awt.Color(0, 153, 204));

        lblCreditos.setFont(new java.awt.Font("Roboto Condensed", 1, 36)); // NOI18N
        lblCreditos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCreditos.setText("CREDITS");
        lblCreditos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblCreditos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCreditosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblCreditosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblCreditosMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnCreditosLayout = new javax.swing.GroupLayout(btnCreditos);
        btnCreditos.setLayout(btnCreditosLayout);
        btnCreditosLayout.setHorizontalGroup(
            btnCreditosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblCreditos, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
        );
        btnCreditosLayout.setVerticalGroup(
            btnCreditosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnCreditosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCreditos)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jpCuerpo.add(btnCreditos, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 370, 290, 50));

        btnStart.setBackground(new java.awt.Color(0, 153, 204));

        lblStart.setFont(new java.awt.Font("Roboto Condensed", 1, 36)); // NOI18N
        lblStart.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblStart.setText("START");
        lblStart.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblStart.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblStartMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblStartMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblStartMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnStartLayout = new javax.swing.GroupLayout(btnStart);
        btnStart.setLayout(btnStartLayout);
        btnStartLayout.setHorizontalGroup(
            btnStartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblStart, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
        );
        btnStartLayout.setVerticalGroup(
            btnStartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnStartLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblStart, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jpCuerpo.add(btnStart, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 300, 290, 50));
        jpCuerpo.add(jsSeparador3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 360, 290, 10));

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Examen/Recursos/Background_0.png"))); // NOI18N
        jpCuerpo.add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 660, 410));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpCuerpo, javax.swing.GroupLayout.PREFERRED_SIZE, 660, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpCuerpo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lblCreditosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCreditosMouseClicked
        Credits creditos = new Credits();
        creditos.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblCreditosMouseClicked

    private void lblCreditosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCreditosMouseEntered
        btnCreditos.setBackground(Color.BLACK);
        lblCreditos.setForeground(Color.WHITE);
    }//GEN-LAST:event_lblCreditosMouseEntered

    private void lblCreditosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCreditosMouseExited
        btnCreditos.setBackground(new Color(0, 153, 204));
        lblCreditos.setForeground(Color.BLACK);
    }//GEN-LAST:event_lblCreditosMouseExited


    private void lblExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExitMouseClicked
        background_Animate.stop();
        System.exit(0);
    }//GEN-LAST:event_lblExitMouseClicked

    private void lblExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExitMouseEntered
        jpExit.setBackground(new Color(0, 153, 204));
        lblExit.setForeground(Color.BLACK);
    }//GEN-LAST:event_lblExitMouseEntered

    private void lblExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExitMouseExited
        jpExit.setBackground(Color.BLACK);
        lblExit.setForeground(Color.WHITE);
    }//GEN-LAST:event_lblExitMouseExited

    private void lblMinimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMinimizeMouseClicked
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_lblMinimizeMouseClicked

    private void lblMinimizeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMinimizeMouseEntered
        jpMinimize.setBackground(new Color(0, 153, 204));
        lblMinimize.setForeground(Color.BLACK);
    }//GEN-LAST:event_lblMinimizeMouseEntered

    private void lblMinimizeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMinimizeMouseExited
        jpMinimize.setBackground(Color.BLACK);
        lblMinimize.setForeground(Color.WHITE);
    }//GEN-LAST:event_lblMinimizeMouseExited

    private void jpBarraMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpBarraMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - Posicion_x, y - Posicion_y);
    }//GEN-LAST:event_jpBarraMouseDragged

    private void jpBarraMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpBarraMousePressed
        Posicion_x = evt.getX();
        Posicion_y = evt.getY();
    }//GEN-LAST:event_jpBarraMousePressed


    private void lblStartMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblStartMouseClicked

        Ruta_0 frmStory = new Ruta_0();
        frmStory.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_lblStartMouseClicked

    private void lblStartMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblStartMouseEntered
        btnStart.setBackground(Color.BLACK);
        lblStart.setForeground(Color.WHITE);
    }//GEN-LAST:event_lblStartMouseEntered

    private void lblStartMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblStartMouseExited
        btnStart.setBackground(new Color(0, 153, 204));
        lblStart.setForeground(Color.BLACK);
    }//GEN-LAST:event_lblStartMouseExited

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
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnCreditos;
    private javax.swing.JPanel btnStart;
    private javax.swing.JPanel jpBarra;
    private javax.swing.JPanel jpCuerpo;
    private javax.swing.JPanel jpExit;
    private javax.swing.JPanel jpMinimize;
    private javax.swing.JSeparator jsSeparador3;
    private javax.swing.JLabel lblCreditos;
    private javax.swing.JLabel lblEncabezado;
    private javax.swing.JLabel lblExit;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblMinimize;
    private javax.swing.JLabel lblStart;
    private javax.swing.JLabel lblSubtitulo;
    // End of variables declaration//GEN-END:variables
}
