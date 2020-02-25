package com.sbp.Spring5Revision;

public class RuntimePolymorphismSBI extends RuntimePolymorphismBank
{
    float baseRate = 5.0f;

    static String myClassName()
    {
        return "RuntimePolymorphismSBI: myClassName";
    }

    float getRateOfInterest()
    {
        return 8.4f;
    }
}
