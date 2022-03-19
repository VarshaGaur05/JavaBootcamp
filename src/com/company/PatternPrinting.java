package com.company;
import java.util.*;
public class PatternPrinting {
    /*
    Description
Given an integer n, print the triangle. You need to read the integer as input and output the triangle as shown below.



Input: 6

Output:

     *

    * *

   * * *

  * * * *

 * * * * *

* * * * * *

     */
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
//code here
        int n = scanner.nextInt();

        for(int i = 1; i <= n ; i++){
            for (int j = n; j >= i; j--) {
                System.out.print(" ");
            }

            for(int k = 1 ; k <= i; k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
