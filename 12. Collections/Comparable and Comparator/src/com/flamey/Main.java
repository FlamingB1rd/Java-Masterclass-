package com.flamey;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.function.DoubleToIntFunction;

public class Main {

    public static void main(String[] args)
    {
        Theater theater = new Theater("Olympian", 8, 12);

        if(theater.reserveSeat("D12"))
        {
            System.out.println("Pay for the seat.");
        }
        else
        {
            System.out.println("The seat is already reserved!");
        }

        if(theater.reserveSeat("B13"))
        {
            System.out.println("Pay for the seat.");
        }
        else
        {
            System.out.println("The seat is already reserved!");
        }

        List<Theater.Seat> priceSeats =  new ArrayList<>(theater.getSeats());
        priceSeats.add(theater.new Seat("B00",13.00));
        priceSeats.add(theater.new Seat("A00", 13.00));
        //sorted by Comparator overridden compare method
        //can be replaced with priceSeats.sort(Theater.PRICE_ORDER);
        //noticeably the previous sort isn't removed. It doesn't move around the
        //object if unnecessary, so even tho it's sorted by price, the seats are sorted as well
        //with the exception of B00 and A00. B00 is first because it was added first to the list.
        Collections.sort(priceSeats, Theater.PRICE_ORDER);
        printList(priceSeats);
        //sorted by CompareTo
        Collections.sort(priceSeats);
        printList(priceSeats);
    }

    public static void printList(List<Theater.Seat> list)
    {
        for(Theater.Seat seat : list)
        {
            System.out.print(" " + seat.getSeatNumber() + " $" + seat.getPrice());
        }
        System.out.println();
        System.out.println("==================================================");
    }
}
