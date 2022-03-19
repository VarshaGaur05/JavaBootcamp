package com.objectOriented;
import java.util.*;

public class LargestDifference {
    /*
    Description
Taking the given array as the input, write a Java program to find the largest difference between two integers in the array. No input and output are needed from your end. You only need to complete the FindMaxDiff() function, which returns the largest difference between the integers in an array. The main function will take care of printing the number.
Note: The array will contain both positive and negative numbers and the size of array will always be greater than or equal to two.
Input: [1, -4, 3, 5, 2, 4]
Output: 9
Explanation: You can find the maximum difference by picking 5 and -4 and subtracting them
     */
    public static void main (String[]args)
    {
        Scanner scanner = new Scanner (System.in);
        int size = scanner.nextInt ();
        int arr[] = new int[size];

        for (int i = 0; i < size; i++)
            arr[i] = scanner.nextInt ();

        System.out.println (FindMaxDiff (arr));

    }

    static int FindMaxDiff (int arr[])
    {
        //complete the function
        Arrays.sort(arr);
        return arr[arr.length-1] - arr[0];
    }

}
