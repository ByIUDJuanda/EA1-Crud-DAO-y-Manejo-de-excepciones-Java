package com.iudigital.Fun.center.iud.Util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author JUANDA
 */
public class ConnectionUtil {
    
    private static final String URL = "jdbc:postgresql://localhost:5432/db-car-iud";
    private static final String USER = "postgres";
    private static final String PASSWORD = "IUD2024";
    
    
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL,USER,PASSWORD);
    }
            
}
