package com.sbp.Spring5Revision;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class OddEvenThreadTest
{
    private OddEvenThread oet = new OddEvenThread();

    @Disabled
    @Test
    public void printOddEvenTest1()
    {
        oet.printOddEven(1);
    }

    @Disabled
    @Test
    public void printOddEvenTest10()
    {
        oet.printOddEven(10);
    }

    //@Disabled
    @Test
    public void printOddEvenTest100()
    {
        oet.printOddEven(100);
    }
}
