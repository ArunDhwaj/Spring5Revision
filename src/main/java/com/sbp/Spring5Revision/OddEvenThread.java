package com.sbp.Spring5Revision;

public class OddEvenThread
{
    public void printOddEven(int num)
    {
        OddEvenPrinting oep = new OddEvenPrinting(num);
        oep.odd = true;

        Thread t1 = new Thread(new Runnable()
        {
            @Override
            public void run()
            {
                oep.printOdd();
            }
        });

        Thread t2 = new Thread(new Runnable()
        {
            @Override
            public void run()
            {
                oep.printEven();
            }
        });

        t1.start();
        t2.start();

        try
        {
            t1.join();
            t2.join();
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }
}
