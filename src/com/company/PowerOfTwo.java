package com.company;
import java.util.*;

public class PowerOfTwo {
    /*Description
Write a code that prints the highest power of 2, less than or equal to a given number. For example, if the input number is 9, the code should print 8, as 8 i.e 2 to power 3 is the highest power of two, which is less than 9.



Hint: This can be achieved if the loop starts with number 1 and keeps multiplying it with 2 until it reaches the power of 2, which is less than or equal to the given number.

For example:

Given number = 9.

We start with 1.

As 1<9, we multiply it with 2.

1*2 = 2.

As 2<9, we multiply it with 2 again.

2*2 = 4.

As 4<9, we multiply it with 2 again.

4*2 = 8.

As 8<9, we multiply it with 2 again.

8*2 = 16

As 16>9, we stop the multiplication and get the previous number, i.e., 8.
Sample input:
9
Output:
8
Note: Please enter your inputs in the Input Console before clicking on Test Run.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // Enter the number
        int number = scan.nextInt();
        int result = 1;
        if(number >= 2) {

            while (result * 2 <= number) {
                result = result * 2;
            }

            System.out.print(result);

        } else {
            System.out.print("Please enter an integer >= 2");
        }
        scan.close();
    }
}
