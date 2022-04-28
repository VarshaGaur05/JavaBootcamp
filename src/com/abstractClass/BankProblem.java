package com.abstractClass;
import java.util.*;

abstract class bankHomeLoan {
    public bankHomeLoan() {
        System.out.println("House 1");
    }

    abstract void numbers();
}

class ICICI extends bankHomeLoan {
    public ICICI() {
        System.out.println("ICICI");
    }

    void numbers() {
        System.out.println("Rate of interest is 7.2");
    }
}

public class BankProblem {
    public static void main(String[] args) {
        bankHomeLoan obj = new ICICI();
        obj.numbers();
    }
}