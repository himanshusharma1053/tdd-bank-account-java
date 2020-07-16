package org.xpdojo.bank;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

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
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        System.out.println("Account Balance on "+dtf.format(now)+" is "+balance);
    }
}
