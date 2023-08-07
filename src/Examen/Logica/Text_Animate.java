package Examen.Logica;

import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Text_Animate extends Thread {

    javax.swing.JLabel Texto;
    String[] arrayTexto;
    java.awt.Font[] arrayAnimacion;
    int increment;

    public Text_Animate() {
        arrayTexto = new String[4];
        arrayAnimacion = new java.awt.Font[4];
        cargarTexto();
        cargarAnimacion();
        increment = 0;
    }

    public void run() {
        while (true) {
            if (increment <= 3) {
                Texto.setText(arrayTexto[increment]);
                Texto.setFont(arrayAnimacion[increment]);
                increment++;
            } else {
                increment = 0;
            }
            try {
                sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Text_Animate.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public void animarTexto(javax.swing.JLabel jLabel1) {
        this.Texto = jLabel1;
    }

    public void cargarTexto() {
        arrayTexto[0] = "¿Terminaste el juego?";
        arrayTexto[1] = "Aquí encontrarás...";
        arrayTexto[2] = "los créditos finales.";
        arrayTexto[3] = "Gracias.";
    }

    public void cargarAnimacion() {
        arrayAnimacion[0] = new java.awt.Font("Microsoft YaHei", 1, 26);
        arrayAnimacion[1] = new java.awt.Font("Microsoft YaHei", 1, 28);
        arrayAnimacion[2] = new java.awt.Font("Microsoft YaHei", 1, 26);
        arrayAnimacion[3] = new java.awt.Font("Microsoft YaHei", 1, 36);
    }

}
