package com.xworkz.jdbc.internal;

import java.sql.*;
import com.xworkz.jdbc.dto.Volunteer;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeletebyId {
    String url = "jdbc:mysql://localhost:3306/ngo_db";
    String userName = "root";
    String password = "root";

    public String deletebyId(Volunteer volunteer) {
        String status = "Delete Failed";
        try{
        String deleteQuery = "DELETE FROM volunteer_tb WHERE id = ?";

        Connection con = DriverManager.getConnection(url, userName, password);
             PreparedStatement ps = con.prepareStatement(deleteQuery);

            ps.setInt(1, volunteer.getId());

            int result = ps.executeUpdate();
            if (result == 1) {
                status = "Successfully deleted record for ID: " + volunteer.getId();
            } else {
                status = "Delete failed: ID " + volunteer.getId() + " not found in database.";
            }
        } catch (SQLException e) {
            e.printStackTrace();
            status = "Database Error: " + e.getMessage();
        }
        return status;
    }
}
