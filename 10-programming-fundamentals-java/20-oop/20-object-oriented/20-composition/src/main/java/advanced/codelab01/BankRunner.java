package advanced.codelab01;

import java.util.Scanner;

/**
 * Read the README.md file
 */
public class BankRunner {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter account owner's firstname");
        String firstName = scan.next();
        System.out.println("Enter account owner's lastname");
        String lastName = scan.next();
        AccountOwner accountOwner = new AccountOwner(firstName, lastName);

        System.out.println("Enter account's initial balance");
        double balance = scan.nextDouble();

        Account account = new Account(balance, accountOwner);
        System.out.println("Created account: " + account);

        System.out.println("Enter amount you wish to withdraw");
        double withdrawal = scan.nextDouble();

        account.withdraw(withdrawal);
        System.out.println("New balance: " + account.getBalance());

        System.out.println("Enter amount you wish to deposit");
        double deposit = scan.nextDouble();

        account.deposit(deposit);
        System.out.println("New balance: " + account.getBalance());

        System.out.println("Thank you for using our bank services");
    }

}
