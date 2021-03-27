package com.flamey;

public class Main {

    public static void main(String[] args)
    {
	    Theater theather = new Theater("Olympian", 8, 12);
	    theather.getSeats();
	    if(theather.reserveSeat("H11"))
        {
            System.out.println("Please pay");
        }
	    else
        {
            System.out.println("Sorry seat already taken.");
        }

        if(theather.reserveSeat("H11"))
        {
            System.out.println("Please pay");
        }
        else
        {
            System.out.println("Sorry seat already taken.");
        }
    }
}
