package com.collections;

import java.util.*;

public class CountUnique {
    /*Description
You are given an arraylist of integers. You do not need to take the input and print the output. Just complete the function CountUnique(), which takes the arraylist as the argument and returns an integer as the number of unique elements.



Input: [1,2,2,3,4,5,2,4]

Output: 5

     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();

        ArrayList<Integer> inputlist =  new ArrayList<>();


        for(int i=0; i<size;i++)
            inputlist.add(scanner.nextInt());

        System.out.println( CountUnique(inputlist));

    }

    public static int CountUnique( ArrayList<Integer> inputlist){

        //complete the function and return the integer as the number of unique elements in arraylist.
        Set <Integer> set = new TreeSet<>();

        for(int i=0; i<inputlist.size();i++)
            set.add(inputlist.get(i));

        return set.size();

    }
}

