package com.multithreadingLambda;

public class threads {
    static int N;
    /*
        Description
    Create two threads, one for printing odd numbers and another for printing even numbers. These two threads should print all the numbers sequentially till 100.
    Testcase:
    Input: No input
    Output:
    1
    2
    3
    ....
    99
    100
         */
    static int counter = 1;

    public void printOddNumber() {
        // write logic for printing odd numbers when its turn
        synchronized (this)
        {
            // Print number till the N
            while (counter < N) {
                while (counter % 2 == 0) { // If count is even then print
                    // Exception handle
                    try {
                        wait();
                    }
                    catch (
                            InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(counter + " "); // Print the number
                // Increment counter
                counter++;
                // Notify to second thread
                notify();
            }
        }
    }

    public void printEvenNumber() {
        // write logic for printing even numbers when its turn
        synchronized (this)
        {
            // Print number till the N
            while (counter < N) {
                // If count is odd then print
                while (counter % 2 == 1) {
                    // Exception handle
                    try {
                        wait();
                    }
                    catch (
                            InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                // Print the number
                System.out.println(counter + " ");
                // Increment counter
                counter++;
                // Notify to 2nd thread
                notify();
            }
        }
    }

    public static void main(String[] args)
    {
        // Create 2 threads and execute them
        // Given Number N
        N = 100;

        // Create an object of class
        threads mt = new threads();

        // Create thread t1
        Thread t1 = new Thread(new Runnable() {
            public void run()
            {
                mt.printEvenNumber();
            }
        });

        // Create thread t2
        Thread t2 = new Thread(new Runnable() {
            public void run()
            {
                mt.printOddNumber();
            }
        });

        // Start both threads
        t1.start();
        t2.start();
    }
}
