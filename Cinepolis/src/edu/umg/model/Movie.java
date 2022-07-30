package edu.umg.model;

public class Movie {
    // propiedades
    public String title;
    private String rating;

    // constructor
    // todas las instancias que vamos a crear por default deben asignarsele un nombre a la pelicula que se esta creando
    // pero el rating por default para todas las instancias de las peliculas siempre sera "PG"
    public Movie(String pTitle){
        title = pTitle;
        rating = "PG";
    }

    // metodos
    public void setRating(String rating){
        this.rating = rating;
    }
    public String getRating(){
        return this.rating;
    }


}
