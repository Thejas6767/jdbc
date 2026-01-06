package com.xworkz.jdbc.external;

import com.xworkz.jdbc.dto.Volunteer;
import com.xworkz.jdbc.internal.CharityGroup;

public class CharityRunner {
    public static void main(String[] args) {

        CharityGroup group = new CharityGroup();

        System.out.println("Updating record...");

        Volunteer updatedData = new Volunteer(1005, "Shashi", 875469458L, "updated.shashi@ngo.org", 25);
        String result = group.updateAgeAndEmailById(updatedData);

        System.out.println(result);
    }
}
