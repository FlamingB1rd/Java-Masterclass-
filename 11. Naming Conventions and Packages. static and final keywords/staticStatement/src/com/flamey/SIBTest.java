package com.flamey;

public class SIBTest //Static initialization block test
{
    public static final String owner;

    static
    {
        owner = "Ivo";
        System.out.println("The owner is " + owner);
    }

    public SIBTest()
    {
        System.out.println("SIB constructor called.");
    }

    static
    {
        System.out.println("Second static block called.");
    }

    public void someMethod()
    {
        System.out.println("Some method called!");
    }
}
