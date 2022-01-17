package com.revature.models;

import java.util.Objects;

public class Intern extends Employee{

    public Intern(String firstName, String lastName, int salary) {
        super();
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
//        this.home = home;
    }

    public Intern(String firstName, String lastName, int salary) {
        super(firstName, lastName, salary);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getlastName() {
        return lastName;
    }

    public void setlastName(String lastName) {
        this.lastName = lastName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

//    public Home getHome() {
//        return home;
//    }

//    public void setHome(Home home) {
//        this.home = home;
//    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Manager manager = (Manager) o;
        return salary == manager.salary && Objects.equals(firstName, manager.firstName) && Objects.equals(lastName, manager.lastName) && Objects.equals(home, avengers.home);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, salary, home);
    }

    @Override
    public String toString() {
        return "Manager{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", salary=" + salary +
                ", home=" + home +
                '}';
    }
}
