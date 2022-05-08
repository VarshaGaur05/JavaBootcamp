package com.arrayArrayList;

/*Creating a LinkedList
Description
Given below is the code of an ArrayList containing an object named ‘random’ with five elements: 2, 4, 5, 10, and 99 stored as float-type values. Please convert this ArrayList to a LinkedList and access the third element of this linked list using the get method.



Sample Input:

There is no input for this program.



Expected Output:

5.0

 */
import java.util.*;

public class ConvertALToLL {
    public static void main(String[] args) {
        ArrayList<Float> random = new ArrayList<Float>();

        random.add(2f);
        random.add(4f);
        random.add(5f);
        random.add(10f);
        random.add(99f);
        LinkedList<Float> linkList = new LinkedList<Float>(random);
        System.out.println(linkList.get(2));

    }
}

/*Upgrad solution
import java.util.LinkedList;

class Source {
   public static void main(String[] args) {
       LinkedList<Float> random = new LinkedList<Float>();

       random.add(2f);
       random.add(4f);
       random.add(5f);
       random.add(10f);
       random.add(99f);

       System.out.println(random.get(2));
   }
}
 */
