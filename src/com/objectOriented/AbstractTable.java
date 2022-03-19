package com.objectOriented;

interface APIextension{
    //define the methods here
    abstract void CountNumber();
    abstract void Payment();
}
class APIimplements implements APIextension{
    public void CountNumber(){
        System.out.println("Count the number of API running.");
    }

    public void Payment(){
        System.out.println("Count the payment of API.");
    }
}

public class AbstractTable {
    /*
    An interface is used to provide total abstraction. All methods in interfaces have an empty body, which ensures total abstraction. Other classes that extend the interface implement the methods that are defined in the interface without a body.
Suppose you are implementing an APIextension interface. You, as a provider of the API interface, need the class that implements it to have the countNumber() and Payment() methods in it. In the class APImplements, the countNumber() and Payment() methods are defined. You must complete the body of the interface APIextension.
INPUT: No input required.
OUTPUT:
Count the number of API running.
Count the payment of API.
     */
    public static void main(String[] args) {


        APIimplements obj = new APIimplements();
        obj.CountNumber();
        obj.Payment();

    }
}
