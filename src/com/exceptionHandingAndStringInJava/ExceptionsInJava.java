package com.exceptionHandingAndStringInJava;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ExceptionsInJava {
    /*
    Description
The following code throws a compilation error when executed. How would you handle the error?
Change the code so it gets compiled without an error. (Hint: A statement in the code throws a checked exception.)
Sample input:
Hello
Output:
You wrote:Hello
Note: Please enter a string in the Input Console before clicking on Test Run.
     */
    public static void main(String[] args) {

        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));

        try {
            String inData;
            inData = stdin.readLine();

            System.out.print("You wrote:" + inData);
        } catch (Exception e) {
            System.out.print(e);
        }
    }

    /*
    public static void main(String[] args) throws IOException {
      // Enter a string in the input console
       BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));

       String inData;
       inData = stdin.readLine();

           System.out.println("You wrote:" + inData);


   }
     */
}
