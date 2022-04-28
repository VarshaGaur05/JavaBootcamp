package com.abstractionAndEncapsulation;
interface first {
    default public void display() {
        System.out.println("This is the display function of method1");
    }
}

interface second {
    default public void display() {
        System.out.println("This is the display function of method2");
    }
}

public class ExampleThree implements first, second {
    public static void main(String[] args) {
        ExampleThree object = new ExampleThree();
        object.display();
    }
 /* I have add this code for remvoe the compilation error*/
   @Override
    public void display() {
        first.super.display();
    }


}
/*Compilation error

✓ Correct
Feedback:
In the given code, the class Source calls a method display() that has the same signature in both the parent interfaces. In such a case, there will be a compilation error because no priority is given to the first or the second interface. To resolve this, you can call whichever method you like using interface_name.super.display();. For example, here, you need to call the method of interface first and then use the statement first.super.display();.

 */