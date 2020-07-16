package org.xpdojo.bank;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AccountTest {

/*    @Test
	@Disabled
    public void depositAnAmountToIncreaseTheBalance() {
        assertThat("your first test").isBlank();
    }*/
    @Test
    public void newAccountShouldHaveZeroBalance() {
        Account account=new Account();
        assertThat(account.getBalance()).isEqualTo(0);
    }

    @Test
    public void newAccountHasBalanceWhenSpecifiedOnOpening() {
        Account account = new Account(10);
        assertThat(account.getBalance()).isEqualTo(10);
    }

    @Test
    public void depositingMoneyIntoAccountIncreasesBalance() {
        Account account = new Account(10);
        account.deposit(10);
        assertThat(account.getBalance()).isEqualTo(20);
    }

    @Test
    public void withdrawMoneyFromAccountRemainingBalance() {
        Account account = new Account(10);
        int withdrawnMoney = account.withdraw(2);
        assertThat(account.getBalance()).isEqualTo(8);
    }

    @Test
    public void withdrawMoneyFromAccountReducesBalance() {
        Account account = new Account(10);
        int withdrawnMoney = account.withdraw(2);
        assertThat(withdrawnMoney).isEqualTo(2);
    }

    @Test
    public void MovingFromAccountToAnother() {
        Account accountsaving = new Account(1000);
        Account accountcurrent = new Account(1000);
        int withdrawnMoney = accountsaving.withdraw(100);
        accountcurrent.deposit(100);
        assertThat(accountsaving.getBalance()).isEqualTo(900);
        assertThat(accountcurrent.getBalance()).isEqualTo(1100);
    }

    @Test
    public void TransferFromAccountToAnotherDeposit() {
        Account accountsaving = new Account(1000);
        Account accountcurrent = new Account(1000);
        accountcurrent.transfer(accountsaving,accountcurrent,100);
        assertThat(accountsaving.getBalance()).isEqualTo(1100);
    }

    @Test
    public void TransferFromAccountToAnotherWithdrwal() {
        Account accountsaving = new Account(1000);
        Account accountcurrent = new Account(1000);
        accountcurrent.transfer(accountsaving,accountcurrent,100);
        assertThat(accountsaving.getBalance()).isEqualTo(1100);
        assertThat(accountcurrent.getBalance()).isEqualTo(900);
    }

    @Test
    public void PrintAccountBalance(){
        Account account=new Account(100);
        account.deposit(10);
        account.printBalance();
    }
}
