package com.xworkz.jdbc.external;

import com.xworkz.jdbc.dto.Volunteer;
import com.xworkz.jdbc.internal.CharityUpdateByEmail;
import com.xworkz.jdbc.internal.UpdatePhoneByemail;

public class UpdatePhoneByemailRunner {
    public static void main(String[] args) {

        UpdatePhoneByemail group = new UpdatePhoneByemail();

        System.out.println("Updating record...");

        Volunteer updatedData = new Volunteer(1002, "Sanjay", 9875486458l, "sanjay.v@ngo.org", 23);
        String result = group.CharityUpdateByEmail(updatedData);

        System.out.println(result);
    }
}
