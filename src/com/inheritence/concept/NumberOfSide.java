package com.inheritence.concept;

import java.util.Scanner;

/*Inheritence Concept
Description
Create three classes – Triangle, Circle and Rectangle, which extends the class Shape. Each of these three classes should constitute a method display that must be overridden. You must take the number of sides in a shape as the input and predict the kind of shape it is. The output of your program is as follows:

If the number of the input side is 0, print “The shape is a circle”.
If the number of the input side is 3, print “The shape is a triangle”.
If the number of the input side is 4, print “The shape is a rectangle”.
If the number of sides is anything other than 0, 3, or 4, print “Enter a valid number of sides!”.


Input: The input should be an integer ‘n’ that represents the number of sides in a shape.

 */
public class NumberOfSide {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Shape obj = new Triangle();
        Shape obj2 = new Circle();
        Shape obj1 = new Rectangle();
        int numberOfSides = in.nextInt();

        switch (numberOfSides) {
            case 0:
                obj2.display();
                break;
            case 3:
                obj.display();
                break;
            case 4:
                obj1.display();
                break;
            default:
                System.out.println("Enter a valid number of sides!");
                break;
        }
    }
}
