package com.cognizant;

public class Employee {

    private int id;
    private String name;
    private Address address;

    public Employee() {
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void showDetails() {

        System.out.println("Employee Id : " + id);
        System.out.println("Employee Name : " + name);

        address.displayAddress();
    }
}