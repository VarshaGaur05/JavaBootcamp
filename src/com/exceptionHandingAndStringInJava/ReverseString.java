package com.exceptionHandingAndStringInJava;

import java.util.Scanner;

public class ReverseString {
    /*Description
Write a Java program that takes a single string as an input and prints the reverse of that string. You need to complete the function. Input and Output will be handled by the main function.
Input format:
String as input
Output format:
Reversed string as output
Sample input 1:
upgrad
Sample output 1:
dargpu
Explanation 1:
The reverse of the input string.
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String inputstring = scanner.next();
        System.out.println(reverse(inputstring));

    }

    public static String reverse(String str) {
        //write your code here
        String p = "";
        for (int i=str.length()-1; i>=0;i--)
            p=p+str.charAt(i);

        return p;
    }
    /*
    public static String reverse(String str) {
		//write your code here
		char ch;
		String nstr="";
		for(int i=0; i< str.length(); i++){
            ch= str.charAt(i); //extracts each character
            nstr= ch+nstr;
		}
		return nstr;
	}
public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    System.out.println(reverse(str));
  }
     */
}
