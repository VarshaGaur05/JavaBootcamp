package com.multithreadingLambda;
import java.util.*;

public class BiggestInList {
    /*Biggest in list
Description
Find the biggest even number present in a list.
Note: It's guaranteed that there will always be an even number in the input.
Test cases:
Input:
8
1 2 3 4 5 9 7 5
Output:
4
     */

    public static void main(String[] args){

        List<Integer> numbers = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n-- > 0){
            numbers.add(sc.nextInt());
        }
        printMaximumEven(numbers);
    }


    public static void printMaximumEven(List<Integer> numbers){
        int maxEven = numbers.stream().filter(x->x%2==0).mapToInt(x-> x).max().getAsInt(); // Get the biggest even number

        System.out.println(maxEven);
    }
}
