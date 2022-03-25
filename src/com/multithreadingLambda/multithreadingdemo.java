package com.multithreadingLambda;

/*public class multithreadingdemo {
    public static void main(String args[])
    {
        Thread t = Thread.currentThread();
        System.out.println(t.getPriority());
    }
}*/

class TestThread implements Runnable
{
    public void run()
    {
        System.out.println("Hello from thread");
    }
}

public class multithreadingdemo
{
    public static void main(String[] args)
    {
        TestThread tt = new TestThread();
        Thread t = new Thread(tt);
        t.start();
        t.start();
    }
}
