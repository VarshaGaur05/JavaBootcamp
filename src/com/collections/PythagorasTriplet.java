package com.collections;

import java.util.Scanner;

public class PythagorasTriplet {
    /*Description
You are given three integers x, y and z. You must find whether x^2 + y^2 = z^2. The first lines of input contain the number of test cases t, and the next t lines contain the integers x, y and z. You must take the input and print “Yes” or “No” for each testcase.
Input:
5
1 2 3
3 4 5
4 5 6
6 7 8
8 6 10
Output:
No
Yes
No
No
Yes
Explanation: The first line contains integer x which denotes the number of test cases. The next t lines have the integers which are to be checked for the Pythagorean triplet.

     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int test = scanner.nextInt();

        while(test>0){

            int x = scanner.nextInt();
            int y = scanner.nextInt();
            int z = scanner.nextInt();


            if(Math.pow(x,2)+Math.pow(y,2)==Math.pow(z,2))
                System.out.println("Yes");
            else
                System.out.println("No");

            test--;
        }

    }

    /*OR

    public static void main(String[] args) {

      Scanner scanner = new Scanner(System.in);
      int size = scanner.nextInt();
    // create 2D array for number of rows = size and 3 columns = x,y,z
        int arr[][] = new int[size][3] ;
        int x = 0, y = 0, z = 0;

        for(int i = 0; i < size; i++){
            arr[i][0] = scanner.nextInt();
            arr[i][1] = scanner.nextInt();
            arr[i][2] = scanner.nextInt();
        }

        for(int i = 0; i < size; i++){
            x = (arr[i][0])*(arr[i][0]);
            y = (arr[i][1])*(arr[i][1]);
            z = (arr[i][2])*(arr[i][2]);
            if(x + y == z){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }

    }

     */
}
