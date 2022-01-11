package com.revature.models;
import java.util.Objects;

public class Manager {

    private String firstName;
    private String lastName;
    private int salary;
//    private Home home;

    public Manager() {
    }

    public Manager(String firstName, String lastName, int salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
//        this.home = home;
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

    public void setReaName(String realName) {
        this.realName = realName;
    }

    public int getPowerLevel() {
        return powerLevel;
    }

    public void setPowerLevel(int powerLevel) {
        this.powerLevel = powerLevel;
    }

    public Home getHome() {
        return home;
    }

    public void setHome(Home home) {
        this.home = home;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Avengers avengers = (Avengers) o;
        return powerLevel == avengers.powerLevel && Objects.equals(superheroName, avengers.superheroName) && Objects.equals(realName, avengers.realName) && Objects.equals(home, avengers.home);
    }

    @Override
    public int hashCode() {
        return Objects.hash(superheroName, realName, powerLevel, home);
    }

    @Override
    public String toString() {
        return "Avengers{" +
                "superheroName='" + superheroName + '\'' +
                ", realName='" + realName + '\'' +
                ", powerLevel=" + powerLevel +
                ", home=" + home +
                '}';
    }
