package com.xworkz.jdbc.external;

import com.xworkz.jdbc.dto.Volunteer;
import com.xworkz.jdbc.internal.UpdatePhoneByemail;
import com.xworkz.jdbc.internal.UpdatenameAndPhoneAndEmailByid;

public class UpdatenameAndPhoneAndEmailByidRunner {
    public static void main(String[] args) {

        UpdatenameAndPhoneAndEmailByid group = new UpdatenameAndPhoneAndEmailByid();

        System.out.println("Updating record...");

        Volunteer updatedData = new Volunteer(1003, "Shashank", 9875486458l, "sanjay.v@ngo.org", 23);
        String result = group.UpdatenameAndPhoneAndEmailByid(updatedData);

        System.out.println(result);
    }
}
