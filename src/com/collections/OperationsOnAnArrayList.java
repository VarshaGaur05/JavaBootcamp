package com.collections;

import java.util.ArrayList;

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
