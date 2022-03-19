package com.company;

public class StudentData {
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
