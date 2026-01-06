package com.xworkz.jdbc.dto;

import java.util.Objects;

public class Vehicle {
    private int id;
    private String brand;
    private String modelName;
    private int manufacturingYear;
    private String color;
    private String fuelType;
    private double engineCapacity;
    private long chassisNumber;
    private double price;
    private boolean isAvailable;

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", modelName='" + modelName + '\'' +
                ", manufacturingYear=" + manufacturingYear +
                ", color='" + color + '\'' +
                ", fuelType='" + fuelType + '\'' +
                ", engineCapacity=" + engineCapacity +
                ", chassisNumber=" + chassisNumber +
                ", price=" + price +
                ", isAvailable=" + isAvailable +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Vehicle)) return false;
        Vehicle vehicle = (Vehicle) o;
        return id == vehicle.id && manufacturingYear == vehicle.manufacturingYear && Double.compare(engineCapacity, vehicle.engineCapacity) == 0 && chassisNumber == vehicle.chassisNumber && Double.compare(price, vehicle.price) == 0 && isAvailable == vehicle.isAvailable && Objects.equals(brand, vehicle.brand) && Objects.equals(modelName, vehicle.modelName) && Objects.equals(color, vehicle.color) && Objects.equals(fuelType, vehicle.fuelType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, brand, modelName, manufacturingYear, color, fuelType, engineCapacity, chassisNumber, price, isAvailable);
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public int getManufacturingYear() {
        return manufacturingYear;
    }

    public void setManufacturingYear(int manufacturingYear) {
        this.manufacturingYear = manufacturingYear;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(double engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public long getChassisNumber() {
        return chassisNumber;
    }

    public void setChassisNumber(long chassisNumber) {
        this.chassisNumber = chassisNumber;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public Vehicle(int id, String brand, String modelName, int manufacturingYear, String color, String fuelType, double engineCapacity, long chassisNumber, double price, boolean isAvailable) {
        this.id = id;
        this.brand = brand;
        this.modelName = modelName;
        this.manufacturingYear = manufacturingYear;
        this.color = color;
        this.fuelType = fuelType;
        this.engineCapacity = engineCapacity;
        this.chassisNumber = chassisNumber;
        this.price = price;
        this.isAvailable = isAvailable;
    }
}
