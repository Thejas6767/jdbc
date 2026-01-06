package com.xworkz.jdbc.internal;

import com.xworkz.jdbc.dto.MissionDetails;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class SpaceAgency {
    String url = "jdbc:mysql://localhost:3306/space_db";
    String username = "root";
    String password = "root";

    public String launchMission(MissionDetails mission) {

        String result = "Mission Launch Aborted (Database Error)";
       try{
        String sql = "INSERT INTO missions_tb VALUES(?,?,?,?,?,?,?,?,?,?)";

        Connection con = DriverManager.getConnection(url, username, password);
             PreparedStatement ps = con.prepareStatement(sql) ;

            ps.setInt(1, mission.getMissionId());
            ps.setString(2, mission.getMissionName());
            ps.setString(3, mission.getDestination());
            ps.setString(4, mission.getLaunchDate());
            ps.setString(5, mission.getRocketType());
            ps.setInt(6, mission.getCrewSize());
            ps.setDouble(7, mission.getFuelCapacity());
            ps.setDouble(8, mission.getMissionBudget());
            ps.setBoolean(9, mission.isManned());
            ps.setString(10, mission.getAgencyName());

            int rows = ps.executeUpdate();
            if (rows == 1) {
                result = "Mission " + mission.getMissionName() + " is successfully registered for launch!";
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }
}
