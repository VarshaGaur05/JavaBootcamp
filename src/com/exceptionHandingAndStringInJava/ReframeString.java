package com.exceptionHandingAndStringInJava;

import java.util.Scanner;

public class ReframeString {
    /*Description
You are given a string as the input. You are required to convert the entire string, except for the first alphabet, to lowercase. The first character (i.e., the alphabet) should be uppercase. You must take the string input and print the converted string.
Input: hihowisTheHeLLoWoRLd
Output: Hihowisthehelloworld
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();

        //SUBSTRING BREAKS THE STRING, UPPERCASES THE FIRST, LOWER     CASE THE REST AND THEN JOINS THEM.
        s=s.substring(0,1).toUpperCase()+s.substring(1).toLowerCase();
        System.out.println(s);

    }
    /*
    public static void main(String[] args) {
		//Take the input string, do the operation and print the string.
		Scanner sc= new Scanner(System.in);
		String str = sc.nextLine();
		//StringBuffer str = new StringBuffer(input);
        // Calling the Method
        //convertOpposite(str);
        String firstLetStr = str.substring(0, 1);
        // Get remaining letter using substring
        String remLetStr = str.substring(1);

        // convert the first letter of String to uppercase
        firstLetStr = firstLetStr.toUpperCase();
        remLetStr = remLetStr.toLowerCase();

        // concantenate the first letter and remaining string
        String firstLetterCapitalizedName = firstLetStr + remLetStr;


        System.out.println(firstLetterCapitalizedName);
	}

     */
}
