package com.xworkz.jdbc.internal;

import com.xworkz.jdbc.dto.Staff;

import java.sql.*;

public class Company {
    String url = "jdbc:mysql://localhost:3306/company_db";
    String user = "root";
    String pass = "root";

    public String hireStaff(Staff staff) {
        String status = "Insertion Failed";
       try{
           String sql = "INSERT INTO staff_tb VALUES(?,?,?,?,?,?,?,?,?,?)";

        Connection con = DriverManager.getConnection(url, user, pass);
             PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, staff.getStaffId());
            ps.setString(2, staff.getFirstName());
            ps.setString(3, staff.getLastName());
            ps.setString(4, staff.getDepartment());
            ps.setString(5, staff.getDesignation());
            ps.setDouble(6, staff.getSalary());
            ps.setLong(7, staff.getAadhaarNo());
            ps.setString(8, staff.getEmail());
            ps.setString(9, staff.getJoinDate());
            ps.setBoolean(10, staff.isPermanent());

            int count = ps.executeUpdate();
            if (count > 0) {
                status = "Staff hired successfully!";
            }

        } catch (SQLException e) {
            e.printStackTrace();
            status = "Database Error: " + e.getMessage();
        }
        return status;
    }
}
