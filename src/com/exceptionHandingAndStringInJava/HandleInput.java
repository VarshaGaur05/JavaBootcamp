package com.exceptionHandingAndStringInJava;

import java.util.*;

public class HandleInput {
    /*Description
Suppose you are performing X/Y operations, where X and Y are integers. You are required to enclose the operations in a try-catch block to ensure that you catch the divide by 0 and the Input mismatch exception. You must implement a try-catch-catch block where, in case of an Input mismatch exception, the output is “Wrong Input” and where, in case of divide by 0, the output is “Divide by 0 error”. In case there is no error, try block should print the integer value of “X/Y”.
Input: X = 20, Y = 0
Output: Divide by 0 error
Input: X = 20, Y = “SAM”
Output: Wrong Input
public static void main(String[] args) {
	    try{
		Scanner scanner = new Scanner(System.in);
		int X = scanner.nextInt();
		int Y = scanner.nextInt();
		   scanner.close();
		   System.out.println(divideInput(X,Y));
    }
    catch(ArithmeticException e){
        System.out.println("Divide by 0 error");
    }
    catch(InputMismatchException e){
        System.out.println("Wrong Input");
    }		    //take input and do divide operation inside try-catch block.
}

	public static int divideInput(int X, int Y)
      {
     int divide;
     divide = X / Y;
     return divide;
     }

     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try{

            int X = scanner.nextInt();
            int Y = scanner.nextInt();
            System.out.println(X/Y);

        }catch(InputMismatchException e){
            System.out.println("Wrong Input");
        }
        catch(ArithmeticException e){
            System.out.println("Divide by 0 error");
        }
    }
}

