package com.xworkz.jdbc.external;

import com.xworkz.jdbc.dto.Vehicle;
import com.xworkz.jdbc.internal.Showroom;

public class ShowroomRunner {
    public static void main(String[] args) {
        Vehicle car = new Vehicle(1, "Toyota", "Camry", 2025, "Pearl White", "Hybrid", 2.5, 9876543210123L, 35000.00, true);

        Showroom showroom = new Showroom();
        String status = showroom.addVehicle(car);

        System.out.println("Inventory Status: " + status);
    }
}
