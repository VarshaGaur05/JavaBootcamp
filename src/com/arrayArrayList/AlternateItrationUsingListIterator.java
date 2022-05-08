package com.arrayArrayList;
/*Alternate Iteration Using ListIterator
Description
Given below is the code for ArrayList, which contains a random object with six elements — 2, 4, 5, 10, 99.9, and 101 — stored as float-type values. The code prints all the elements forwards, using the ‘iterateFwd( )’ method.



Modify this method, and rename it to iterateAltn( ), with a code that prints the elements stored at the even positions of ArrayList, i.e. print alternate elements, starting from index 1.



Sample Input:

No Input Required



Expected Output:

4.0
10.0
101.0

 */
import java.util.*;
public class AlternateItrationUsingListIterator {
    public static void main(String[] args) {
        List<Float> random = new ArrayList<Float>();
        random.add(2f);
        random.add(4f);
        random.add(5f);
        random.add(10f);
        random.add(99.9f);
        random.add(101f);
        int temp = 0;
        for(Float number: random){
            if(temp % 2 !=0){
                System.out.println(number);
            }
            temp += 1;
        }
    }
    public static void iterateAltn(List<Float> num) {
        ListIterator<Float> it = num.listIterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

    /*Upgrad solution
    public static void main(String[] args) {
        List<Float> random = new ArrayList<Float>();
        random.add(2f);
        random.add(4f);
        random.add(5f);
        random.add(10f);
        random.add(99.9f);
        random.add(101f);
        iterateAltn(random);
    }
    public static void iterateAltn(List<Float> num) {
        ListIterator<Float> it = num.listIterator();
        while (it.hasNext()) {
        it.next();
        if(it.hasNext()){
                System.out.println(it.next());
         }

        }
    }

     */

}
