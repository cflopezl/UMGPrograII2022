package edu.umg;

import edu.umg.model.Movie;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // parte 1: crear la interfaz grafica de usuario
        System.out.println("Ingrese el nombre de la pelicula 1 ");
        Scanner scanner = new Scanner(System.in);
        String nombrePelicula = scanner.nextLine();
        System.out.println("Ingrese el rating de la pelicula 1 ");
        String ratingPelicula = scanner.nextLine();

        // crear 2 objetos que representen a peliculas: Joker y Rapido y Furioso
        Movie movieJoker = new Movie( nombrePelicula );
        movieJoker.setRating(ratingPelicula);

        System.out.println("Ingrese el nombre de la pelicula 2 ");
        nombrePelicula = scanner.nextLine();
        Movie movieRapidoFurioso = new Movie( nombrePelicula );


    }
}
