package com.collections;

import java.util.*;

public class ArrangeString {
    /*Description
You are given a string. You are required to arrange the alphabetical characters in ascending order. You do not need to take any input or print output, as the main function will take care of that. You just need to complete the ArrangeString() function, which accepts the string as a parameter and returns the arranged string.



Note: All characters are lowercase.

Hint: Try breaking the string into individual characters.



Input: upgrad

Output: adgpru

public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    String inputstring = scanner.next();

	   System.out.println( ArrangeString(inputstring));

	}

	public static String ArrangeString( String inputstring){
	  //write your code here and return the arranged string
	  char charArray[] = inputstring.toCharArray();
      Arrays.sort(charArray);
      String assString = new String(charArray);
     return assString;

	}

     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputstring = scanner.next();

        System.out.println( ArrangeString(inputstring));

    }

    public static String ArrangeString( String inputstring){

        String output = "";

        String arr [] = new String[inputstring.length()];
        for(int i=0; i<inputstring.length(); i++)
            arr[i] = inputstring.charAt(i)+"";

        Arrays.sort(arr);

        for(int i=0; i<inputstring.length(); i++)
            output=output+arr[i];

        return output;

    }
}
