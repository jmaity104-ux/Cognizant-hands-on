package com.cognizant;

public class Address {

    private String city;
    private String state;

    public Address() {
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void displayAddress() {
        System.out.println("City : " + city);
        System.out.println("State : " + state);
    }
}