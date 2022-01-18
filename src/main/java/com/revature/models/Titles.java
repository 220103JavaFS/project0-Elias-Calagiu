package com.revature.models;

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
}
