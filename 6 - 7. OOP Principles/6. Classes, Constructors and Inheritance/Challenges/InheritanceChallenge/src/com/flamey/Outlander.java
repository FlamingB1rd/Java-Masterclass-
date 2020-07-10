package com.flamey;

public class Outlander extends Car
{
    private int roadService;

    public Outlander(int roadService)
    {
        super("Outlander", "4WD", 5, 5, 6 , false);
        this.roadService = roadService;
    }

    public void accelerate (int rate)
    {
        int newVelocity = getCurrentVelocity() + rate;

        if(newVelocity == 0)
        {
            stop();
            changeCurrentGear(1);
        }
        else if (newVelocity > 0 && newVelocity <= 10)
        {
            changeCurrentGear(1);
        }
        else if (newVelocity > 10 && newVelocity <= 20)
        {
            changeCurrentGear(2);
        }
        else if (newVelocity > 20 && newVelocity <= 30)
        {
            changeCurrentGear(3);
        }
        else if (newVelocity > 30 && newVelocity <= 40)
        {
            changeCurrentGear(4);
        }
        else
        {
            changeCurrentGear(5);
        }

        if(newVelocity > 0)
        {
            changeVelocity(newVelocity, getCurrentDirection());
        }
     }
}
