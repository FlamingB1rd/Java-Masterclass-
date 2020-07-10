package com.flamey;

public class Room
{
    private Wall wall1;
    private Wall wall2;
    private Wall wall3;
    private Wall wall4;
    private Ceiling ceiling;
    private Bed bed;
    private Desk desk;
    private Lamp lamp;

    public Room(Wall wall1, Wall wall2, Wall wall3, Wall wall4, Ceiling ceiling, Bed bed, Desk desk, Lamp lamp)
    {
        this.wall1 = wall1;
        this.wall2 = wall2;
        this.wall3 = wall3;
        this.wall4 = wall4;
        this.ceiling = ceiling;
        this.bed = bed;
        this.desk = desk;
        this.lamp = lamp;
    }

    public void makeBed()
    {
        System.out.println("Room -> Making bed!");
        bed.make();
    }

    public Lamp getLamp()
    {
        return this.lamp;
    }
}
