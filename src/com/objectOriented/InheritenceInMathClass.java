package com.objectOriented;

public class InheritenceInMathClass {
    /*
    Description
Complete the following code to implement the inheritance to define class Add and class Math. The class Add should inherit class Math (i.e. Class Math should be superclass). Complete the extended class definition.
Define the Adding function inside the Math class which takes two/three numbers and returns the sum.
INPUT: No input required
OUTPUT:
My superclass is: MathClass
3 7 18
NOTE: The Adding() function should be overloaded to make the function work. Check the main function and complete the code.
     */
    public static void main(String[] args) {

        Add a = new Add();
        System.out.println("My superclass is: " + a.getClass().getSuperclass().getName());
        System.out.print(a.Adding(1,2) + " " + a.Adding(3,4) + " " + a.Adding(5,6,7) + "\n");

    }
}
class MathClass {
    //define the class here


    public int Adding(int a, int b){
        return a+b;
    }
    public int Adding(int a, int b, int c){
        return a+b+c;
    }

}

class Add extends MathClass{

}

/*
class MathClass {

    //define the class here
    int Adding(int a, int b){
        return a+b;
    }

    int Adding(int a, int b, int c){
        return a+b+c;
    }
}

class Add extends MathClass {
    Add(){}
}

 */
