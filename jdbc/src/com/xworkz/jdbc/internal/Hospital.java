package com.xworkz.jdbc.internal;

import com.xworkz.jdbc.dto.Patient;

import java.sql.*;

public class Hospital {
    String url = "jdbc:mysql://localhost:3306/hospital_db";
    String userName = "root";
    String password = "root";

    public String addPatient(Patient patient) {
        String message = "Failed to add";
        try{
        String query = "INSERT INTO patient_tb VALUES(?,?,?,?,?,?,?,?,?,?)";

        Connection connection = DriverManager.getConnection(url, userName, password);
             PreparedStatement statement = connection.prepareStatement(query) ;

            statement.setInt(1, patient.getId());
            statement.setString(2, patient.getFirstName());
            statement.setString(3, patient.getLastName());
            statement.setInt(4, patient.getAge());
            statement.setString(5, patient.getGender());
            statement.setString(6, patient.getBloodGroup());
            statement.setLong(7, patient.getContactNumber());
            statement.setString(8, patient.getAdmissionDate());
            statement.setString(9, patient.getAilment());
            statement.setDouble(10, patient.getBillAmount());

            int rowsAffected = statement.executeUpdate();
            if (rowsAffected == 1) {
                message = "Patient record added successfully!";
            }
        } catch (SQLException e) {
            e.printStackTrace();
            message = "Error: " + e.getMessage();
        }
        return message;
    }
}