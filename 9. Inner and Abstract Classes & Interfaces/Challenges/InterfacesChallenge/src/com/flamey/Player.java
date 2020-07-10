package com.flamey;

// Create a few sample classes that implement your Saveable interface (we've used the idea of a game,
// with Players and Monsters, but you can create any type of classes that you want).
//
// Override the toString() method for each of your classes so that they can be easily printed to enable
// the program to be tested easier.
//

import java.util.ArrayList;
import java.util.List;

public class Player implements ISaveable
{
    private String name;
    private int hitPoints;
    private int streangth;
    private String weapon;

    public Player(String name, int hitPoints, int streangth)
    {
        this.name = name;
        this.hitPoints = hitPoints;
        this.streangth = streangth;
        this.weapon = "Sword";
    }

    @Override
    public List<String> write()
    {
        List<String> values = new ArrayList<String>();
        values.add(0, this.name);
        values.add(1,"" + this.hitPoints);
        values.add(2,"" + this.streangth);
        values.add(3, weapon);

        return values;
    }

    @Override
    public void read(List<String> savedValues)
    {
        if(savedValues != null && savedValues.size() > 0)
        {
            this.name = savedValues.get(0);
            this.hitPoints = Integer.parseInt(savedValues.get(1));
            this.streangth = Integer.parseInt(savedValues.get(2));
            this.weapon = savedValues.get(3);
        }
    }

    @Override
    public String toString()
    {
        return "Player{" +
                "name = '" + name + '\'' +
                ", hitPoints = " + hitPoints +
                ", streangth = " + streangth +
                ", weapon = '" + weapon + '\'' +
                '}';
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getHitPoints()
    {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints)
    {
        this.hitPoints = hitPoints;
    }

    public int getStreangth()
    {
        return streangth;
    }

    public void setStreangth(int streangth)
    {
        this.streangth = streangth;
    }

    public String getWeapon()
    {
        return weapon;
    }

    public void setWeapon(String weapon)
    {
        this.weapon = weapon;
    }
}
