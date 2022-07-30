package edu.umg.model;

public class Cartelera {

    private String ubicacion;
    private Movie peliculas[];
    int indice;

    public Cartelera(String ubicacion) {
        this.ubicacion = ubicacion;
        peliculas = new Movie[10];
        indice=0;
    }

    public void agregarPeliculaAcartelera(Movie peliculaAAgregar){
        peliculas[indice]=peliculaAAgregar;
        System.out.println( "Se agrego a cartelera la pelicula: " + peliculas[indice].title );
        indice++;

    }

    public void modificarRatingDeUnaPelicula(int indice, String rating){
        peliculas[indice].setRating(rating);
    }


}
