package com.xworkz.jdbc.external;

import com.xworkz.jdbc.dto.Volunteer;
import com.xworkz.jdbc.internal.CharityGroup;
import com.xworkz.jdbc.internal.DeletebyId;



public class DeletebyIdRunner {
    public static void main(String[] args) {
        int idToDelete = 1003;


        Volunteer volunteer = new Volunteer(idToDelete, "Vikki", 9875486458L, "manu.v@ngo.org", 23);

        DeletebyId service = new DeletebyId();

        System.out.println("Processing delete request...");
        String result = service.deletebyId(volunteer);

        System.out.println("Result: " + result);
    }
}
