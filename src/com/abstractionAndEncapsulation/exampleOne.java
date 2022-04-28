package com.abstractionAndEncapsulation;

class First {
    static void display() {
        System.out.println("ONE");
    }
}

class Second extends First {
    static void display() {
        System.out.println("TWO");
    }
}

public class exampleOne {
    public static void main(String[] args) {
        First obj = new Second();

        obj.display();
    }
}
/*The statement First obj = new Second(); should exhibit runtime polymorphism and the overridden method ‘display()’ of the class Second should be called, but since the method ‘display()’ is static, hence, no overriding can take place. The compiler will make a call to the method of the parent class; therefore, 1 will be displayed.

 */
