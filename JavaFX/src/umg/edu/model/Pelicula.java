package umg.edu.model;

public class Pelicula {

    private static int correlativo=1;
    private int id;
    private String nombre;
    private String rating;
    private int duracion;

    public Pelicula(String nombre, String rating, int duracion) {

        this.id = correlativo;
        this.nombre = nombre;
        this.rating = rating;
        this.duracion = duracion;

        correlativo = correlativo + 1;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }
}
