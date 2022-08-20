package edu.umg.model;

public class Movie {

    private static int correlativo=1;

    public int identificador;
    // propiedades
    public String title;
    private String rating;

    // constructor
    // todas las instancias que vamos a crear por default deben asignarsele un nombre a la pelicula que se esta creando
    // pero el rating por default para todas las instancias de las peliculas siempre sera "PG"

    public static Movie CrearConRatingDefault(String pTitle){
        return new Movie(pTitle);
    }

    private Movie(String pTitle){
        identificador = correlativo;
        correlativo++;
        title = pTitle;
        rating = "PG";
    }

    public Movie(String title, String rating) {
        identificador = correlativo;
        correlativo++;
        this.title = title;
        this.rating = rating;
    }

    public static Movie CrearConTodosValoresDefault(){
        return new Movie();
    }

    private Movie(){
        identificador = correlativo;
        correlativo++;
        this.title = "Sin titulo";
        this.rating = "PG";
    }

    // metodos
    public void setRating(String rating){
        this.rating = rating;
    }
    public String getRating(){
        return this.rating;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "identificador=" + identificador +
                ", title='" + title + '\'' +
                ", rating='" + rating + '\'' +
                '}';
    }
}
