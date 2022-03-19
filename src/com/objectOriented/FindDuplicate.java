package com.objectOriented;
import java.util.*;
public class FindDuplicate {
    /*
    Description
Taking the given array as the input, write a Java program to find the integer that is being repeated. No input and output are needed from your end. You only need to complete the FindDup() function, which returns the repeating integer. The main function will take care of printing the number.
Note: There will always be a single duplicate element in the array.
Input: [1. 4, 3, 5, 2, 4]
Output: 4
     */
    public static void main (String[]args)
    {
        Scanner scanner = new Scanner (System.in);
        int size = scanner.nextInt ();
        int arr[] = new int[size];

        for (int i = 0; i < size; i++)
            arr[i] = scanner.nextInt ();

        System.out.println (FindDup (arr));

    }
    static int FindDup (int arr[])
    {
        //complete the code here.
        for(int i=0; i < arr.length;i++){
            for(int j=i + 1; j< arr.length;j++){
                if(arr[i] == arr[j]){
                    return arr[j];
                }
            }
        }
        return 0;
    }
    /*
    static int FindDup (int arr[])
  {
    Arrays.sort(arr);
    for(int i=0; i<arr.length-1;i++)
    {
        if(arr[i]==arr[i+1])
        return arr[i];
    }
    return -1;
  }
     */

}
