package com.example.demo;

public class Employee {

    private String workNumber;
    private String firstName;
    private String lastName;

    public Employee(String workNumber, String firstName, String lastName)
    {
        this.workNumber = workNumber;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Employee(){

    }


    public String getWorkNumber() {
        return workNumber;
    }

    public void setWorkNumber(String workNumber) {
        this.workNumber = workNumber;
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
}
