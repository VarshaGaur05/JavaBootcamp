package com.objectOriented;
import java.util.*;


public class StudentClass {
    /*
    Description
Declare a constructor in the Student class and then create a new object named s1 (name - karan | roll number - 1056 | cgpa - 8.8). Then, call the method displayProfile( ) below. Also, print the details of the percentage of s1 using the findPercentage( ) method.
The findPercentage() method should be used in printing ‘Percentage of s1 is 88.0’. Check the sample output below.
Input:
No input required
Output:
1056 karan 8.8
Percentage of s1 is 88.0
     */

    public static void main(String[] args) {

        // Create an object named 's1' and complete the code to print the desired output
        Student s1=new Student(1056,"karan",8.8);
        s1.displayProfile();
        System.out.print("Percentage of s1 is " +s1.findPercentage());
    }
}

class Student {
    public int rollno;
    public String name;
    public double cgpa;

    // Declare constructor of 'Student' class here
    public Student(){
        rollno=0;
        name=null;
        cgpa=0.0;
    }
    public Student(int rollno,String name,double cgpa){
        this.rollno= rollno ;
        this.name=name;
        this.cgpa=cgpa;
    }
    public void displayProfile() {
        System.out.println(rollno + " " + name + " " + cgpa);
    }
    public double findPercentage() {
        double percent = cgpa * 10;
        return percent;
    }
}
