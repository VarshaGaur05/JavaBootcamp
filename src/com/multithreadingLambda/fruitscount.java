package com.multithreadingLambda;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;


/*
Fruits
Description
You have been provided with a list of fruit names. Calculate the count of every fruit in the list.
Testcase:
Input:
9
mango
apple
grapes
berry
berry
mango
apple
apple
banana
Output:
{banana=1, apple=3, berry=2, grapes=1, mango=2}
 */

public class fruitscount {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n-- > 0){
            fruits.add(sc.next());
        }
        printFruitCount(fruits);
    }


    public static void printFruitCount(List<String> fruits){
        // store the count of each fruit into a Map using lambda function and print the map
        //Map<String, Integer> Fruitcnt = new HashMap<String, Integer>();
        Map<String, Long> Fruitcount = fruits.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(Fruitcount);
        /*for (String s: fruits){
            int count = Fruitcnt.getOrDefault(s,0);
            Fruitcnt.put(s,count+1);
        }*/

        /*for (String i : fruits) {
            Integer j = Fruitcnt.get(i);
            Fruitcnt.put(i, (j == null) ? 1 : j + 1);
        }

        System.out.print("{");
        for (Map.Entry<String, Integer> val : Fruitcnt.entrySet()) {
            System.out.print(val.getKey() + "=" + val.getValue() + ",");
        }
        //System.out.println(Fruitcnt.values());
       /* int x = Fruitcnt.size();
        int i = 1;
        System.out.print("{");
        for (Map.Entry<String, Integer> entry: Fruitcnt.entrySet()) {
            if (i < x) {
                System.out.print(entry.getKey() + "=" + entry.getValue() + ",");
            } else {
                System.out.print(entry.getKey());
            }
        }*/
        //
    }

}
