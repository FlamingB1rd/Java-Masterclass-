package com.flamey;

public class PC
{
    //!Explanation in Monitor class*
    //Full example of Composition:
    private Case theCase;
    private Monitor monitor;
    private Motherboard motherboard;

    public PC(Case theCase, Monitor monitor, Motherboard motherboard)
    {
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }

    public void powerUp()
    {
        theCase.pressPowerButton();
        drawLogo();
    }

    private void drawLogo()
    {
        //Fancy graphics
        monitor.drawPixelArt(2000,1500, "yellow");
    }
}
