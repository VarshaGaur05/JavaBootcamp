package com.arrayArrayList;
/*Creating ArrayList Using Generics
Description
Complete the code below to create an ArrayList named ‘random’, using Generics, with five elements — 2, 4, 5, 10, and 99.9 — stored as float-type values in ArrayList, and then, print this ArrayList using the printList method.

Sample input
There is no input for this program.

Expected output
2.0
4.0
5.0
10.0
99.9

 */

import java.util.ArrayList;

public class ArrayListGeneric {
    public static void main(String[] args) {


        //Create an ArrayList using Generics here
        ArrayList<Float> random = new ArrayList<Float>();
        //Add the first four elements to this 'random' ArrayList
        random.add(2f);
        random.add(4f);
        random.add(5f);
        random.add(10f);
        random.add(99f);                    //Command for adding a new element
        printArray(random);
    }

    public static void printArray(ArrayList<Float>  arr) {

        //Complete the method declaration here
        for(Float a : arr) {
            System.out.println(a);
        }
    }

}
