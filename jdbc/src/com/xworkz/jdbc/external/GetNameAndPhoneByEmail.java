package com.xworkz.jdbc.external;

import com.xworkz.jdbc.dto.Volunteer;
import com.xworkz.jdbc.internal.CharityGroup;

    public class GetNameAndPhoneByEmail {
        public static void main(String[] args) {
            Volunteer volunteer = new Volunteer(1001,"Thejas",7204238271l,"thejas.v@ngo.org",23);
            CharityGroup charityGroup = new CharityGroup();

            String name=charityGroup.getNameAndPhoneByEmail(manu.v@ngo.org);
            System.out.println(name);
        }
    }

