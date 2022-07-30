package edu.umg;

import edu.umg.model.Cartelera;
import edu.umg.model.Movie;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // parte 1: crear la interfaz grafica de usuario
        System.out.println("Ingrese el nombre de la pelicula 1 ");
        Scanner scanner = new Scanner(System.in);

        String nombrePelicula = scanner.nextLine();
        // crear 2 objetos que representen a peliculas: Joker y Rapido y Furioso
        Movie pelicula1 = new Movie( nombrePelicula );


        System.out.println("Ingrese el nombre de la pelicula 2 ");
        nombrePelicula = scanner.nextLine();
        Movie pelicula2 = new Movie( nombrePelicula );

        Cartelera carteleraPortales = new Cartelera("Portales z. 18");
        carteleraPortales.agregarPeliculaAcartelera(pelicula1);
        carteleraPortales.agregarPeliculaAcartelera(pelicula2);

        carteleraPortales.modificarRatingDeUnaPelicula(1,"P16");



    }
}
