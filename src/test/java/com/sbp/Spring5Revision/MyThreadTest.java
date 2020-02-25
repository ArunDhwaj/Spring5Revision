package com.sbp.Spring5Revision;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MyThreadTest
{
    private MyThread mt;

    @Disabled
    @Test
    public void threadInDifferentCallStackTest()
    {
        MyThread mt1 = new MyThread();
        MyThread mt2 = new MyThread();

        //thread are started in their own call stack, then start run().
        mt1.start();
//        mt1.run();

        mt2.start();
//      mt2.run();
    }

    @Disabled
    @Test
    public void threadInSameCallStackTest()
    {
        MyThread mt1 = new MyThread();
        MyThread mt2 = new MyThread();

        //thread are started in main thread call stack, then start run().
        mt1.run();
        mt2.run();
    }

    @DisplayName("Custom test name: threadJoinTest")
    @Test
    public void threadJoinTest()
    {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        MyThread t3 = new MyThread();

        t1.start();

        try
        {
            t1.join();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }

        t2.start();

        try
        {
            t2.join();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }

        t3.start();
        try
        {
            t3.join();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
