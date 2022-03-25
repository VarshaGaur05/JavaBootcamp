package com.multithreadingLambda;
import java.util.stream.Collectors;
import java.util.*;

/*Description
Given a list of integer numbers, filter out the odd numbers.



Input:

6

1 2 3 4 5 6

Output:
2
4
6
Explanation: The odd numbers 1, 3 and 5 are filtered out leaving only even numbers.
Input:
5
5 1 92 18 51
Output
92
18
 */

public class FilterOutOddNumber {
    public static void main(String []args) {
        List<Integer> numbers = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n-- > 0) {
            numbers.add(sc.nextInt());
        }
        printEvenNumbers(numbers);
    }

    public static void printEvenNumbers(List<Integer> numbers){
        // Print even numbers in the same orders as of array,
        // each in new line
        List<Integer> arr = numbers.stream().filter(n -> n%2 == 0).collect(Collectors.toList());
        arr.forEach(System.out::println);

    }
}


