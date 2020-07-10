package com.flamey;

public class Dog extends Animal
{

    public Dog(String name)
    {
        super(name);
    }

    @Override
    public void eat()
    {
        System.out.println(getName() + " is eating");
    }

    @Override
    public void breather()
    {
        System.out.println("Breather in, breathe out, repeat");
    }
}
