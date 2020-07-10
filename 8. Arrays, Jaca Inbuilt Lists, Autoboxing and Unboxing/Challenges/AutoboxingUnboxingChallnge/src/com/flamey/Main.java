package com.flamey;

// You job is to create a simple banking application.

import java.util.Scanner;

public class Main
{
    private static Scanner scanner = new Scanner(System.in);
    private static Bank bank = new Bank("Society General Express Bank");

    public static void main(String[] args)
    {
        printInstructions();
        boolean quit = false;
        int choice;

        while(!quit)
        {
            System.out.print("\nEnter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch(choice)
            {
                case 1:
                    createNewBranch();
                    break;
                case 2:
                    addNewCustomer();
                    break;
                case 3:
                    makeTransaction();
                    break;
                case 4:
                    printDetailsForABranch();
                    break;
                case 5:
                    printInstructions();
                    break;
                case 6:
                    quit = true;
                    break;
            }
        }
    }

    private static void printDetailsForABranch()
    {
        System.out.print("Enter the name of the branch you wish details for: ");
        String name = scanner.nextLine();
        bank.printBranchDetails(name);
    }

    private static void makeTransaction()
    {
        System.out.print("Enter the branch in which the customer is: ");
        String branchName = scanner.nextLine();
        System.out.print("Enter the name of the customer you wish to make a transaction for: ");
        String name = scanner.nextLine();
        System.out.print("Enter the amount you for the transaction: ");
        double amount = Double.parseDouble(scanner.nextLine());
        bank.makeNewTransaction(branchName, name, amount);
    }

    private static void addNewCustomer()
    {
        System.out.print("Enter the branch in which the new customer is going to be: ");
        String branchName = scanner.nextLine();
        System.out.print("Enter the name of the new customer: ");
        String name = scanner.nextLine();
        System.out.print("Enter the amount of the inital transaction: ");
        double amount = Double.parseDouble(scanner.nextLine());

        bank.addNewCustomerToBranch(branchName, new Customer(name, amount));
    }

    private static void createNewBranch()
    {
        System.out.print("Enter the name of the new branch: ");
        String branchName = scanner.nextLine();
        System.out.print("Enter the name of the first customer: ");
        String name = scanner.nextLine();
        System.out.print("Enter the amount of the inital transaction for that customer: ");
        double amount = Double.parseDouble(scanner.nextLine());
        Branch branch = new Branch(branchName);
        Customer customer = new Customer(name, amount);
        bank.addNewBranch(branch, customer);
    }


    private static void printInstructions()
    {
        System.out.print("Choose: \n"
                + "\t 1) Create new branch \n"
                + "\t 2) Add customer to a branch with initial transaction \n"
                + "\t 3) Make a transaction for an existing customer for that branch \n"
                + "\t 4) List details \n"
                + "\t 5) Show the menu \n"
                + "\t 6) Quit \n");
    }

}
