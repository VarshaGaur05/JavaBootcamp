package com.quadrilatereal;

import java.util.*;
/*Abstract Quadrilateral
Description
Given an abstract class Quadrilateral, create subclasses Parallelogram, Rhombus, Rectangle, and Square, which implement the getArea() and getPerimeter() methods correctly.



Note: You can look into the stub file to figure out what is the input we are taking and the output we are producing.



Sample Input :

5.0 4.0 3.0 5.0 4.0 8.0 4.0 9.0
Expected Output:

Parallelogram Perimeter: 18.0
Parallelogram Area: 15.0
Rhombus Perimeter: 20.0
Rhombus Area: 20.0
Rectangle Perimeter: 24.0
Rectangle Area: 32.0
Square Perimeter: 36.0
Square Area: 81.0

 */
// Do not edit the Quadrilateral class
abstract class Quadrilateral {
    double side1;
    double side2;
    double side3;
    double side4;

    public Quadrilateral(double side1, double side2, double side3, double side4) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        this.side4 = side4;
    }

    protected abstract double getArea();

    protected double getPerimeter() {
        return (side1+side2+side3+side4);
    }
}

// Implement the Parallelogram class
class Parallelogram extends Quadrilateral{
    double height;
    public Parallelogram(double side, double length, double height) {
        super(side, length, side, length);
        this.height = height;
    }
    public double getArea(){
        return side1*height;
    }
}

// Implement the Rhombus class
class Rhombus extends Quadrilateral{
    double height;
    public Rhombus(double side, double
            height) {
        super(side, side, side, side);
        this.height = height;
    }
    public double getArea(){
        return side1*height;
    }

    /*double getPerimeter() {
        double perimeter = side * height;
    }*/


}

// Implement the Rectangle class
class Rectangle extends Quadrilateral {
    public Rectangle(double length, double breadth) {
        // Implement the Parallelogram class
        super(length, breadth, length, breadth);
    }
    public double getArea(){
        return side2 * side1;
    }

    /*double getPerimeter() {
        double perimeter = 2 * (length + breadth);
    }*/
}

// Implement the Square class
class Square extends Quadrilateral {
    public Square(double side) {
        super(side, side, side, side);
    }
    protected double getArea(){
        return (side1 * side1);
    }

    /*double getPerimeter() {
        double perimeter = 4 * side;
    } */
}
// Do not edit the Test class
public class MainQuadrilateral {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //Parallelogram
        double side1 = scan.nextDouble();
        double side2 = scan.nextDouble();
        double height = scan.nextDouble();
        Parallelogram parallelogram = new Parallelogram(side1, side2, height);
        System.out.println("Parallelogram Perimeter: " + parallelogram.getPerimeter());
        System.out.println("Parallelogram Area: " + parallelogram.getArea());

        //Rhombus
        double side = scan.nextDouble();
        height = scan.nextDouble();
        Rhombus rhombus = new Rhombus(side, height);
        System.out.println("Rhombus Perimeter: " + rhombus.getPerimeter());
        System.out.println("Rhombus Area: " + rhombus.getArea());

        //Rectangle
        double length = scan.nextDouble();
        double breadth = scan.nextDouble();
        Rectangle rectangle = new Rectangle(length, breadth);
        System.out.println("Rectangle Perimeter: " + rectangle.getPerimeter());
        System.out.println("Rectangle Area: " + rectangle.getArea());

        //Square
        side = scan.nextDouble();
        Square square = new Square(side);
        System.out.println("Square Perimeter: " + square.getPerimeter());
        System.out.println("Square Area: " + square.getArea());

        scan.close();
    }
}
