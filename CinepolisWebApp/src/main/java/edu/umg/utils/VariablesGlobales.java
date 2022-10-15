package edu.umg.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class VariablesGlobales {


    public static Connection conn;

    static{

        try {
            Class.forName("org.postgresql.Driver");
            conn = DriverManager.getConnection(
                    "jdbc:postgresql://ec2-34-193-44-192.compute-1.amazonaws.com:5432/d58j8gvlfhauc9",
                    "pbesolenacgnji",
                    "7ce0047f978fb6d26f310721a74ba800e0324aa920a1b81c546f4498ae4aa808"
            );
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }


    }


}
