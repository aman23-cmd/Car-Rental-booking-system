package com.carrental.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class DBConnection {
    
    public static void main(String[] args) throws Exception {
        try {
            String url = "jdbc:mysql://localhost:3306/";

            String databaseName = "car_rental_booking_system";
            String userName = "root";
            String password = "Am@n1235";
    
            Connection connection = DriverManager.getConnection(url,userName, password);
    
            String sql = "CREATE DATABASE " + databaseName;
    
            Statement statement = connection.createStatement();
            statement.executeUpdate(sql);
            statement.close();
            JOptionPane.showMessageDialog(null, databaseName + " Database has been created successfully", "System Message", JOptionPane.INFORMATION_MESSAGE);
    
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
