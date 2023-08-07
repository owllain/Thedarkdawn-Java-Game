package Examen.Logica;

public class Story {

    protected int ruta;
    protected String rutaOpcion1;
    protected String rutaOpcion2;
    protected String rutaOpcion3;

    public Story() {
    }

    public Story(int ruta, String rutaOpcion1, String rutaOpcion2, String rutaOpcion3) {
        this.ruta = ruta;
        this.rutaOpcion1 = rutaOpcion1;
        this.rutaOpcion2 = rutaOpcion2;
        this.rutaOpcion3 = rutaOpcion3;
    }

    public int getRuta() {
        return ruta;
    }

    public void setRuta(int ruta) {
        this.ruta = ruta;
    }

    public String getRutaOpcion1() {
        return rutaOpcion1;
    }

    public void setRutaOpcion1(String rutaOpcion1) {
        this.rutaOpcion1 = rutaOpcion1;
    }

    public String getRutaOpcion2() {
        return rutaOpcion2;
    }

    public void setRutaOpcion2(String rutaOpcion2) {
        this.rutaOpcion2 = rutaOpcion2;
    }

    public String getRutaOpcion3() {
        return rutaOpcion3;
    }

    public void setRutaOpcion3(String rutaOpcion3) {
        this.rutaOpcion3 = rutaOpcion3;
    }

   
    
}
