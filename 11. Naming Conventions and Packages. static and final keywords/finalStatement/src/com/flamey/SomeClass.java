package com.flamey;

public class SomeClass
{
    private static int classCounter;
    public final int instanceNumber;
    private final String name;

    public SomeClass(String name)
    {
        classCounter++;
        instanceNumber = classCounter;
        this.name = name;
        System.out.println(name + " created, instance is " + instanceNumber);
    }

    public int getInstanceNumber()
    {
        return instanceNumber;
    }
}
