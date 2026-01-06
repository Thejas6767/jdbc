package com.xworkz.jdbc.dto;

import java.util.Objects;

public class SchoolDetails {
    private int id;
    private String name;
    private String address;
    private int phno;
    private String email;
    private int dob;
    private int age;
    private String fatherName;

    public SchoolDetails(int id, String name, String address, int phno, String email, int dob, int age, String fatherName) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phno = phno;
        this.email = email;
        this.dob = dob;
        this.age = age;
        this.fatherName = fatherName;
    }

    @Override
    public String toString() {
        return "School{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phno=" + phno +
                ", email='" + email + '\'' +
                ", dob=" + dob +
                ", age=" + age +
                ", fatherName='" + fatherName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SchoolDetails)) return false;
        SchoolDetails school = (SchoolDetails) o;
        return id == school.id && phno == school.phno && dob == school.dob && age == school.age && Objects.equals(name, school.name) && Objects.equals(address, school.address) && Objects.equals(email, school.email) && Objects.equals(fatherName, school.fatherName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, address, phno, email, dob, age, fatherName);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPhno() {
        return phno;
    }

    public void setPhno(int phno) {
        this.phno = phno;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getDob() {
        return dob;
    }

    public void setDob(int dob) {
        this.dob = dob;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }
}
