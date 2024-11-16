package com.carrental.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
    private static final String URL = "jdbc:mysql://localhost:3306/car_rental";
    private static final String USER = "root";
    private static final String PASSWORD = "Am@n1235";

    public static Connection getConnection() {
        try {
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Error connecting to the database.");
        }
    }
}
