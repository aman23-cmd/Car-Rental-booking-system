package com.carrental.model;

public class Car {
    private int carId;
    private String carName;
    private String carType;
    private double pricePerDay;
    private boolean availabilityStatus;

    public Car(int carId, String carName, String carType, double pricePerDay, boolean availabilityStatus) {
        this.carId = carId;
        this.carName = carName;
        this.carType = carType;
        this.pricePerDay = pricePerDay;
        this.availabilityStatus = availabilityStatus;
    }

    // Getters and setters
    public int getCarId() { return carId; }
    public void setCarId(int carId) { this.carId = carId; }

    public String getCarName() { return carName; }
    public void setCarName(String carName) { this.carName = carName; }

    public String getCarType() { return carType; }
    public void setCarType(String carType) { this.carType = carType; }

    public double getPricePerDay() { return pricePerDay; }
    public void setPricePerDay(double pricePerDay) { this.pricePerDay = pricePerDay; }

    public boolean isAvailabilityStatus() { return availabilityStatus; }
    public void setAvailabilityStatus(boolean availabilityStatus) { this.availabilityStatus = availabilityStatus; }
}
