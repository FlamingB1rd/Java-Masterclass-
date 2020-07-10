package com.flamey;

import org.w3c.dom.ls.LSOutput;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Demo
{
    public static void main(String[] args)
    {
        LinkedList<String> placesToVisit = new LinkedList<>();
        addInOrder(placesToVisit, "Sydney");
        addInOrder(placesToVisit, "Melbourne");
        addInOrder(placesToVisit, "Brisbane");
        addInOrder(placesToVisit, "Perth");
        addInOrder(placesToVisit, "Canberra");
        addInOrder(placesToVisit, "Adelaide");
        addInOrder(placesToVisit, "Darwin");
        printList(placesToVisit);

        addInOrder(placesToVisit, "Sydney");
        addInOrder(placesToVisit, "Alice Springs");

        printList(placesToVisit);

        visit(placesToVisit);
    }

    private static void printList(LinkedList<String> linkedList)
    {
        //iterator
        Iterator<String> i = linkedList.iterator(); //i++
        while(i.hasNext())//is there another entry?
        {
            System.out.println("Now visiting " + i.next()); //return current value and move on
        }
        System.out.println("========================");
    }

    private static boolean addInOrder(LinkedList<String> linkedList, String newCity)
    {
        ListIterator<String> stringListIterator = linkedList.listIterator();
        while(stringListIterator.hasNext())
        {
            // 0 = equal
            int comparison = stringListIterator.next().compareTo(newCity);
            if(comparison == 0)
            {
                //equal, do not add
                System.out.println(newCity + " is already included as a destination!");
                return false;
            }
            else if(comparison > 0)
            {
                //new City should appear before this one
                //Exanmple: Brisbane <-> Adelaide(newCity)
                //in this case A comes before B so the comparison returns > 0
                //hence Adelaide should be before Brisbane
                //but .next() already moved to the next entry so before we do anything else
                //we need to move back to Brisbane
                stringListIterator.previous();// you cant do dis with a normal iterator
                stringListIterator.add(newCity);
                return true;
            }
            else if (comparison < 0)
            {
                //move on next city
                //.next() has already done that for us so now we just need to wait for the loop to repeat
            }
        }
        //If we've come so far without adding an entry to the list
        //that means the entry will have to go at the end of the list
        stringListIterator.add(newCity);
        return true;
    }

    public static void visit(LinkedList<String> cities)
    {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean goingForward = true;
        ListIterator<String> listIterator = cities.listIterator();

        if(cities.isEmpty())
        {
            System.out.println("No cities in the itenerary");
            return;
        }
        else
        {
            System.out.println("Now visiting " + listIterator.next());
            printMenu();
        }

        while(!quit)
        {
            System.out.print("Choose: ");
            int action = scanner.nextInt();
            scanner.nextLine();
            switch(action)
            {
                case 0:
                    System.out.println("Holidat (Vacation) over");
                    quit = true;
                    break;
                case 1:
                    if(!goingForward)
                    {
                        if(listIterator.hasNext())
                            listIterator.next();
                        goingForward = true;
                    }
                    if(listIterator.hasNext())
                    {
                        System.out.println("Now visiting " + listIterator.next());
                    }
                    else
                    {
                        System.out.println("Reached the end of the list");
                        goingForward = false;
                    }
                    break;
                case 2:
                    if(goingForward)
                    {
                        if(listIterator.hasPrevious())
                            listIterator.previous();
                        goingForward = false;
                    }
                    if(listIterator.hasPrevious())
                    {
                        System.out.println("Now visiting " + listIterator.previous());
                    }
                    else
                    {
                        System.out.println("We are at the start of the list");
                        goingForward = true;
                    }
                    break;
                case 3:
                    printMenu();
                    break;
            }
        }
    }

    private static void printMenu()
    {
        System.out.print("Press: \n"
                        + "\t0 - to quit\n"
                        + "\t1 - go to next city\n"
                        + "\t2 - go to previous city\n"
                        + "\t3 - print menu options again\n");
    }




}
