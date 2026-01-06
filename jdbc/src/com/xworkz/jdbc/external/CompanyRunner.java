package com.xworkz.jdbc.external;

import com.xworkz.jdbc.dto.Staff;
import com.xworkz.jdbc.internal.Company;

public class CompanyRunner {
    public static void main(String[] args) {
        Staff newStaff = new Staff(502, "Sanjay", "Sharma", "Engineering", "Software Developer", 75000.00, 543210987654L, "sanjay.s@company.com", "2024-01-15", true);

        Company myCompany = new Company();
        String result = myCompany.hireStaff(newStaff);

        System.out.println("Status: " + result);
    }
}
