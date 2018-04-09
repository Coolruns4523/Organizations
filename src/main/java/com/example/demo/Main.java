package com.example.demo;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Declaring all variables at the top
        Scanner keyboard = new Scanner (System.in);
        Organization anOrganization;
        Employee employees;
        String employeeAnswer= "";
        String organizationAnswer= "";
        boolean employeeDone = false;
        boolean organizationDone = false;

        ArrayList <Organization> allOrganizations = new ArrayList<>();


        do{
            System.out.println("Enter name of Organization: ");
            anOrganization = new Organization(keyboard.nextLine());

            System.out.println("Your organization is called: "+anOrganization.getName());

                do{
                    employees = new Employee();
                    System.out.println("Enter Employee work number: ");
                    employees.setWorkNumber(keyboard.nextLine());

                    System.out.println("Enter Employee first name: ");
                    employees.setFirstName(keyboard.nextLine());

                    System.out.println("Enter Employee last name: ");
                    employees.setLastName(keyboard.nextLine());

                    System.out.println("Your Employee information: Employee Work Number:"+employees.getWorkNumber()
                            +"Employee first name:"+employees.getFirstName()+"Employee Last Name:"+employees.getLastName());

                    anOrganization.addEmployee(employees);

                    System.out.println("Do you want to enter another Employees information?");
                    employeeAnswer=keyboard.nextLine();

                    if(employeeAnswer.equalsIgnoreCase("no") || employeeAnswer.equalsIgnoreCase("n"))
                        employeeDone = true;
                    //I am employeeDone.

                    System.out.println("You responded: " + (employeeDone? "I am done":"I am not done"));

                }while(!employeeDone);

                allOrganizations.add(anOrganization);

                System.out.println("Do you want to enter another Organization?");
                organizationAnswer=keyboard.nextLine();
                if (organizationAnswer.equalsIgnoreCase("no")||organizationAnswer.equalsIgnoreCase("n")){
                    organizationDone = true;
            }
        }while (!organizationDone);

        for (Organization eachOrganization:allOrganizations){
            System.out.println("These are employees for " +eachOrganization.getName());
            for (Employee eachEmployee:eachOrganization.getTheEmployees())
            {
                System.out.println("These are the details of the employees: Employee Number: "+eachEmployee.getWorkNumber()+"First Name: " +eachEmployee.getFirstName()+ "Last Name: "+eachEmployee.getLastName());
            }
        }
    }
}
