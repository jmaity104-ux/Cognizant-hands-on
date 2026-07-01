package com.cognizant;

public class Student {

    private int id;
    private String name;
    private String course;

    public Student() {
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public void showDetails() {

        System.out.println("Student Id : " + id);
        System.out.println("Student Name : " + name);
        System.out.println("Course : " + course);

    }
}