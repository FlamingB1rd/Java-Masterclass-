package com.example.awtSample;

import java.awt.*; //give me access to everything in this package
import java.awt.event.*; // this is a different package
 // java.awt.event != java.awt

public class MyWindow extends Frame
{
    public MyWindow(String title)
    {
        super(title);
        setSize(500,140);
        addWindowListener(new WindowAdapter()
        {
            @Override
            public void windowClosing(WindowEvent e)
            {
                System.exit(0);
            }
        });
    }

    @Override
    public void paint(Graphics g)
    {
        super.paint(g);
        Font sansSerifLarge = new Font("SansSerif", Font.BOLD, 18);
        Font sansSerifSmall = new Font("SansSerif", Font.BOLD, 12);
        g.setFont(sansSerifLarge);
        g.drawString("The Complete Java Developer Course!", 60, 60);
        g.setFont(sansSerifSmall);
        g.drawString("Flamey is Awesome!", 60, 100);
    }
}
