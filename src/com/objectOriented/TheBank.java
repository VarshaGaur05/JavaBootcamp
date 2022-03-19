package com.objectOriented;
import java.util.*;

public class TheBank {
    /*
    Description
Create three classes IBank, JBank and KBank which extends the abstract class RBI which is already defined. You need to define the  abstract method InterestCalculator inside the each of the class where the rate of interest is defined for each of the bank:
1, IBank - 7
2. JBank - 8
3. KBank - 9
The abstract method InterestCalculator accepts principal amount and time in years as the argument and uses the below formula to calculate the interest:
Interest = Principal*Rate*Time
Note: The abstract method InterestCalculator returns interest as integer.
Sample Input: 1 100000 7
Sample Output: 49000
Explanation: Here the first input 1 denotes that the user has opted to calculate the interest of the IBank. Further, the next two inputs correspond to the principal amount and time. Using the interest for the IBank i.e. 7% gives the interest amount as 49000.
Sample Input: 4 100000 7
Sample Output: Please enter correct choice
     */
    public static void main (String[]args)
    {

        Scanner scanner = new Scanner (System.in);
        int n = scanner.nextInt ();
        int principle_amount = scanner.nextInt ();
        int time = scanner.nextInt ();

        if (n == 1)
        {
            IBank obj = new IBank();
            System.out.println(obj.InterestCalculator(principle_amount, time));
        }
        else if (n == 2)
        {
            JBank obj = new JBank();
            System.out.println(obj.InterestCalculator(principle_amount, time));
        }
        else if (n == 3)
        {
            KBank obj = new KBank();
            System.out.println(obj.InterestCalculator(principle_amount, time));
        }
        else
        {
            System.out.println ("Please enter correct choice");}
    }
}
abstract class RBI
{
    abstract int InterestCalculator (int x, int y);
}


// Define the classes here.
class IBank extends RBI{
    @Override
    int InterestCalculator(int x, int y) {
        return  (x*7*y)/100;
    }
}
class JBank extends RBI{
    @Override
    int InterestCalculator(int x, int y) {
        return  (x*8*y)/100;
    }
}

class KBank extends RBI{
    @Override
    int InterestCalculator(int x, int y) {
        return  (x*9*y)/100;
    }
}
