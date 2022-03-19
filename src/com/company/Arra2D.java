package com.company;

import java.util.Scanner;

/*Description
Write a Java code that takes two numbers x and y as the input and generates a two-dimensional (2D) array, where the value in the i-th row and j-th column of the array is (i+j)/2.

Note: The indexing in the array follows: i=0,1,...x-1 and j=0,1....,y-1

The input will have two integers: x and y.
The output should be a 2D array.


 */
public class Arra2D {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();

        double [][]arr = new double[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = (i+j)/2.0;
                System.out.print((arr[i][j]) + " ");
            }

            System.out.println();
        }

    }
}
