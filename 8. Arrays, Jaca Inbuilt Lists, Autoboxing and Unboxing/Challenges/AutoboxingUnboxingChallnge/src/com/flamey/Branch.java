package com.flamey;

// Branch:
// Need to be able to add a new customer and initial transaction amount.
// Also needs to add additional transactions for that customer/branch
// Each Branch should have an arraylist of Customers

import java.util.ArrayList;

public class Branch
{
    private String branchName;
    private ArrayList<Customer> customerDetails;

    public Branch(String branchName)
    {
        this.branchName = branchName;
        customerDetails = new ArrayList<>();
    }

    private int findExistingCustomer(String customerName)
    {
        for(int i = 0; i < customerDetails.size(); i++)
        {
            Customer customer = customerDetails.get(i);
            if(customer.getName().equalsIgnoreCase(customerName))
            {
                return i;
            }
        }
        return -1;
    }

    public void addNewCustomer(Customer customer)
    {
        int position = findExistingCustomer(customer.getName());
        if(position < 0)
        {
            customerDetails.add(customer);
            return;
        }

        System.out.println("Customer already exists - perhaps we can make a new transaction for him?");
    }

    public void addNewTransactionToExistingCustomer(String customerName, double newTransaction)
    {
        int position = findExistingCustomer(customerName);
        if(position >= 0)
        {
            System.out.println("Customer found!");
            customerDetails.get(position).addTransaction(newTransaction);
            System.out.println("Transaction successfully made!");
            return;
        }

        System.out.println("Customer does not exist! Transaction failed - perhaps add a new customer?");
    }

    public void printCustomersInBranch()
    {
        System.out.println("----------------------------------");
        for(int i = 0; i < customerDetails.size(); i++)
        {
            Customer customer = customerDetails.get(i);
            System.out.println(" Customer #" +  (i + 1) + ": " + customer.getName() + " | Branch: " + branchName + "\n Customer transactions: ");
            for(int j = 0; j < customer.getListOfTransactions().size(); j++)
            {
                System.out.println("\t Transaction #" + (j + 1) + ": " + customer.getListOfTransactions().get(j) + "$");
            }
            System.out.println("----------------------------------");
        }
    }

    public String getBranchName()
    {
        return branchName;
    }

    public ArrayList<Customer> getCustomerDetailsList()
    {
        return customerDetails;
    }

}
