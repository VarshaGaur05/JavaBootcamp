package com.abstractionAndEncapsulation;

class Shape {
    double radius = 5.16;
    double length = 6.99;
    double breadth = 8.10;

    void dimensions() {
        System.out.println(breadth);
    }
}

public class Cone extends Shape {
    double radius = 7.77;

    void dimensions() {
        System.out.println(length);
    }

    public static void main(String args[]) {
        Shape b = new Cone();
        b.dimensions();
        System.out.println(b.radius);
    }
}

/*Overriding is a feature of OOPS that is specially used during inheritance.
 The code demonstrates runtime polymorphism since the overridden method dimensions() is called
 through the reference variable (b) of the parent class Shape. Runtime polymorphism will decide which
 overridden method to call during runtime and not compile time. Since the overridden method is called with b,
 the value assigned to length will be displayed. Methods or the member functions can be overridden during runtime,
  but data members cannot be overridden. Hence, b.radius displays the value of the variable radius in the parent
   class, i.e., 5.16.

 */
