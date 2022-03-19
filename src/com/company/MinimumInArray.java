package com.company;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MinimumInArray {
    /*Description
You are given an array. You are required to complete the function to print the minimum element in the array. No input is required from your end.



Hint: Think about how sorting can be used here.



Input: [1, 5, 7, 3, 4, 8, 0]

Output: 0

     */
    public static void main(String args[] ) throws Exception {
        Scanner scanner = new Scanner (System.in);

        int sizeOfarray = scanner.nextInt();
        int arr[] = new int [sizeOfarray];
        for(int i=0; i<sizeOfarray;i++)
            arr[i] = scanner.nextInt();

        FindMinimum(arr);
    }
    public static void FindMinimum(int arr[])
    {
        int n = arr.length;
        int minvalue = arr[0];
        for(int i=0; i<n; i++){
            if(arr[i] < minvalue){
                minvalue = arr[i];
            }

        }
        System.out.print(minvalue);

        //complete the function here to output the minimum value
    }
}