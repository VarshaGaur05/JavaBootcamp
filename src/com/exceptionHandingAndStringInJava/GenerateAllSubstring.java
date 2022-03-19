package com.exceptionHandingAndStringInJava;

import java.util.Scanner;

public class GenerateAllSubstring
{
    /*
    Description
A substring is defined as the contiguous sequence of characters within a string.
For example: The substrings of banana are b, ba, ban, bana, banan, banana, a, an, ana, anab ans so on. Read about substrings here.
You are given a string. You are required to print all the substrings of that string. You must read the string input, generate the substring in ascending sequence and print the substrings separated by space.
Hint: Think of substring methods here.
Input: cat
Output: c ca cat a at t
     */
    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    String inputstring = scanner.next();


    for(int i=0; i<inputstring.length();i++){
        for(int j=i+1; j<=inputstring.length();j++)
            System.out.print(inputstring.substring(i,j)+" ");
    }
}

    /*
    	public static void main(String[] args) {
         //write the code here.
         Scanner sc = new Scanner(System.in);
         String inputString = sc.next();
         printAllSubstrings(inputString);
         sc.close();

	}

	private static void printAllSubstrings(String inputString)
    {
       // System.out.println(inputString);
        StringBuilder subSring;

        for (int i = 0; i < inputString.length(); i++)
        {
            subSring = new StringBuilder().append(inputString.charAt(i));
            System.out.print(subSring+" ");
            for (int j = i+1; j < inputString.length(); j++)
            {
                subSring.append(inputString.charAt(j));
                System.out.print(subSring+" ");
            }
        }
    }
     */
}
