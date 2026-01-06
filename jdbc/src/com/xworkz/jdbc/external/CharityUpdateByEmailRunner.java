package com.xworkz.jdbc.external;

import com.xworkz.jdbc.dto.Volunteer;
import com.xworkz.jdbc.internal.CharityGroup;
import com.xworkz.jdbc.internal.CharityUpdateByEmail;

public class CharityUpdateByEmailRunner {
    public static void main(String[] args) {

        CharityUpdateByEmail group = new CharityUpdateByEmail();

        System.out.println("Updating record...");

        Volunteer updatedData = new Volunteer(1004, "Vikki", 9875486458l, "manu.v@ngo.org", 23);
        String result = group.updatenameAndPhoneByEmail(updatedData);

        System.out.println(result);
    }
}
