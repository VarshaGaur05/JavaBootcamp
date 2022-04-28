package com.abstractionAndEncapsulation;
/*Abstraction
Description
Create a class “Employee” that consists of the following details of the employee:
Employee ID
Employee First Name
Employee Last Name.
Employee monthly pay.
Create two objects of “Employee” class E1 and E2 and pass the details of two employees as: {101512031, Sushil, Kumar, 45000.58} and {101512032, Tara, Sharma,51000.99} in the main class i.e. “Source”. Print the full name and annual income of both the employees.

Output: The output should be in the following format:
employee full name Sushil Kumar
employee annual package 540006.96
employee full name Tara Sharma
employee annual package 612011.88

 */
class Employee {

    private int empId;
    private String empFirstName;
    private String empSecondName;
    private double empSalary;

    public Employee(int id, String firstname, String secondName, double salary) {

        this.empId = id;
        this.empFirstName = firstname;
        this.empSecondName = secondName;
        this.empSalary = salary;

    }

    public int getId() {
        return empId;
    }

    public String getFirstName() {
        return empFirstName;
    }

    public String getSecondName() {
        return empSecondName;
    }

    public String getFullName() {
        return getFirstName() + " " + getSecondName();
    }

    public double getSalary() {
        return empSalary;
    }

    public double getAnnualPay() {
        return 12 * getSalary();
    }


}

public class EmployeeDetails {
    public static void main(String[] args) {
        Employee E1 = new Employee(101512031, "Sushil", "Kumar", 45000.58);
        System.out.println("employee full name" + " " + E1.getFullName());
        System.out.println("employee annual package" + " " + E1.getAnnualPay());

        Employee E2 = new Employee(101512032, "Tara", "Sharma", 51000.99);

        System.out.println("employee full name" + " " + E2.getFullName());
        System.out.println("employee annual package" + " " + E2.getAnnualPay());
    }
}

