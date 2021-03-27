package com.flamey;

import java.util.Scanner;

public class X
{
    private int x;

    public X()
    {
        Scanner x = new Scanner(System.in);
        this.x = Integer.parseInt(x.nextLine());
    }

    public void x()
    {
        for(int x = 1; x < 13; x++)
        {
            System.out.println(this.x + " times " + x + " is: " + this.x * x);
        }
    }
}
