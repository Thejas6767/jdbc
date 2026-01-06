package com.xworkz.jdbc.external;

import com.xworkz.jdbc.dto.SchoolDetails;
import com.xworkz.jdbc.internal.School;

public class SchoolRunner {
    public static void main(String[] args) {
        SchoolDetails schoolDetails =new SchoolDetails(1,"Thejas","Thirthahalli",720423827,"thejas@gmail.com",06-02-2003,23,"Ramesha M T");
        School school = new School();
        String added = school.add(schoolDetails);
        System.out.println(added);
    }
}


