package com.cognizant;

public class Employee {

    private int id;
    private String name;
    private Department department;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public void showDetails() {

        System.out.println("Employee Id : " + id);
        System.out.println("Employee Name : " + name);
        System.out.println("Department : " + department.getDepartmentName());

    }
}