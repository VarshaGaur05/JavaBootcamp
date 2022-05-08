package com.arrayArrayList;
/*Creating ArrayList
Description

The following code was written using an array in your previous practice coding question(SimpleArray). Modify the code, and implement it using the ArrayList.

Also, a new element 99 must be added at the end of the newly implemented ArrayList. This implementation is already written in the code.

Sample input
There is no input for this program.


 */

import java.util.ArrayList;

public class SimpleCodeArrayList {
    public static void main(String[] args) {
        //int random[ ] = {2, 4, 5, 10};
        //Declare and create an object of the ArrayList class named 'random', in place of the line above
        ArrayList<Integer> random = new ArrayList<Integer>();
        //Add the first four elements to this 'random' ArrayList
        random.add(2);
        random.add(4);
        random.add(5);
        random.add(10);
        random.add(99);                    //Command for adding a new element
        printArray(random);
    }

    public static void printArray(ArrayList<Integer>  arr) {   //Change the type of the parameter to ArrayList
        for(int a : arr) {              //Change the data type of 'a' from 'int' to 'Object'
            System.out.println(a);
        }
    }
}
