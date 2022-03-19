package com.objectOriented;

public class Getter {
    /*
    Description
Create an object of the given Person class with parameterised constructor initialising the name variable to ‘Ankit’, and then print the value of ‘name’ variable using the getter method.
Input:
No Input Required
Output:
Ankit
     */
    public static void main(String[] args) {

        // Write code here
        Person s1=new Person("Ankit");
        s1.PersonDetails();

    }
}

class Person {
    private String name;
    public Person(String name) {
        this.name = name;
    }

    // Declare a getter method here
    public void PersonDetails(){
        System.out.println(name);
    }
}
