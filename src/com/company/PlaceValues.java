package com.company;
import java.util.*;

/*Description
Write a code below that takes a 5-digit positive number from the user as an input.
For example, you can take 34768 as an input. The program should print the numbers in the ones, tens, hundreds, thousands, and ten thousands places of the 5-digit number the user inputs.
Input:
34768
Output:
3
4
7
6
8

 */

public class PlaceValues {
    public static void main(String[] args) {


        //Create new scanner
        Scanner input = new Scanner(System.in);

        //Values of each digit
        int tenThousands, thousands, hundreds, tens, ones;

        //Prompt user to input 5 digit number

        int number = input.nextInt();
        if (number > 99999) {
            System.out.println("\nError! Number more than 5 digits.");
        }
        else if (number < 10000) {
            System.out.println("Error! Number less than 5 digits.");
        }
        else if (10000<=number&&number<=99999){
            //WRITE YOUR CODE HERE
            ones=(number/1)%10;
            tens= (number/10)%10;
            hundreds = (number/100)%10;
            thousands = (number/1000)%10;
            tenThousands = (number/10000)%10;
            System.out.println(tenThousands);
            System.out.println(thousands);
            System.out.println(hundreds);
            System.out.println(tens);
            System.out.println(ones);
        }
    }
}
