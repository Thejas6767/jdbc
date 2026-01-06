package com.xworkz.jdbc.external;

import com.xworkz.jdbc.dto.MissionDetails;
import com.xworkz.jdbc.internal.SpaceAgency;

public class SpaceRunner {
    public static void main(String[] args) {
        MissionDetails marsMission = new MissionDetails(1001, 111, "Moon South Pole", "2026-11-15", "Starship HLS", 4, 1200.50, 450000000.00, true, "NASA");

        SpaceAgency dao = new SpaceAgency();
        String status = dao.launchMission(marsMission);

        System.out.println(status);
    }
}
