package com.revature.models;

import java.util.Objects;

public class Employee {

    private int employeeId;
    private String firstName;
    private String lastName;
    private String employeeUsername;
    private String employeePassword;
    private Titles titleID;
    private Department departmentID;

    public Employee(String firstName, String lastName, String employeeUsername, String employeePassword, Titles titleID, Department departmentID) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.employeeUsername = employeeUsername;
        this.employeePassword = employeePassword;
        this.titleID = titleID;
        this.departmentID = departmentID;
    }

    public Employee(int employeeId, String firstName, String lastName, String employeeUsername, String employeePassword, Titles titleID, Department departmentID) {
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.employeeUsername = employeeUsername;
        this.employeePassword = employeePassword;
        this.titleID = titleID;
        this.departmentID = departmentID;
    }

    public Employee() {
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
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

    public String getEmployeeUsername() {
        return employeeUsername;
    }

    public void setEmployeeUsername(String employeeUsername) {
        this.employeeUsername = employeeUsername;
    }

    public String getEmployeePassword() {
        return employeePassword;
    }

    public void setEmployeePassword(String employeePassword) {
        this.employeePassword = employeePassword;
    }

    public Titles getTitleID() {
        return titleID;
    }

    public void setTitleID(Titles titleID) {
        this.titleID = titleID;
    }

    public Department getDepartmentID() {
        return departmentID;
    }

    public void setDepartmentID(Department departmentID) {
        this.departmentID = departmentID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        Employee employee = (Employee) o;
        return getEmployeeId() == employee.getEmployeeId() && Objects.equals(getFirstName(), employee.getFirstName()) && Objects.equals(getLastName(), employee.getLastName()) && Objects.equals(getEmployeeUsername(), employee.getEmployeeUsername()) && Objects.equals(getEmployeePassword(), employee.getEmployeePassword()) && Objects.equals(getTitleID(), employee.getTitleID()) && Objects.equals(getDepartmentID(), employee.getDepartmentID());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getEmployeeId(), getFirstName(), getLastName(), getEmployeeUsername(), getEmployeePassword(), getTitleID(), getDepartmentID());
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", employeeUsername='" + employeeUsername + '\'' +
                ", employeePassword='" + employeePassword + '\'' +
                ", titleID=" + titleID +
                ", departmentID=" + departmentID +
                '}';
    }
}