package com.multithreadingLambda;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FixErrors implements Runnable  {
    /*Fix Errors
Description
Fix the bug in the code to print the counter values from 1 to 100, in the correct order.
Counter : 1
Counter : 2
...
Counter : 999
Counter : 1000
     */
    private static int counter = 1;

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        for (int i = 0; i < 5; i++) {
            try{
                executorService.submit(new FixErrors()).get();
            }
            catch(Exception ex){

            }

        }
        executorService.shutdown();
    }
    public void run() {
        while (counter <= 100) {
            increment();
        }
    }

    private void increment() {
        System.out.println("Counter : " + counter);
        counter++;
    }

}
