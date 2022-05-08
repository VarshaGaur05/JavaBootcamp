package com.arrayArrayList;
/*Description
Given below is the code for ArrayList, which contains a random object with six elements — 2, 4, 5, 10, 99.9, and 101 — stored as float-type values. The code prints all the elements using a for loop.

Modify this code to print all the elements backward (starting from the last element of the list), using the ListIterator class.

Sample Input:
No input required

Expected Output:
101.0
99.9
10.0
5.0
4.0
2.0

 */
import java.util.*;

public class BackwardIterationUsingListIterator {
    public static void main(String[] args) {
        List<Float> random = new ArrayList<Float>();
        random.add(2f);
        random.add(4f);
        random.add(5f);
        random.add(10f);
        random.add(99.9f);
        random.add(101f);

        printList(random);
    }

    public static void printList(List<Float> arr) {
       /*for(Float num : arr) {
           System.out.println(num);
       }*/
        ListIterator listIterator = arr.listIterator(arr.size());
        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }
    }
}
