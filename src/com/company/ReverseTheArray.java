package com.company;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ReverseTheArray {
    /*
    Description
Given an array. You need to complete the function to print the element in reverse order. No input is required from your end. You are provided with an array. You need to output the reversed array.



Input: [1, 5, 7, 3, 4, 8, 0]

Output: 0 8 4 3 7 5 1

Note: Output Each Number with a space in the same line.



Hint: Try to solve the question without using any additional array.
     */
    public static void main(String args[] ) throws Exception {
        Scanner scanner = new Scanner (System.in);

        int sizeOfarray = scanner.nextInt();
        int arr[] = new int [sizeOfarray];
        for(int i=0; i<sizeOfarray;i++)
            arr[i] = scanner.nextInt();

        PrintReverseArray(arr);

    }
    public static void PrintReverseArray(int arr[])
    {
        //complete the function here to print reverse array.
        int n = arr.length;
        int[] b = new int[n];
        int j = n;
        for (int i = 0; i < n; i++) {
            b[j - 1] = arr[i];
            j = j - 1;
        }

        // printing the reversed array
        for (int k = 0; k < n; k++) {
            System.out.print(b[k]+" ");
        }
    }
}
