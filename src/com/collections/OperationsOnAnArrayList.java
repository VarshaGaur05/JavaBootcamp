package com.collections;

import java.util.ArrayList;
/*Given below is the code of ArrayList, which contains an object named ‘random’ with five elements: 2, 4, 5, 10 and 99.9 stored as float-type values. Can you use add and remove methods to replace the fourth element (10) with 15?
Sample input:
There is no input for this program.
Expected output:
2.0
4.0
5.0
15.0
99.9
 */

public class OperationsOnAnArrayList {
    public static void main(String[] args) {
        ArrayList<Float> random = new ArrayList<Float>();
        ArrayList<Float> random2 = new ArrayList<>();
        random.add(2f);
        random.add(4f);
        random.add(5f);
        random.add(10f);
        random.add(99.9f);
//Write new statements here
        random.remove(3);
        random.add(3, 15f);
        printList(random);
    }

    public static void printList(ArrayList<Float> arr) {
        for(Float num : arr) {
            System.out.println(num);
        }
    }
}
