package com.multithreadingLambda;
import java.util.stream.Collectors;
import java.util.*;
/*
Description
Given a list of integer numbers, print the square of every number.



Test cases:

Input:

0

Output:

(No output)



Input:
6
1 2 3 4 5 6
Output:
1
4
9
16
25
36
 */

public class NumberSquared {
    public static void main(String []args){
        List<Integer> numbers = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n-- > 0){
            numbers.add(sc.nextInt());
        }
        printSquareNumbers(numbers);
    }

    public static void printSquareNumbers(List<Integer> numbers) {
        List<Integer> squarenumbers = numbers.stream().distinct().collect(Collectors.toList());
        squarenumbers.forEach(n -> System.out.println((int)Math.pow(n, 2)));
    }

}
