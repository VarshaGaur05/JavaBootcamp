package com.company;
public class CompareFunction {

    public static void main(String[] args) {
        int num1 = 20;
        int num2 = 27;
        int compareResult = compare(num1, num2);  // pass variables to be compared
        System.out.print(compareResult);

    }

    public static int compare(int var1, int var2) {

        int result;
        if (var1 > var2) {
            result = Integer.parseInt(var1 + " is larger than " + var2);
        } else if (var1 == var2) {
            result = Integer.parseInt("Both numbers are equal");
        } else {
            result = Integer.parseInt(var2 + " is larger than " + var1);
        }
        return result;
    }
}


