package com.xworkz.jdbc.dto;

import java.util.Objects;

public class Patient {
    private int id;
    private String firstName;
    private String lastName;
    private int age;
    private String gender;
    private String bloodGroup;
    private long contactNumber;
    private String admissionDate;
    private String ailment;
    private double billAmount;

    @Override
    public String toString() {
        return "Patient{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", bloodGroup='" + bloodGroup + '\'' +
                ", contactNumber=" + contactNumber +
                ", admissionDate='" + admissionDate + '\'' +
                ", ailment='" + ailment + '\'' +
                ", billAmount=" + billAmount +
                '}';
    }

    public int getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Patient)) return false;
        Patient patient = (Patient) o;
        return id == patient.id && age == patient.age && contactNumber == patient.contactNumber && Double.compare(billAmount, patient.billAmount) == 0 && Objects.equals(firstName, patient.firstName) && Objects.equals(lastName, patient.lastName) && Objects.equals(gender, patient.gender) && Objects.equals(bloodGroup, patient.bloodGroup) && Objects.equals(admissionDate, patient.admissionDate) && Objects.equals(ailment, patient.ailment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName, age, gender, bloodGroup, contactNumber, admissionDate, ailment, billAmount);
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public long getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(long contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getAdmissionDate() {
        return admissionDate;
    }

    public void setAdmissionDate(String admissionDate) {
        this.admissionDate = admissionDate;
    }

    public String getAilment() {
        return ailment;
    }

    public void setAilment(String ailment) {
        this.ailment = ailment;
    }

    public double getBillAmount() {
        return billAmount;
    }

    public void setBillAmount(double billAmount) {
        this.billAmount = billAmount;
    }

    public Patient(int id, String firstName, String lastName, int age, String gender, String bloodGroup, long contactNumber, String admissionDate, String ailment, double billAmount) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
        this.bloodGroup = bloodGroup;
        this.contactNumber = contactNumber;
        this.admissionDate = admissionDate;
        this.ailment = ailment;
        this.billAmount = billAmount;
    }
}
