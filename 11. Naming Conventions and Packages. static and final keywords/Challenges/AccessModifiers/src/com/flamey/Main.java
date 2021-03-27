package com.flamey;

public class Main {

    public static void main(String[] args)
    {
        Account ivosAccount = new Account("Ivo");
        ivosAccount.deposit(1000);
        ivosAccount.withdraw(500);
        ivosAccount.withdraw(-200);
        ivosAccount.deposit(-100);
        ivosAccount.calculateBalance();

        System.out.println("Balance on account is "  + ivosAccount.getBalance());
    }
}
