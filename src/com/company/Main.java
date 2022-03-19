package com.company;
import java.util.Scanner;

public class Main {
/*Square of Sum
Description
 Write a program that takes two numbers as input and returns the square of their sum

 */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // Enter the numbers in the input console
        /*int number1 = scan.nextInt();
        int number2 = scan.nextInt();
        System.out.print(squareOfSum(number1, number2));*/

       // int n = scan.nextInt();
       /* for(int i=0; i<=n;i++){
            for(int j=0; j<n-i;j++){
                System.out.print("*");
            }
            System.out.println();
        }*/

       /* for(int i=0; i<=n;i++){
            for(int j=i; j<=n;j++){
                System.out.print("*");
            }
            for(int k=1; k<=i*2-2;k++) {
                System.out.print(" ");
            }
            for(int l=i; l<=n;l++){
                System.out.print("*");
            }
            System.out.println();
        }*/
        int rows = scan.nextInt();

        // loop to iterate for the given number of rows
        for (int i = 1; i <= rows; i++) {

            // loop to print the number of spaces before the star
            for (int j = rows; j >= i; j--) {
                System.out.print(" ");
            }

            // loop to print the number of stars in each row
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            // for new line after printing each row
            System.out.println();
        }



        // write your code here
    }

   /* public static int squareOfSum( int var1 , int var2){
        int sum = (var1 + var2);
        int squareOfSum = sum*sum;
        return squareOfSum;
    }*/


}

