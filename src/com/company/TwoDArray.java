package com.company;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class TwoDArray {
    /*
    Description
Write a Java code that takes two numbers x and y as the input and generates a two-dimensional (2D) array, where the value in the i-th row and j-th column of the array is (i+j)/2.



Note: The indexing in the array follows: i=0,1,...x-1 and j=0,1....,y-1



The input will have two integers: x and y.

The output should be a 2D array.



Sample input:

3

4



Sample output:

0.0 0.5 1.0 1.5

0.5 1.0 1.5 2.0

1.0 1.5 2.0 2.5



Note: Output the number with a single space.

     */
    public static void main(String args[] ) throws Exception {
        // Enter your code here.
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();

        double [][]arr = new double[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = (i+j)/2.0;
                System.out.print(arr[i][j]+ " ");
            }

            System.out.println();
        }
    }
}
