package com.sbp.Spring5Revision;

public class MyThread extends Thread
{
    public void run()
    {
        for (int i = 1; i<5; i++)
        {
            try
            {
                Thread.sleep(500);
            }
            catch (InterruptedException e)
            {
                System.out.println(e);
            }

            System.out.println(i);
        }
    }
}
