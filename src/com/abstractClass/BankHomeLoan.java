package com.abstractClass;

import java.util.*;
/*The Banking solution
Description
People usually take a home loan to buy a new house, and almost every bank offers home loans but the rate of interest varies across banks. You need to suggest a bank to a user on the basis of the interest rate charged to suit their needs. Create an abstract class 'Homeloan' with two abstract methods 'getRateOfIntererst' and ‘SimpleInterest’. Also, create classes 'Bank1' and 'Bank2' where you can implement the two abstract methods. The rate of interest for Bank 1 is 7.2 and for Bank 2 is 8.1. Using this, you can calculate the simple interest and suggest a bank to the user.

Note: Simple Interest = (principle*rate*time)/100



Input: Your program should take two lines of input:

The amount of loan that they want from the bank
The time for which they want to take the loan (in years)


Output: The output of your program must consist of two lines:

If Bank1 provides the loan at a lower rate of interest, print “File for a loan in Bank1”; else, print “File for a loan in Bank2”.
The amount that they have to pay back to the bank, i.e. principal + interest.

Note: If a user inputs a negative/0 loan amount or time, print “invalid input”.



Sample Input

23400.2

2

Sample Output

File for a loan in Bank1

26769.8288

 */
abstract class HomeLoan {
    double amount;
    int time;

    //Write your code here
    HomeLoan(double amount, int time) {
        this.amount = amount;
        this.time = time;
    }

    abstract double simpleInterest();

    abstract double getRateOfInterest();
}

class Bank1 extends HomeLoan {

    //Write your code here
    Bank1(double amount, int time) {
        super(amount, time);
    }
    double getRateOfInterest() {
        return 7.2;
    }

    double simpleInterest() {

        //Write your code here
        double principle = super.amount;
        int time = super.time;
        if (principle <= 0 || time <= 0) {
            System.out.println("invalid input");
            System.exit(0);
        }
        double r = getRateOfInterest();
        double simpleInterest = (principle * r * time) / 100;
        return simpleInterest + principle;

    }

}

class Bank2 extends HomeLoan{

    //Write your code here
    Bank2(double amount, int time) {
        super(amount, time);
    }

    double getRateOfInterest() {
        return 8.1;
    }
    double simpleInterest() {

        //Write your code here
        double principle = super.amount;
        int time = super.time;
        if (principle <= 0 || time <= 0) {
            System.out.println("invalid input");
            System.exit(0);
        }
        double r = getRateOfInterest();
        double simpleInterest = (principle * r * time) / 100;
        return simpleInterest + principle;
    }

}

public class BankHomeLoan {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        double amount = in.nextDouble();
        int time = in.nextInt();
        HomeLoan obj1 = new Bank1(amount, time);
        HomeLoan obj2 = new Bank2(amount, time);
        if (obj1.simpleInterest() < obj2.simpleInterest()) {
            System.out.println("File for a loan in Bank1");
            System.out.println(obj1.simpleInterest());
        } else {
            System.out.println("File for a loan in Bank2");
            System.out.println(obj2.simpleInterest());
        }
    }

}
