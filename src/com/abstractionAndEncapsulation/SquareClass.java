package com.abstractionAndEncapsulation;

public class SquareClass {
/*Objects of 'Square' Class
Description
Create two objects s1 & s2 of 'Square' class given below. Assign them the side-length of 10f and 20f respectively, and print their areas in separate lines.

 */
public static void main(String[] a){
    //Create two objects of Square class 's1' and 's2'
    Square s1 = new Square();
    s1.length = 10f;
    Square s2 = new Square();
    s2.length = 20f;

    //Calculate and print their areas after assigning values to their side lengths
    System.out.println(s1.area());
    System.out.println(s2.area());
}
}

class Square{
    public float length;
    public float area(){
        return length * length;
    }


}
