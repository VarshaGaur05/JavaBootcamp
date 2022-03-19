package com.objectOriented;
import java.util.*;

public class PrintRectangle {
    /*
    Description
Take a number n and try printing a rectangle pattern with the length as 2*n stars and breadth as n stars. No input is needed from your end. You just need to complete the Patternprint() function, which prints the pattern.
Input: 4
Output:
* * * * * * * *
* * * * * * * *
* * * * * * * *
* * * * * * * *
Note: There is a space between the stars.
     */
    public static void main (String[]args)
    {
        Scanner scanner = new Scanner (System.in);
        int n = scanner.nextInt ();
        Patternprint(n);
    }

    static void Patternprint (int n)
    {
        //complete the function
        for(int i =0; i< n ;i++){
            for(int j=0; j< 2* n; j++){
                System.out.print("* ");
            }
            System.out.println(" ");
        }
        System.out.println("");
    }

    /*
    static void Patternprint (int n)
  {
   //complete the function
    for (int i = 0; i < n; i++){
        for (int j = 0; j < 2*n; j++)
        System.out.print("* ");
        System.out.println("");
    }

  }

     */

}
