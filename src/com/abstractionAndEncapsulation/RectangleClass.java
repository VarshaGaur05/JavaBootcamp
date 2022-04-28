package com.abstractionAndEncapsulation;

/*Abstraction
Create a class “Rectangle” with class variables length and breadth, and a class method to calculate the area of a rectangle given its length and breadth. Instantiate a rectangle object “R1” where R1 is assigned length 7.33 and breadth 4.22. Calculate the area of ‘R1’ and demonstrate the abstraction.

 */
class Rectangle {
    private double length;
    private double breadth;
    public Rectangle(double length, double breadth)
    {
        this.length=length;
        this.breadth=breadth;
    }
    public double areaOfRectangle() {
        return length*breadth;
    }
}
public class RectangleClass {
    public static void main(String[] args) {
        Rectangle R1= new Rectangle(7.33,4.22);
        System.out.println("Area of given rectangle is "+" "+R1.areaOfRectangle());
    }
}
