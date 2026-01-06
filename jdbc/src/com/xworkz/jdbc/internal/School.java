package com.xworkz.jdbc.internal;

import com.xworkz.jdbc.dto.SchoolDetails;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class School {
    String url="jdbc:mysql://localhost:3306/school_db";
    String userName="root";
    String password="root";

    public String add(SchoolDetails schoolDetails){
        String rows=null;
        try {
            String insertQuery = "insert into school_tb values(?,?,?,?,?,?,?,?)";
            Connection connection = DriverManager.getConnection(url, userName, password);
            PreparedStatement statement = connection.prepareStatement(insertQuery);
            statement.setInt(1, schoolDetails.getId());
            statement.setString(2, schoolDetails.getName());
            statement.setString(3, schoolDetails.getAddress());
            statement.setInt(4, schoolDetails.getPhno());
            statement.setString(5, schoolDetails.getEmail());
            statement.setInt(6, schoolDetails.getDob());
            statement.setInt(7, schoolDetails.getAge());
            statement.setString(8, schoolDetails.getFatherName());
            int row = statement.executeUpdate();
            if (row == 1) {
                rows = "it is added";
            }
        }
        catch (SQLException e){
            e.printStackTrace();
        }
        return rows;
    }


}
