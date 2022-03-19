package com.company;
import java.util.*;

public class HighestCommonFactor {
    /*
Description
Write a Java code to calculate the highest common factor (HCF) or the greatest common divisor of two numbers. Just complete the logic of the code.



Hint: HCF is the highest number that divides two numbers. So, your loop should start by checking if the lower number of the two numbers entered is the HCF and then check the numbers below, one by one, until the HCF is found.



E.g., if the numbers entered are 12 and 45, the output is 3.

Sample input:

12 45



Output:

3

Note: Please enter your inputs in the Input Console before clicking on Test Run.
     */

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        // Entering number 1 in the Input Console
        int num1 = scan.nextInt();
        // Entering number 2 in the Input Console
        int num2 = scan.nextInt();

        int hcf=1;
// Write logic and store answer in HCF
        for(int i =1; i <=num1 || i<=num2 ; i++){
            if( num1%i == 0 && num2%i == 0 ){
                hcf = i;
            }
        }

        System.out.print(hcf);
        scan.close();
    }
}
