package com.flamey;

// Create a program that implements a simple mobile phone with the following capabilities.
// Able to store, modify, remove and query contact names.
// You will want to create a separate class for Contacts (name and phone number).
// Create a master class (MobilePhone) that holds the ArrayList of Contacts
// The MobilePhone class has the functionality listed above.
// Add a menu of options that are available.
// Options:  Quit, print list of contacts, add new contact, update existing contact, remove contact
// and search/find contact.
// When adding or updating be sure to check if the contact already exists (use name)
// Be sure not to expose the inner workings of the Arraylist to MobilePhone
// e.g. no ints, no .get(i) etc
// MobilePhone should do everything with Contact objects only.

import java.util.Scanner;

public class Main
{

    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone();

    public static void main(String[] args)
    {
        int choice;
        boolean quit = false;
        printInstructions();

        while(!quit)
        {
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice)
            {
                case 1:
                    quit = true;
                    break;
                case 2:
                    mobilePhone.printAllContacts();
                    break;
                case 3:
                    addContact();
                    break;
                case 4:
                    modifyContact();
                    break;
                case 5:
                    removeContact();
                    break;
                case 6:
                    searchForContact();
                    break;
                case 7:
                    printInstructions();
                    break;
            }
        }
        System.out.println("Closing phone...");
    }

    private static void searchForContact()
    {
        System.out.print("Enter the name of the contact you wish to find: ");
        String name = scanner.nextLine();

        mobilePhone.onList(name);
    }

    private static void removeContact()
    {
        System.out.print("Enter the name of the contact you wish to remove: ");
        String name = scanner.nextLine();

        mobilePhone.removeContact(name);
    }

    private static void modifyContact()
    {
        System.out.print("Enter the name of the contact you wish to update: ");
        String name = scanner.nextLine();
        System.out.print("Enter the new phone number of the contact: ");
        String newPhoneNumber = scanner.nextLine();

        mobilePhone.modifyContact(name, newPhoneNumber);
    }

    private static void addContact()
    {
        System.out.print("Enter the name of the new contact: ");
        String name = scanner.nextLine();
        System.out.print("Enter the phone number of the new contact: ");
        String phoneNumber = scanner.nextLine();

        Contacts contact = new Contacts(name, phoneNumber);

        mobilePhone.addContact(contact);
    }

    public static void printInstructions()
    {
        System.out.println("\n Press: ");
        System.out.println("\t 1 - To quit.");
        System.out.println("\t 2 - To print the list of contacts on your device.");
        System.out.println("\t 3 - To add a new contact.");
        System.out.println("\t 4 - To update existing contact.");
        System.out.println("\t 5 - To remove a contact.");
        System.out.println("\t 6 - To search for a specific contact.");
        System.out.println("\t 7 - To print options again.");
    }
}
