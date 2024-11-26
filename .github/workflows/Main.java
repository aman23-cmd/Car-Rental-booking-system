package com.carrental;

import com.carrental.dao.CarDao;
import com.carrental.model.Car;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        CarDao carDao = new CarDao();
        List<Car> cars = carDao.getAllCars();
        System.out.println("Available Cars:");
        for (Car car : cars) {
            System.out.println(car.getCarName() + " - " + car.getPricePerDay());
        }
    }
}
