package com.flamey;

// Create a new class for a bank account
// Create fields for the account number, balance, customer name, email and phone number.
//
// Create getters and setters for each field
// Create two additional methods
// 1. To allow the customer to deposit funds (this should increment the balance field).
// 2. To allow the customer to withdraw funds. This should deduct from the balance field,
// but not allow the withdrawal to complete if their are insufficient funds.
// You will want to create various code in the Main class (the one created by IntelliJ) to
// confirm your code is working.
// Add some System.out.println's in the two methods above as well.

public class BankAccount
{
    private String customerName;
    private String email;
    private String phoneNumber;
    private double balance;
    private long accountNumber;

    public BankAccount()
    {
        this("Nunu", "NoEmailDefault@abv.bg", "(089) 1234 567", 0.0, 1584248);
    }

    public BankAccount(String customerName, String email, String phoneNumber, double balance, long accountNumber)
    {
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.balance = balance;
        this.accountNumber = accountNumber;
    }

    public void depositeFunds(double amount)
    {
        System.out.println("Depositing " + amount + " funds from balance.");
        this.balance += amount;
    }

    public void withdrawFunds(double amount)
    {
        if(this.balance - amount < 0)
        {
            System.out.println("Only " + balance + " funds in account. Current withdraw not possible.");
        }
        else
        {
            System.out.println("Withdrawing " + amount + " funds from balance.");
            this.balance -= amount;
        }
    }

    public String getCustomerName()
    {
        return customerName;
    }

    public void setCustomerName(String customerName)
    {
        this.customerName = customerName;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public String getPhoneNumber()
    {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber)
    {
        this.phoneNumber = phoneNumber;
    }

    public double getBalance()
    {
        return balance;
    }

    public void setBalance(double balance)
    {
        this.balance = balance;
    }

    public long getAccountNumber()
    {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber)
    {
        this.accountNumber = accountNumber;
    }
}
