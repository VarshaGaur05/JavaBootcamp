package com.objectOriented;
import java.util.*;
public class TheFibonacci {
    /*
    Description
A fibonacci sequence is defined as the sequence of numbers where the next term is the sum of the previous two terms. The first two terms are 0 and 1. The sequence is as follows:
0 1 1 2 3 5 8 13 21 34 …
Given a number n as input. You have to print the term in the sequence at the nth spot. Write the full code.
Note: The indexing starts from 0.
Sample Input: 0
Sample Output 0
Explanation: The 1st term of the sequence is 0.
Sample Input: 6
Sample Output 8
     */
    public static void main (String[]args)
    {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        if (n<=1) {
            System.out.println(n);
        }else{
            int a=0, b=1, c=a+b;
            for (int i=2; i<=n; i++) { // n-1
                c = a+b;
                a=b;
                b=c;
            }
            System.out.println(c);
        }
    }

}
