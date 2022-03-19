package com.company;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class MeanNmber {
    public static void main(String args[]) throws FileNotFoundException {

        File inputfile = new File("E:/Upgrade Study Material/quiz_numbers.txt"); // Specify the path of the file

        Scanner scan = new Scanner(inputfile);
        int numb = 1;
        int sum = 0;
        int count = 0;
        double mean;
        while (scan.hasNext()) {  // read the numbers and add them to the value of the sum
            int number = scan.nextInt();
            sum = sum + number;
            count++;
        }

        mean = (double) sum/count;


        System.out.println("Sum is : " + mean);
    }

}
