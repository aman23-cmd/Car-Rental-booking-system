package com.carrental;

import com.carrental.dao.DBConnection;

import java.sql.Connection;

public class TestConnection {
    public static void main(String[] args) {
        Connection connection = DBConnection.getConnection();
        if (connection != null) {
            System.out.println("Database connected successfully!");
        } else {
            System.out.println("Failed to connect to the database.");
        }
    }
}
