package com.arrayArrayList;

import java.util.*;
import java.util.ArrayList;

public class ReverseArrayList {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        int n = s.nextInt();
        for (int i = 0; i < n; i++)
            list.add(s.nextInt());
        reverseArrayList(list);
        for (int i = 0; i < list.size(); i++)
            System.out.print(list.get(i) + " ");

    }

    // Method to reverse the ArrayList
   /* static void reverseArrayList(int[] list) {
        // Write your code here
        for(int i=0;i<list.length/2;i++){
            int temp=list[i];
            list[i]=list[list.length-1-i];
            list[list.length-1-i]= temp;

        }
    }*/
    private static ArrayList<Integer> reverseArrayList(ArrayList<Integer> list) {
        // Write your code here
        Collections.reverse(list);
        return list;
    }

}
