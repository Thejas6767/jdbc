package com.xworkz.jdbc.dto;

import java.util.Objects;

public class Staff {
    private int staffId;
    private String firstName;
    private String lastName;
    private String department;
    private String designation;
    private double salary;
    private long aadhaarNo;
    private String email;
    private String joinDate;
    private boolean isPermanent;

    public Staff(int staffId, String firstName, String lastName, String department, String designation, double salary, long aadhaarNo, String email, String joinDate, boolean isPermanent) {
        this.staffId = staffId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = department;
        this.designation = designation;
        this.salary = salary;
        this.aadhaarNo = aadhaarNo;
        this.email = email;
        this.joinDate = joinDate;
        this.isPermanent = isPermanent;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "staffId=" + staffId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", department='" + department + '\'' +
                ", designation='" + designation + '\'' +
                ", salary=" + salary +
                ", aadhaarNo=" + aadhaarNo +
                ", email='" + email + '\'' +
                ", joinDate='" + joinDate + '\'' +
                ", isPermanent=" + isPermanent +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Staff)) return false;
        Staff staff = (Staff) o;
        return staffId == staff.staffId && Double.compare(salary, staff.salary) == 0 && aadhaarNo == staff.aadhaarNo && isPermanent == staff.isPermanent && Objects.equals(firstName, staff.firstName) && Objects.equals(lastName, staff.lastName) && Objects.equals(department, staff.department) && Objects.equals(designation, staff.designation) && Objects.equals(email, staff.email) && Objects.equals(joinDate, staff.joinDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(staffId, firstName, lastName, department, designation, salary, aadhaarNo, email, joinDate, isPermanent);
    }

    public int getStaffId() {
        return staffId;
    }

    public void setStaffId(int staffId) {
        this.staffId = staffId;
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

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public long getAadhaarNo() {
        return aadhaarNo;
    }

    public void setAadhaarNo(long aadhaarNo) {
        this.aadhaarNo = aadhaarNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getJoinDate() {
        return joinDate;
    }

    public void setJoinDate(String joinDate) {
        this.joinDate = joinDate;
    }

    public boolean isPermanent() {
        return isPermanent;
    }

    public void setPermanent(boolean permanent) {
        isPermanent = permanent;
    }
}

