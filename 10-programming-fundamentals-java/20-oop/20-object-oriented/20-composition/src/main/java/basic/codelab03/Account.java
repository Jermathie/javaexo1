package basic.codelab03;

import java.util.Random;

/**
 * Read the README.md file
 */
public class Account {

    private static final double MAX_WITHDRAWAL_AMOUNT = 5000;
    private static final double MAX_DEPOSIT_AMOUNT = 80000;

    private static int accountCounter;

    private final AccountOwner accountOwner;
    private final long accountNumber;
    protected double balance;

    public Account(double balance, AccountOwner accountOwner) {
        this.balance = balance;
        this.accountOwner = accountOwner;
        this.accountNumber = new Random().nextInt(50000000);
        accountCounter++;
    }

    public double getBalance() {
        return balance;
    }

    public AccountOwner getAccountOwner() {
        return accountOwner;
    }

    public long getAccountNumber() {
        return accountNumber;
    }


    public void withdraw(double amount) {
        if (balance - amount < 0) {
            System.out.println("Can not withdraw more than the total balance");
            return;
        }
        if (amount > MAX_WITHDRAWAL_AMOUNT) {
            System.out.println("Maximum amount allowed to withdraw is 5000");
            return;
        }
        balance -= amount;
    }

    public void deposit(double amount) {
        if(amount > MAX_DEPOSIT_AMOUNT) {
            System.out.println("Maximum amount allowed to deposit is 80000");
            return;
        }
        balance += amount;
    }

    public static int getNumberOfAccounts(){
        return accountCounter;
    }

    @Override
    public String toString(){
        return String.format("Account with number %s and owner %s has balance %s", accountNumber, accountOwner, balance);
    }
}
