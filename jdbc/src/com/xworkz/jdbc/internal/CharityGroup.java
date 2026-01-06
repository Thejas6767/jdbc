package com.xworkz.jdbc.internal;

import com.xworkz.jdbc.dto.Volunteer;

import java.sql.*;



public class CharityGroup {
    String url = "jdbc:mysql://localhost:3306/ngo_db";
    String userName = "root";
    String password = "root";

    public String updateAgeAndEmailById(Volunteer volunteer) {
        String status = "Update Failed";
        try{

        String updateQuery = "UPDATE volunteer_tb SET age = ?, email = ? WHERE id = ?";

        Connection con = DriverManager.getConnection(url, userName, password);
             PreparedStatement ps = con.prepareStatement(updateQuery);

            ps.setInt(1, volunteer.getAge());
            ps.setString(2, volunteer.getEmail());
            ps.setInt(3, volunteer.getId());

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
    public String getAgeAndEmailById(int id) {
        String result = null;
        try{
        String readQuery = "SELECT age, email FROM volunteer_tb WHERE id = ?";

         Connection connection = DriverManager.getConnection(url, userName, password);
             PreparedStatement ps = connection.prepareStatement(readQuery);

            ps.setInt(1, id);

            ResultSet rs = ps.executeQuery();
                while (rs.next()) {
                    int age = rs.getInt("age");
                    String email = rs.getString("email");
result=age+email;
                }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }
    public String getNameAndPhoneByEmail(String email) {
        String result = null;
        try{
            String readQuery = "SELECT name, phno FROM volunteer_tb WHERE email = ?";

            Connection connection = DriverManager.getConnection(url, userName, password);
            PreparedStatement ps = connection.prepareStatement(readQuery);

            ps.setString(1,email);

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                String name = rs.getString("name");
                int phno = rs.getInt("phno");
                result=name+phno;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }
}

