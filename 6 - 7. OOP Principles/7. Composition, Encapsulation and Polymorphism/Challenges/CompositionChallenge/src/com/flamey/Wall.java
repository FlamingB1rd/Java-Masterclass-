package com.flamey;

public class Wall
{
    private int height;
    private int width;
    private String side;

    public Wall(int height, int width, String side)
    {
        this.height = height;
        this.width = width;
        this.side = side;
    }

    public int getHeight()
    {
        return height;
    }

    public int getWidth()
    {
        return width;
    }

    public String getSide()
    {
        return side;
    }
}
