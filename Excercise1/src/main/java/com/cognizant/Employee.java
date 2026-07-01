package com.cognizant;

public class Employee {

    private int id;
    private String name;

    public Employee() {
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void showDetails() {
        System.out.println("Employee Id : " + id);
        System.out.println("Employee Name : " + name);
    }
}