package com.flamey;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args)
    {
        Customer customer = new Customer("Ivo", 20.22);
        Customer anotherCustomer = customer;
        anotherCustomer.setBalance(45.20);
        System.out.println("Balance for customer " + customer.getName() + " is " + customer.getBalance());

        ArrayList<Integer> intList = new ArrayList<>();

        intList.add(12);
        intList.add(22);
        intList.add(32);
        intList.add(42);

        for(int i = 0; i < intList.size(); i++)
        {
            System.out.println(i + " --> " + intList.get(i));
        }

        intList.add(1, 1);

        for(int i = 0; i < intList.size(); i++)
        {
            System.out.println(i + " --> " + intList.get(i));
        }


        //The advantage of linked list is that when we have to add or delete new items
        //we don't have to push all the others elements up or down but instead
        //due to the nature of the linked list itself we can just insert it with minor
        //alterations


    }
}
