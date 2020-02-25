package com.sbp.Spring5Revision;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class RuntimePolymorphismTest
{
    private RuntimePolymorphismBank bank;

    //private RuntimePolymorphismSBI sbi;

    public RuntimePolymorphismTest()
    {
        this.bank = new RuntimePolymorphismSBI();
        //this.sbi = new RuntimePolymorphismSBI();
    }

    @Test
    public void testStaticMethodCalling()
    {
        //1) Concept: static method, are called by reference type.
        System.out.println("1.1: Calling static method: " + bank.myClassName());
    }

    @Test
    public void testDataMemberCalling()
    {
        //2)Concept: Data member are called by reference type.
        System.out.println("1.2: data member: " + bank.baseRate);
    }

    @Test
    public void testObjectMethodCalling()
    {
        //3)Concept: Method member are called by object.
        System.out.println("1.3: Calling object instance method: " + bank.getRateOfInterest());
    }

}
