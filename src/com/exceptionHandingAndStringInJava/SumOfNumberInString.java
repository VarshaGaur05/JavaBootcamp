package com.exceptionHandingAndStringInJava;

import java.util.Scanner;

public class SumOfNumberInString {
    /*
    Description
You are given a string and you need to add the numbers appearing in the string. You do not need to input or output anything. You just need to complete the function, Add() and return the sum. You will be provided with the String input.
Input: oiowjfow1oijo12joijoij1ojoioih3
Output: 8
Explanation: The numbers appearing are: 1, 1, 2, 1 and 3 which adds up to 8.
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String inputstring = scanner.next();
        System.out.println(Add(inputstring));

    }

    public static int Add(String inputstring) {

        int sum = 0;
        for(int i=0; i<inputstring.length();i++){

            int n = inputstring.charAt(i) - '0';
            if(n>=0 && n<=9)
                sum=sum+n;

        }

        return sum;
    }
    /*	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String inputstring = scanner.next();
		System.out.println(Add(inputstring));

	}

public static int Add(String inputstring) {
		// A temporary string
        char[] c = inputstring.toCharArray();
        int sum = 0;
        // read each character in input string
        for (int i = 0; i < c.length; i++) {
            if (Character.isDigit(c[i])) {
                int a = Integer.parseInt(String.valueOf(c[i]));
                sum = sum + a;
            }
        }
        return sum;
	}

     */
}
