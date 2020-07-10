package com.flamey;

//Composition incorporation

public class Addition
{
    private String name;
    private double price;
    private boolean added;

    public Addition(String name, double price)
    {
        this.name = name;
        this.price = price;
        this.added = false;
    }

    public void add()
    {
        this.added = true;
    }


    public boolean isAdded()
    {
        return added;
    }

    public String getName()
    {
        return name;
    }

    public double getPrice()
    {
        return price;
    }
}
