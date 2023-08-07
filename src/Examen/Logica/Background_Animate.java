package Examen.Logica;

import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;

public class Background_Animate extends Thread {

    javax.swing.JLabel Texto;
    javax.swing.JLabel[] arrayLabels;
    int increment;

    public Background_Animate() {

        JLabel[] arrayTexto = new JLabel[4];
        increment = 0;
    }

    public void run() {
        while (true) {
            if (increment <= 4) {
                if (increment == 0) {
                    Texto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Examen/Recursos/Background_0.png")));
                }
                if (increment == 1) {
                    Texto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Examen/Recursos/Background_6.png")));
                }
                if (increment == 2) {
                    Texto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Examen/Recursos/Background_5.png")));
                }
                if (increment == 3) {
                    Texto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Examen/Recursos/Background_4.png")));
                }
                increment++;
            } else {
                increment = 0;
            }
            try {
                sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Background_Animate.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public void animarTexto(javax.swing.JLabel jLabel1) {
        this.Texto = jLabel1;
    }

}
