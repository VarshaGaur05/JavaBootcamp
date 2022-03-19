package com.collections;

import java.util.*;

public class InsertDataInMap {
    /*Description
You are given a TreeMap<Integer, String>. Here, Integer represents the unique account_id of each person, and String stores the person. You must complete the function Insert(), which inserts the values in TreeMap<>, in case the given account_id is not already present. The function Insert() has the treemap, the account_id and the name to be inserted as its parameter, and it returns the updated TreeMap<Integer, String>. If the account_id is already present, you can ignore the operation. You do not need to carry out any input or output operation.
Hint: Put is used to put a new key value in the TreeMap.
Note: You just need to complete the function insert. TreeMap already has some entries. Given below is the populated TreeMap that you already have:
1243 ram
2323 shyam
3123 mohan
4857 upgrad
5584 sam
6765 jam
Input: 1243 pratt
Output:
{1243=ram, 2323=shyam, 3123=mohan, 4857=upgrad, 5584=sam, 6765=jam}
Explanation: No record is added to the TreeMap, as 1243 is already present in the map.
Input: 1111 pratt
{1111=pratt, 1243=ram, 2323=shyam, 3123=mohan, 4857=upgrad, 5584=sam, 6765=jam}
Explanation: A record is added to the TreeMap, as 1111 is not present in the map. Also, the TreeMap maintains the data based on the increasing order of key values. Therefore, 1111 is added to the top.

     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TreeMap<Integer, String> map = new TreeMap<>();
        map.put(1243, "ram");
        map.put(2323, "shyam");
        map.put(3123, "mohan");
        map.put(4857, "upgrad");
        map.put(5584, "sam");
        map.put(6765, "jam");


        Integer account_id = scanner.nextInt();
        String name = scanner.next();


        System.out.println( Insert(map, account_id, name));

    }

    public static TreeMap<Integer, String> Insert(TreeMap<Integer, String> map, int acc_id, String name){

        TreeMap<Integer, String> updatedmap = map;

        if(!map.containsKey(acc_id))
            updatedmap.put(acc_id,name);

        return updatedmap;


    }
}
