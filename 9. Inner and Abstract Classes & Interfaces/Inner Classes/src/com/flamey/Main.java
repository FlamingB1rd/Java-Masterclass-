package com.flamey;

import java.util.Scanner;

public class Main
{
    private static Scanner scanner = new Scanner((System.in));
    private static Button btnPrint = new Button("Print");

    public static void main(String[] args)
    {
        //inner class test
//        Gearbox ncLaren = new Gearbox(6);
//        ncLaren.operateClutch(true);
//        ncLaren.changeGear(1);
//        ncLaren.operateClutch(false);
//        System.out.println(ncLaren.wheelSpeed(1000));
//        ncLaren.changeGear(2);
//        System.out.println(ncLaren.wheelSpeed(3000));
//        ncLaren.operateClutch(true);
//        ncLaren.changeGear(3);
//        ncLaren.operateClutch(false);
//        System.out.println(ncLaren.wheelSpeed(6000));


        //local class test
//        class ClickListener implements Button.OnClickListener
//        {
//            public ClickListener()
//            {
//                System.out.println("I've been attached");
//            }
//
//            @Override
//            public void onClick(String title)
//            {
//                System.out.println(title + " was clicked");
//            }
//        }

        //anonymous class
        btnPrint.setOnClickListener(new Button.OnClickListener()
        {
            @Override
            public void onClick(String title)
            {
                System.out.println(title + " was clicked");
            }
        });
        listen();
    }

    private static void listen()
    {
        System.out.println("To quit: 0");
        System.out.println("To press ze shiny button: 1");

        boolean quit = false;
        while(!quit)
        {
            System.out.print("CHOOSE YOUR DESTENY: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch(choice)
            {
                case 0:
                    quit = true;
                    break;
                case 1:
                    btnPrint.onClick();

            }
        }
    }
}
