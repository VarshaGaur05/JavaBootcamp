package com.javacollection;

import java.util.ArrayList;
import java.util.List;

public class demo {
    /*public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        for(int i=0; i<=10; i++)
            list.add(i+"");

        int initial = list.size();
        list.clear();
        int finall = list.size();

        System.out.println(initial - finall);
    }*/

    public static void main(String[ ] args) {
        /*int[] arr = {1, 2, 3};
        System.out.println(arr[4]);*/
        try{
            int arr[]=new int[200];
            arr[234]=90+4/0;
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("1");
        }
        catch(ArithmeticException e)
        {
            System.out.println("2");
        }
        catch(Exception e)
        {
            System.out.println("3");
        }
    }

}
