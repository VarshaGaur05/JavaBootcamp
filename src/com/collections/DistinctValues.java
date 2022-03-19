package com.collections;

import java.util.*;

public class DistinctValues {
    /*Description
You are given a HashMap with n number of keys and values. You must print the distinct values in the same order as in the HashMap.
Example:
Map = {1=A,2=A,3=B}
Output: A B
Input: The input will be in the following format:
The first line should be the number of elements present in the map.
 Next, n lines contain the key-value pairs.
The data type of HashMap is as follows:
Key: integer
Value: string
Output:
The output should print the distinct values of HashMap, separated by spaces.
Input:
3
1 A
2 A
3 B
Output:
A B
     */
    /*Method to print distinct values*/
    public static void printValues(Map<Integer,String> map){
        HashMap<String,Integer> h = new HashMap<>();
        String value;
        for(int i : map.keySet()){
            value = map.get(i);
            //Checks if value for a key exists in the map or not
            if(h.get(value) == null){
                h.put(value,i);
            }
        }
        for(String s: h.keySet()){
            System.out.print(s+" ");
        }
    }

    public static void main(String[] x){
        Map<Integer,String> map = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int key;
        String value;
        for(int i = 1; i <= num; i++){
            key = sc.nextInt();
            value = sc.next();
            map.put(key,value);
        }
        printValues(map);
    }
}
