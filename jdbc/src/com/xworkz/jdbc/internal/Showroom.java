package com.xworkz.jdbc.internal;

import com.xworkz.jdbc.dto.Vehicle;

import java.sql.*;

public class Showroom {
    String url = "jdbc:mysql://localhost:3306/inventory_db";
    String user = "root";
    String pass = "root";

    public String addVehicle(Vehicle v) {

        String result = "Failed to add vehicle.";

       try{
           String query = "INSERT INTO vehicle_tb VALUES(?,?,?,?,?,?,?,?,?,?)";


        Connection con = DriverManager.getConnection(url, user, pass);
             PreparedStatement ps = con.prepareStatement(query);

            ps.setInt(1, v.getId());
            ps.setString(2, v.getBrand());
            ps.setString(3, v.getModelName());
            ps.setInt(4, v.getManufacturingYear());
            ps.setString(5, v.getColor());
            ps.setString(6, v.getFuelType());
            ps.setDouble(7, v.getEngineCapacity());
            ps.setLong(8, v.getChassisNumber());
            ps.setDouble(9, v.getPrice());
            ps.setBoolean(10, v.isAvailable());

            int row = ps.executeUpdate();
            if (row == 1) {
                result = "Vehicle added to inventory!";
            }
        } catch (SQLException e) {
            e.printStackTrace();
            result = "Error: " + e.getMessage();
        }
        return result;
    }
}
