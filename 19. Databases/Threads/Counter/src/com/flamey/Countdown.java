package com.flamey;

import static com.flamey.ThreadColor.*;

public class Countdown
{
    public void doCountdown()
    {
        String color;
        //private int i; - This is in the heap and all threads will use it at the same time! (Instance Variable)

        switch(Thread.currentThread().getName())
        {
            case "Thread 1":
            {
                color = ANSI_CYAN;
                break;
            }
            case "Thread 2":
            {
                color = ANSI_PURPLE;
                break;
            }
            default:
            {
                color = ANSI_GREEN;
                break;
            }
        }

        //This i is in the Thread Stack hence each Thread has a copy of it in their own stack and can use it separately
        //(local variable)
        for(int i = 10; i > 0; i--)
        {
            System.out.println(color + Thread.currentThread().getName() + ": i = " + i);
            try {
                Thread.sleep(1000);
            } catch(InterruptedException e)
            {
                System.out.println("Interrupted! Syke!");
            }
        }
    }
}
