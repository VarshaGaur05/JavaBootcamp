package com.company;
import java.util.Scanner;
public class IncomeTax {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        // Enter annual income
        double income = scan.nextDouble();
        // Enter age
        int age = scan.nextInt();
        double tax = 0.0;

        // Write your logic here
        if(age < 60){
            if(income <= 250000){
                tax = 0.0;
            }else if(income >250000 && income <= 500000 ){
                tax = 0.10*(income -250000);
            } else if(income >500000 && income <= 1000000 ){
                tax = 0.2*(income - 500000) + 0.10*(250000);
            }else if(income > 1000000 ){
                tax = 0.3*(income -1000000) + 0.2*(500000) + 0.10*(250000);
            }
        }
        else if(age >= 60 && age <80){
            if(income <= 300000){
                tax = 0.0;
            }else if(income >300000 && income <= 500000 ){
                tax = 0.10*(income -300000);
            } else if(income >500000 && income <= 1000000 ){
                tax = 0.2*(income - 500000) + 0.10*(200000);
            }else if(income > 1000000 ){
                tax = 0.3*(income -1000000) + 0.2*(500000) + 0.10*(200000);
            }
        }
        else if(age >= 80 ){
            if(income <= 500000){
                tax = 0.0;
            }else if(income >500000 && income <= 1000000 ){
                tax = 0.2*(income -500000);
            } else if(income > 1000000 ){
                tax = 0.3*(income -1000000) + 0.2*(500000);
            }
        }

        System.out.print(tax);
        scan.close();
    }
}
