package com.flamey;

public class Monitor
{
    private String model;
    private String manufacturer;
    private int size;
    private Resolution nativeResolution; //An early example of Composition. Resolution is not Monitor but it's a
    //part of it. We use the class Resolution as a custom data type for the class Monitor

    public Monitor(String model, String manufacturer, int size, Resolution nativeResolution)
    {
        this.model = model;
        this.manufacturer = manufacturer;
        this.size = size;
        this.nativeResolution = nativeResolution;
    }

    public void drawPixelArt(int x, int y, String color)
    {
        System.out.println("Drawing pixel art at " + x + "x" + y + " in color " + color);
    }

    public String getModel()
    {
        return model;
    }

    public String getManufacturer()
    {
        return manufacturer;
    }

    public int getSize()
    {
        return size;
    }

    public Resolution getNativeResolution()
    {
        return nativeResolution;
    }
}
