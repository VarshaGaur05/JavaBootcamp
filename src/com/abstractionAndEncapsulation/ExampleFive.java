package com.abstractionAndEncapsulation;

public class ExampleFive {
}

/*super and this
        Given below is a piece of code. Select the line number which will throw a compilation error.

 */

/*public class A {
    public A() {
        super();
        this(10);
    }
    public A(int i) {
        System.out.println(i);
    }
}

Ans: line 14

✓ Correct
Feedback:
The fourth line of given code is incorrect because a constructor can only have either super() or this() method. The third line will be compiled successfully but for the next line “call to this must be the first statement in constructor” will be displayed and the program will not compile.

 */

/* Qes-- Select the correct percentage of abstraction provided by the ‘abstract’ class and ‘interface’.
Ans--Abstract: 0-100%, Interface: 100%

✓ Correct
Feedback:
Abstraction refers to hiding details or implementation. The interface achieves 100% abstraction because it cannot define or implement its methods, and the interface methods receives their definition from the classes that implement the interface. The abstract class, on the other hand, can have functions with implementations. In addition, the abstract class may have all the abstract methods or it may have none; therefore, it is said to have 0-100% abstractness.
 */
