package Examen.Logica;

import javax.swing.JRadioButton;

public class textbased {

    public static Story[] arrayRutas = new Story[4];

    //FUNCIONES DE OBJETOS Y LLENAR ARRAY
    //FUNCION PARA MODIFICAR EL JTEXTAREA 
    public static void Setup() {

        Story ruta0Story = new Story();
        ruta0Story.ruta = 0;
        ruta0Story.rutaOpcion1 = "Quizás debería descansar un poco antes de continuar."; //RUTA1
        ruta0Story.rutaOpcion2 = "Haré un esfuerzo por avanzar, pero manteniendo la cautela."; //RUTA2
        ruta0Story.rutaOpcion3 = "¡Debo correr a toda prisa, no descansaré tranquilo aquí!"; //RUTA3

        Story ruta1Story = new Story();
        ruta1Story.ruta = 1;
        ruta1Story.rutaOpcion1 = "Algo se acerca, decido ir a su encuentro con cautela."; //GOOD ENDING
        ruta1Story.rutaOpcion2 = "Me doy cuenta de que no estoy solo en este lugar. ¿Debería huir?"; //BAD ENDING
        ruta1Story.rutaOpcion3 = "Correré antes que me encuentre, no me arriesgaré."; //NEUTRAL ENDING

        Story ruta2Story = new Story();
        ruta2Story.ruta = 2;
        ruta2Story.rutaOpcion1 = "Sollozo desconsolado, nadie puede escapar del oscuro amanecer."; //BAD ENDING
        ruta2Story.rutaOpcion2 = "Camino a la deriva sin saber mi rumbo..."; //NEUTRAL ENDING
        ruta2Story.rutaOpcion3 = "Veo una luz, trato de alcanzarla con temor a que sea una ilusión."; //GOOD ENDING

        Story ruta3Story = new Story();
        ruta3Story.ruta = 3;
        ruta3Story.rutaOpcion1 = "Esperare a ver que sucede, debo controlarme."; //GOOD ENDING
        ruta3Story.rutaOpcion2 = "Debo huir, mis instintos no se pueden equivocar."; //NEUTRAL ENDING
        ruta3Story.rutaOpcion3 = "Si algo intenta atacarme, lo atacaré yo primero. ¡No acabaré así!"; //BAD ENDING

        arrayRutas[0] = ruta0Story;
        arrayRutas[1] = ruta1Story;
        arrayRutas[2] = ruta2Story;
        arrayRutas[3] = ruta3Story;

    }



    public void Resolution() {
    }

}
