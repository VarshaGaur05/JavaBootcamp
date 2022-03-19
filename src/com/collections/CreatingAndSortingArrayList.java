package com.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class CreatingAndSortingArrayList {
    /*Description
    You are given an array. You are required to create an ArrayList<>() and store all the elements of the array in the arraylist and return the sorted arraylist. You do not need to take the input and print the output. Just complete the function intoArrayList(), which returns the sorted arraylist for the given array.
     Input: [3, 1, 7, 4, 2]
    Output: 1 2 3 4 7
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int arr[] = new int [size];

        for(int i=0; i<size;i++)
            arr[i] = scanner.nextInt();


        ArrayList<Integer> list =  intoArrayList(arr);

        System.out.println(list);

    }

    public static ArrayList<Integer> intoArrayList(int arr[]){

        ArrayList<Integer> list =  new ArrayList<>();
        for(int i=0; i<arr.length; i++)
            list.add(arr[i]);

        Collections.sort(list);
        return list;

    }
}
