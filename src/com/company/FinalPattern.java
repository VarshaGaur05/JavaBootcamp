package com.company;
import java.util.*;

public class FinalPattern {
    /*
    Description
You are given a number n. Print the pattern shown below.



Input: 4

Output:

* * * *

 * * *

  * *

   *

   *

  * *

 * * *

* * * *



Input: 3

Output:

* * *

 * *

  *

  *

 * *

* * *

     */
    public static void main (String[]args)
    {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

// write your code here
        for (int i= 0; i<= n-1 ; i++)
        {
            for (int j=0; j<i; j++)
            {
                System.out.print(" ");
            }
            for (int k=i; k<=n-1; k++) {
                System.out.print("*" + " ");
            }
            System.out.println("");
        }
        for (int l= n-1; l>= 0; l--)

        {

            for (int j=0; j<l ;j++)

            {

                System.out.print(" ");

            }

            for (int k=l; k<=n-1; k++)

            {

                System.out.print("*" + " ");

            }

            System.out.println("");

        }
        scanner.close();

    }
}
