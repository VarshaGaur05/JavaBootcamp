package com.company;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ElementInTheArray {
    /*
    Description
You are given an array and a number. You are required to complete the function to print whether the element is present in the array or not. No input is required from your end. You must output either a yes or no.





Input: [1, 5, 7, 3, 4, 8, 0], 4

Output: yes



Input: [1, 5, 7, 3, 4, 8, 0], 9

Output: no
     */
    public static void main(String args[] ) throws Exception {
        Scanner scanner = new Scanner (System.in);

        int sizeOfarray = scanner.nextInt();
        int arr[] = new int [sizeOfarray];
        for(int i=0; i<sizeOfarray;i++)
            arr[i] = scanner.nextInt();
        int number = scanner.nextInt();
        Find(arr, number);

    }

    public static void Find(int arr[], int number)
    {

        int i;
        int n = arr.length;

        String test = "yes";
        for (i= 0 ; i<n;i++) {
            if (arr[i] == number) {
                test = "yes";
                break;
            }else{
                test ="no";
            }
        }
        System.out.println(test);


        //complete the function here and output yes or no.
    }
}
