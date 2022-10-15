package edu.umg.dao;

import edu.umg.model.Pelicula;
import edu.umg.utils.VariableGlobales;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class PeliculaDAO {

    public List<Pelicula> getAllDB(){

        List<Pelicula> peliculas = new ArrayList<>();

        try {

            Statement statement = VariableGlobales.conn.createStatement();
            String consulta = "select * from pelicula";

            ResultSet rs = statement.executeQuery(consulta);
            while( rs.next() ){

                peliculas.add( new Pelicula(rs.getInt("id"),
                        rs.getString("nombre"), rs.getFloat("puntuacion") ));

            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }


        return peliculas;
    }

}
