package com.xworkz.jdbc.internal;

import com.xworkz.jdbc.dto.Volunteer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdatePhoneByemail {
    public String CharityUpdateByEmail(Volunteer volunteer) {
        String url = "jdbc:mysql://localhost:3306/ngo_db";
        String userName = "root";
        String password = "root";
        String status = "Update Failed";
        try{

            String updateQuery = "UPDATE volunteer_tb SET  phno = ? WHERE email = ?";

            Connection con = DriverManager.getConnection(url, userName, password);
            PreparedStatement ps = con.prepareStatement(updateQuery);

            ps.setLong(1, volunteer.getPhno());
            ps.setString(2, volunteer.getEmail());

            int result = ps.executeUpdate();
            if (result == 1) {
                status = "Successfully updated record for ID: " + volunteer.getId();
            } else {
                status = "Update failed: ID not found in database.";
            }
        } catch (SQLException e) {
            e.printStackTrace();
            status = "Database Error: " + e.getMessage();
        }
        return status;
    }

}

