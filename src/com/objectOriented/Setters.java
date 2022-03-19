package com.objectOriented;
import java.util.*;


public class Setters {
    /*
    Description
Given a string as an input, create an object of the given Person class, and initialise that object by assigning the input string to the ‘name’ variable using the setter method. You do not need to input or output anything, just complete the setter definition.
Input:
Ankit
Output:
Ankit
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        SetPerson p = new SetPerson();
        p.setName(name);
        System.out.println(p.getName());
    }
}

 class SetPerson {
    private String name;
    public String getName() {
        return name;
    }
    //Define setters here.
    public void setName(String name){
        this.name = name;
    }
}
