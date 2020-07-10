package com.flamey;

public class Main {

    public static void main(String[] args)
    {
        BankAccount bankAccount = new BankAccount("Ivo", "Ivo@abv.bg", "0886845651", 10000, 1234);
        bankAccount.depositeFunds(1000);
        bankAccount.withdrawFunds(1500);
        System.out.println(bankAccount.getBalance());
    }
}
