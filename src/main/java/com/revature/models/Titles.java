package com.revature.models;

import java.util.Objects;

public class Titles {

private int id;
private String titleName;
private int titleSalary;

public Titles(){

}

    public Titles(int id, String titleName, int titleSalary) {
        this.id = id;
        this.titleName = titleName;
        this.titleSalary = titleSalary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitleName() {
        return titleName;
    }

    public void setTitleName(String titleName) {
        this.titleName = titleName;
    }

    public int getTitleSalary() {
        return titleSalary;
    }

    public void setTitleSalary(int titleSalary) {
        this.titleSalary = titleSalary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Titles titles = (Titles) o;
        return id == titles.id && titleSalary == titles.titleSalary && Objects.equals(titleName, titles.titleName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, titleName, titleSalary);
    }
}