package com.flamey;

import java.util.ArrayList;

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

public class MobilePhone
{
    private ArrayList<Contacts> contactsList = new ArrayList<>();

    //create
    public void addContact(Contacts person)
    {
        int position = contactAlreadyExists(person.getName());
        if(position >= 0)
        {
            System.out.println("There is already a contact with that name!");
        }
        else
        {
            contactsList.add(person);
            System.out.println("Contact successfully added!");
        }
    }

    //query
    public void printAllContacts()
    {
        System.out.println("You have " + contactsList.size() + " contacts in your phone:");
        for(int i = 0; i < contactsList.size(); i++)
        {
            System.out.println((i+1) + ". " + contactsList.get(i).getName());
        }
    }

    //modify
    public void modifyContact(String currentName, String newPhoneNumber)
    {
        int position = contactAlreadyExists(currentName);
        if(position >= 0)
        {
            Contacts contact = contactsList.get(position);
            contact.setPhoneNumber(newPhoneNumber);
            System.out.println("Contact " + currentName + "has been modified.");
        }
        else
        {
            System.out.println("That contact does not exist!");
        }
    }


    //remove contact
    public void removeContact(String name)
    {
        int position = contactAlreadyExists(name);
        if(position >= 0)
        {
            contactsList.remove(position);
            System.out.println(name + " successfully removed!");
        }
        else
        {
            System.out.println("That contact does not exist!");
        }
    }

    private int contactAlreadyExists(String name)
    {
        for(int i = 0; i < contactsList.size();i++)
        {
            Contacts contact = contactsList.get(i);
            if(contact.getName().equalsIgnoreCase(name))
            {
                return contactsList.indexOf(contact);
            }
        }
        return -1;
    }

    public void onList(String name)
    {
        int position = contactAlreadyExists(name);
        if(position >= 0)
        {
            Contacts contact = contactsList.get(position);
            System.out.println("Found " + contact.getName() + " in your contacts list. Their phone number: " + contact.getPhoneNumber());
        }
        else System.out.println(name + " is not in your contacts list");
    }
}
