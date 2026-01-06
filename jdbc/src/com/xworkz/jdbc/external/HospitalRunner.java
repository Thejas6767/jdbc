package com.xworkz.jdbc.external;

import com.xworkz.jdbc.dto.Patient;
import com.xworkz.jdbc.internal.Hospital;

public class HospitalRunner {
    public static void main(String[] args) {
        Patient patient = new Patient(102, "Suresh", "Rao", 35, "Male", "B+", 912345678, "2024-06-12", "Checkup", 500.00);

        Hospital hospital = new Hospital();
        String result = hospital.addPatient(patient);

        System.out.println(result);
    }
}