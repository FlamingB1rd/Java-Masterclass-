package com.flamey;

import static com.flamey.ThreadColor.ANSI_GREEN;

public class MyRunnable implements Runnable {

    @Override
    public void run() {
        System.out.println(ANSI_GREEN + "Coming in with a Hello from the Runnable implementation");
    }
}
