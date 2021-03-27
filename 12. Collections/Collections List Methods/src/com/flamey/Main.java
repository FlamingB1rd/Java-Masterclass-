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
        List<Theater.Seat> seatCopy = new ArrayList<>(theater.seats);
        // shallow copy - it's not a true copy; the list is new but the objects are the same. If we reserve a seat
        // it'll stay reserved no matter from where we access it.
        printList(seatCopy);

        //to test
        seatCopy.get(1).reserve();
        if(theater.reserveSeat("A02"))
        {
            System.out.println("Pay for the seat.");
        }
        else
        {
            System.out.println("The seat is already reserved!"); //this will execute
        }

        //reverse order of a list
        //Collections.reverse(seatCopy);
        //Shuffle elements of a list
        Collections.shuffle(seatCopy); //psuedo Randomization
        System.out.println("Printing seatCopy: ");
        printList(seatCopy);
        //to check that both are referencing the same list
        System.out.println("Printing theater list: ");
        printList(theater.seats);
        //The result might be a bit confusing - we can see that both list are different
        //one is reversed and the other not
        //but the objects inside are still referencing the same object
        //so even tho we have different lists, the objects themselves are the same

        //Min and Max return min and max elements according to their natural sort order
        //decided by CompareTo
        Theater.Seat minSeat = Collections.min(seatCopy);
        //the methods work even in unsorted lists as seen by using seatCopy which is currently shuffled
        Theater.Seat maxSeat = Collections.max(seatCopy);
        System.out.println("Minimum seat number is: " + minSeat.getSeatNumber());
        System.out.println("Maximum seat number is: " + maxSeat.getSeatNumber());

        //sort the suffled list with our own method
        sortList(seatCopy);
        System.out.println("Printing seatCopy: ");
        printList(seatCopy);

        //Lastly for Collections.copy method
        //to use it we need a new list with the same amount of elements
        //but that list also needs to be filled beforehand
        //example:
        //List<Theater.Seat> newList = new ArrayList<>(theater.seats.size());
        //Collections.copy(newList, theater.seats);
        //This doesn't work... Because newList has the 'potential' to hold the exact number of
        //elements. Line 61 only sets the capacity of the ArrayList but initially containing none
        //So before using the copy method we need to fill newList with 96 objects
    }

    public static void printList(List<Theater.Seat> list)
    {
        for(Theater.Seat seat : list)
        {
            System.out.print(" " + seat.getSeatNumber());
        }
        System.out.println();
        System.out.println("==================================================");

    }

    //bubble sort using swap
    public static void sortList(List<? extends Theater.Seat> list)
    {
        for(int i = 0; i < list.size()-1; i++)
        {
            for(int j = i + 1; j < list.size(); j++)
            {
                if(list.get(i).compareTo(list.get(j)) > 0)
                {
                    Collections.swap(list, i, j);
                }
            }
        }
    }
}
