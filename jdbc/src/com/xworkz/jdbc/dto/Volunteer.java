package com.xworkz.jdbc.dto;

import java.util.Objects;

public class Volunteer {
    private int id;
    private String name;
    private long phno;
    private String email;
    private int age;

    public Volunteer(int id, String name, long phno, String email, int age) {
        this.id = id;
        this.name = name;
        this.phno = phno;
        this.email = email;
        this.age = age;
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

    public long getPhno() {
        return phno;
    }

    public void setPhno(long phno) {
        this.phno = phno;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Volunteer)) return false;
        Volunteer volunteer = (Volunteer) o;
        return id == volunteer.id && phno == volunteer.phno && age == volunteer.age && Objects.equals(name, volunteer.name) && Objects.equals(email, volunteer.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, phno, email, age);
    }

    @Override
    public String toString() {
        return "Volunteer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phno=" + phno +
                ", email='" + email + '\'' +
                ", age=" + age +
                '}';
    }
}