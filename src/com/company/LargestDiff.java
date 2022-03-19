package com.company;

import java.util.*;
public class LargestDiff
{
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

