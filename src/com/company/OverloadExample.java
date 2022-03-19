package com.company;
import java.io.*;
        import java.util.*;
        import java.text.*;
        import java.math.*;
        import java.util.regex.*;

/*Overloaded
Description
Given the following code, you need to use the concept of overloading to declare the method named
Add inside the Domath class for returning the sum of both operation-1 and operation-2.



Operation - I : DoMath.Add(11,11)

Operation - II : DoMath.Add(12.3,12.6)

 */
public class OverloadExample {
    public static void main(String args[] ) throws Exception {
        System.out.println(DoMath.Add(11,11));
        System.out.println(DoMath.Add(12.3,12.6));
    }
}
class DoMath{
    //write the code for Add here.
    static int Add(int a, int b)
    {
        int sum = a + b;
        return sum;
    }
    static double Add(double a, double b)
    {
        double sum = a + b;
        return sum;
    }


}
