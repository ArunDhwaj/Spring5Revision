package com.sbp.Spring5Revision;

public class RuntimePolymorphismBank
{
    /*
        private, final and static methods and variables uses static binding and bonded by compiler
        while overridden methods are bonded during runtime based upon type of runtime object.
     */

    float baseRate = 4.0f;

    static String myClassName()
    {
        return "RuntimePolymorphismBank: myClassName";
    }

    float getRateOfInterest()
    {
        return 5.0f;
    }
}
