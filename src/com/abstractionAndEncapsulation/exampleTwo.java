package com.abstractionAndEncapsulation;

class Base {
    public void display() {
        System.out.println("This is the display function of the base class.");
    }
}

interface BaseInterface {
    default public void display() {
        System.out.println("This is the display function of the interface class.");
    }
}

class exampleTwo extends Base implements BaseInterface {

    public static void main(String[] args) {

        exampleTwo obj = new exampleTwo();
        obj.display();
    }
}

/*This is the display function of the base class.

✓ Correct
Feedback:
In this code, both the class Base and the interface BaseInterface consist of the display() method which is called by the object of the class Source. When a class and an interface contain a method having the same signature, then the preference is given to the definition declared in the class and the definition mentioned in the interface is discarded.

 */
