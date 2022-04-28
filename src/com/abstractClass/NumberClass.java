package com.abstractClass;

import java.util.*;

/*'Number' class
Description
Declare a parameterised constructor in the Number class that will take the real and imaginary parts of a number as input. The Number class should contain the getter and setter methods for getting and setting the real and imaginary parts of a number. Create two more classes ‘Complex’ and ‘PurelyImaginary’. Class Complex extends the Number class and checks if the input number is complex or not using checkComplex(). The PurelyImaginary class inherits the Complex class and decides if the input number is purely imaginary using checkPurelyImaginaryNumber().

Input:  Your program should take the following input:
The first line will be the real part of the number.
The next line will contain the imaginary part of the number.

Output: The output of your program will consist of four lines:
The first line will display the imaginary part of the input number.
The next line will print “The given number is complex” if the number is complex; else, it will print “The given number is real”.
The third line will display the number in the standard format, which is:
x + iy.
        4. The last line will display “The number is purely imaginary” if the number is purely imaginary; else, it will print “The number is not purely imaginary”.


Note: If the number is purely imaginary then print only the imaginary part of it like “i8”

Sample Input:
5
1.6
Sample Output:
1.6
The given number is complex
5.0+i1.6
The number is not purely imaginary

 */

class Number {
    //Write your code here
    private double real;
    private double imaginary;

    public Number(double real,double imaginary){
        this.real=real;
        this.imaginary=imaginary;
    }

    public void setReal(double real){
        this.real = real;
    }

    public double getReal(){
        return this.real;
    }
    public void setImaginaryPart(double imaginary){
        this.imaginary = imaginary;
    }
    public double getImaginaryPart() {
        //Write your code here
        return this.imaginary;
    }
}

class Complex extends Number {
    //Write your code here
    public Complex(double real, double imaginary){
        super(real, imaginary);
    }
    public void checkComplex(){
        if(this.getImaginaryPart() != 0.0) {
            System.out.println("The given number is complex");
        }
        else{
            System.out.println("The given number is real");
        }
    }

}

class PurelyImaginary extends Complex {

    //Write your code here
    public PurelyImaginary(double real, double imaginary){
        super(real, imaginary);
    }
    public void checkPurelyImaginaryNumber() {
        if(this.getReal() == 0.0 && this.getImaginaryPart()!=0.0) {
            System.out.println("i"+this.getImaginaryPart());
            System.out.println("The number is purely imaginary");

        }
        else {
            System.out.println(this.getReal() + "+i"+this.getImaginaryPart());
            System.out.println("The number is not purely imaginary");
        }
    }
}

public class NumberClass {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PurelyImaginary num = new PurelyImaginary(in.nextDouble(), in.nextDouble());
        System.out.println(num.getImaginaryPart());
        num.checkComplex();
        num.checkPurelyImaginaryNumber();

    }
}
