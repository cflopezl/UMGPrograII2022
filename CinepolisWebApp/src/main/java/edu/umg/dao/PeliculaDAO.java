package edu.umg.dao;

import edu.umg.model.Pelicula;
import edu.umg.utils.VariablesGlobales;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class PeliculaDAO {

    public List<Pelicula> getAllDB(){

        List<Pelicula> peliculas = new ArrayList<>();

        try {

            Statement statement = VariablesGlobales.conn.createStatement();
            String sql = "select * from pelicula";
            ResultSet rs = statement.executeQuery(sql);

            while( rs.next() ){

                Pelicula pelicula = new Pelicula(rs.getInt("id"),
                        rs.getString("nombre"),
                        rs.getDouble("puntuacion"));
                peliculas.add(pelicula);

            }

        } catch (SQLException throwables) {
            System.out.println( "getAllDB: " + throwables.getMessage() );
            throwables.printStackTrace();
        }


        return peliculas;

    }

    public void saveOne( Pelicula pelicula ){
        //....
    }



}
