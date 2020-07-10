package com.flamey;

import java.util.ArrayList;

// Demonstration autoboxing and unboxing in your code
// Hint: Transactions
// Add data validation.
// e.g. check if exists, or does not exist, etc.
// Think about where you are adding the code to perform certain actions
// The Customer class should have an arraylist of Doubles (transactions)

// Customer:
// Name, and the ArrayList of doubles.

public class Customer
{
    private ArrayList<Double> transactions;
    private String name;

    public Customer(String name)
    {
        this.transactions = new ArrayList<>();
        this.name = name;
    }

    public Customer(String name, double transaction)
    {
        this.name = name;
        this.transactions = new ArrayList<Double>();
        this.transactions.add(transaction);
    }

    public void addTransaction(double amount)
    {
        transactions.add(amount);
    }

    public ArrayList<Double> getListOfTransactions()
    {
        return transactions;
    }

    public String getName()
    {
        return name;
    }
}
