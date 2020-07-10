package com.flamey;

import static com.flamey.ThreadColor.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(ANSI_PURPLE + "Hello from the main thread!");

        Thread anotherThread = new AnotherThread();
        anotherThread.setName("== Another Thread ==");
        anotherThread.start();

        new Thread() {
            public void run()
            {
                System.out.println(ANSI_RED + "Hello from anon thread!");
            }
        }.start();

        Thread runnableThread = new Thread(new MyRunnable(){
            @Override
            public void run() {
                System.out.println(ANSI_GREEN + "Overriding Runnable thread with anon! HELLO HELLO HELLO!");
                try {
                    anotherThread.join();
                    System.out.println(ANSI_GREEN + "Another Thread terminated...or timed out so I'm running again!");
                } catch (InterruptedException e) {
                    System.out.println(ANSI_GREEN + "I couldn't wait after all. I was interrupted again.");
                }
            }
        });
        runnableThread.start();

        //interrupting Another Thread

        System.out.println(ANSI_PURPLE + "Hello again from the main thread!");
    }
}
