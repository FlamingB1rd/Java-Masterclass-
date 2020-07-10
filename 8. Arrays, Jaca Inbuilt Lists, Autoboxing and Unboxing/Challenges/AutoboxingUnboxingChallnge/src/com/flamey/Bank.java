package com.flamey;

// Bank:
// Add a new branch
// Add a customer to that branch with initial transaction
// Add a transaction for an existing customer for that branch
// Show a list of customers for a particular branch and optionally a list
// of their transactions
// It should have an arraylist of Branches

import java.util.ArrayList;

public class Bank
{
    private String bankName;
    private ArrayList<Branch> branchDetails;

    public Bank(String bankName)
    {
        this.bankName = bankName;
        this.branchDetails = new ArrayList<>();
    }

    public void addNewBranch(Branch branch, Customer customer)
    {
        int position = findExistingBranch(branch.getBranchName());
        if(position >= 0)
        {
            System.out.println("Branch already exists!");
            return;
        }

        branchDetails.add(branch);
        branchDetails.get(0).addNewCustomer(customer);
    }

    public void makeNewTransaction(String branchName, String customerName, double amount)
    {
        int position = findExistingBranch(branchName);
        if(position >= 0)
        {
            branchDetails.get(position).addNewTransactionToExistingCustomer(customerName, amount);
            return;
        }

        System.out.println("Branch does not exist!");
    }

    public void addNewCustomerToBranch(String branchName, Customer customer)
    {
        int position = findExistingBranch(branchName);
        if(position >= 0)
        {
            branchDetails.get(position).addNewCustomer(customer);
            return;
        }

        System.out.println("Branch does not exist!");
    }

    public void printBranchDetails(String branchName)
    {
        int position = findExistingBranch(branchName);
        if(position >= 0)
        {
            Branch branch = branchDetails.get(position);
            branch.printCustomersInBranch();
        }
    }

    private int findExistingBranch(String branchName)
    {
        for(int i = 0; i < branchDetails.size(); i++)
        {
            Branch branch = branchDetails.get(i);
            if(branch.getBranchName().equalsIgnoreCase(branchName))
            {
                return i;
            }
        }
        return -1;
    }
}
