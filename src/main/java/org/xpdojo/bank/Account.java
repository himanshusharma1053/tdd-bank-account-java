package org.xpdojo.bank;

public class Account {

    private int balance;
    public Account() {}

    public Account(int initialBalance) {
        this.balance = initialBalance;
    }
    public int getBalance() {
        return balance;
    }
    public void deposit(int amount) {
        this.balance += amount;
    }

    public int withdraw(int amount) {
        this.balance -= amount;
        return amount;
    }

    public void transfer(Account accountsaving,Account accountcurrent, int i) {
        accountsaving.deposit(i);
        accountcurrent.withdraw(i);
    }

    public void printBalance() {
        System.out.println("Account Balance is "+balance);
    }
}
