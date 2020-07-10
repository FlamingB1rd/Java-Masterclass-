package com.flamey;

public class Bed
{
    private int width;
    private int length;
    private double price;
    private String style;

    public Bed(int width, int length, double price, String style)
    {
        this.width = width;
        this.length = length;
        this.price = price;
        this.style = style;
    }

    public void make()
    {
        System.out.println("Bed -> making bed!");
    }

    public int getWidth()
    {
        return width;
    }

    public int getLength()
    {
        return length;
    }

    public double getPrice()
    {
        return price;
    }

    public String getStyle()
    {
        return style;
    }
}
