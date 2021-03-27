package com.flamey;

public class Main
{
    public static void main(String[] args)
    {
        StaticTest firstInstance = new StaticTest("1st instance");
        System.out.println(firstInstance.getName() + " is instance number " + StaticTest.getNumInstances());

        StaticTest secondInstance = new StaticTest("2nd instance");
        System.out.println(secondInstance.getName() + " is the instance number " + StaticTest.getNumInstances());

        System.out.println("Main method called");
        SIBTest test = new SIBTest();
        test.someMethod();
        System.out.println("owner is " + SIBTest.owner);
    }

    //static initialization blocks: (= static constructors)
}
