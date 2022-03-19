package com.collections;

import java.util.ArrayList;
import java.util.Scanner;

public class ReverseArrayList {
    /*Description
You are given an ArrayList<>(). You are required to reverse the arraylist. You do not need to take the input and print the output. Just complete the function reverseArrayList(), which takes the arraylist as the argument and returns the reversed arraylist.
Input: [3, 1, 7, 4, 2]
Output: 2 4 7 1 3
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();

        ArrayList<Integer> inputlist =  new ArrayList<>();


        for(int i=0; i<size;i++)
            inputlist.add(scanner.nextInt());


        ArrayList<Integer> list =  reverseArrayList(inputlist);

        System.out.println(list);

    }

    public static ArrayList<Integer> reverseArrayList(ArrayList<Integer> inputlist){

        ArrayList<Integer> outputArraylist =  new ArrayList<>();

        for(int i=0; i<inputlist.size();i++)
            outputArraylist.add(0,inputlist.get(i));

        return outputArraylist;

    }
}
