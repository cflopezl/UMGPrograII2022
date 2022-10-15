package edu.umg.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class VariableGlobales {

    private static final String DRIVER_DB = "org.postgresql.Driver";
    private static final String URL_DB = "jdbc:postgresql://ec2-34-193-44-192.compute-1.amazonaws.com:5432/d58j8gvlfhauc9";
    private static final String USER_DB = "pbesolenacgnji";
    private static final String PASSWORD_DB = "7ce0047f978fb6d26f310721a74ba800e0324aa920a1b81c546f4498ae4aa808";


    public static Connection conn;

    static{

        try {
            Class.forName(DRIVER_DB);
            conn = DriverManager.getConnection( URL_DB, USER_DB, PASSWORD_DB );
        } catch (SQLException | ClassNotFoundException throwables) {
            throwables.printStackTrace();
        }

    }




}
