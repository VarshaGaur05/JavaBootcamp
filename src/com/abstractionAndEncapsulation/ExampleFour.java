package com.abstractionAndEncapsulation;

abstract class A {
    abstract int methodA(int k);

    abstract int methodB(int i);

    int methodC(int i) {
        return methodB(++i);
    }
}

class B extends A {
    /* I have add this code for remvoe the compilation error start*/
    @Override
    int methodA(int k) {
        return 0;
    }
    /* I have add this code for remvoe the compilation error end*/

    int methodB(int i) {
        return ++i;
    }
}

public class ExampleFour {
    public static void main(String[] args) {
        B obj = new B();
        System.out.println(obj.methodB(10));
    }
}
/*Compilation error

✓ Correct
Feedback:
The abstract class A contains two abstract methods and one public method. Class B extends the class and defines the abstract methodB() but does not override methodA or methodC. While it is okay to not override a method that is already defined in the abstract, it is mandatory to define/override an abstract method at least once in the code if there is any subclass of the abstract class. In this code, the abstract class A is inherited only by class B but B does not contain any definition for the abstract methodA. Therefore, the code throws a compilation error.

 */
