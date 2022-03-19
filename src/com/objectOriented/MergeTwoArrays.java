package com.objectOriented;
import java.util.*;

public class MergeTwoArrays {
    /*
    Description
Given two arrays. You need to merge the two arrays to make a third array and sort. You just need to complete the MergeArray() function which returns the sorted merged array. The user is not required to read the input and also the main function takes care of printing the merged array.
Input: [2, 4, 9, 5, 1] [6, 3, 8, 7, 0]
Output: 1 2 3 4 5 6 7 8 9
     */

    public static void main (String[]args)
    {
        Scanner scanner = new Scanner (System.in);
        int size1 = scanner.nextInt ();

        int arr1[] = new int[size1];
        for(int i=0; i<size1; i++)
            arr1[i] = scanner.nextInt();

        int size2 = scanner.nextInt ();
        int arr2[] = new int[size2];
        for(int i=0; i<size2; i++)
            arr2[i] = scanner.nextInt();

        int arr3 [] = MergeArray(arr1, arr2);

        for(int i=0; i<arr3.length; i++)
            System.out.print(arr3[i]+" ");

    }
    static int[] MergeArray (int arr1[], int arr2[])
    {
        //complete the function
        int n1 = arr1.length;
        int n2 = arr2.length;
        int[] arr3 = new int[n1+n2];
        for (int i=0; i<n1; i++) {
            arr3[i] = arr1[i];
        }
        for (int i=0; i<n2; i++) {
            arr3[n1+i] = arr2[i];
        }
        Arrays.sort(arr3);
        return arr3;

    }

}
