package com.carrental.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.carrental.model.Car;

public class CarDao {
    public List<Car> getAllCars() {
        List<Car> cars = new ArrayList<>();
        try (Connection connection = DBConnection.getConnection()) {
            String sql = "SELECT * FROM Cars";
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                cars.add(new Car(
                    resultSet.getInt("car_id"),
                    resultSet.getString("car_name"),
                    resultSet.getString("car_type"),
                    resultSet.getDouble("price_per_day"),
                    resultSet.getBoolean("availability_status")
                ));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return cars;
    }

    public boolean updateCarAvailability(int carId, boolean availabilityStatus) {
        try (Connection connection = DBConnection.getConnection()) {
            String sql = "UPDATE Cars SET availability_status = ? WHERE car_id = ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setBoolean(1, availabilityStatus);
            statement.setInt(2, carId);
            return statement.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}
