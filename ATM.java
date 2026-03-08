// 1.Create a class to represent the ATM machine.
// 2. Design the user interface for the ATM, including options such as withdrawing, depositing, and
// checking the balance.
// 3. Implement methods for each option, such as withdraw(amount), deposit(amount), and
// checkBalance().
// 4. Create a class to represent the user's bank account, which stores the account balance.
// 5. Connect the ATM class with the user's bank account class to access and modify the account
// balance.
// 6. Validate user input to ensure it is within acceptable limits (e.g., sufficient balance for withdrawals).
// 7. Display appropriate messages to the user based on their chosen options and the success or failure
// of their transactions.

import java.util.Scanner;
class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        balance = initialBalance;
    }

    // deposite process
    public void Deposite(double amount) {
        balance = balance + amount;
        System.out.println("Deposited Amount:" + amount + " Rupees.");
    }

    // withdraw process
    public void Withdraw(double amount) {
        if (amount <= balance) {
            balance = balance - amount;
            System.out.println("withdrawn Amount :" + amount + " Rupees.");
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    // check balance process
    public double checkBalance() {
        return balance;
    }

}

public class ATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount account = new BankAccount(25000);
        System.out.println("Welcome to ATM.");
        int choice;
        do {

            System.out.println("\nATM Menu.");
            System.out.println("1. Check Balance.");
            System.out.println("2. Diposite Money.");
            System.out.println("3. Withdraw Money.");
            System.out.println("4. Exit.");

            System.out.print("\nEnter your choice:");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Current Balance :" + account.checkBalance());
                    break;
                case 2:
                    System.out.print("Enter amount to diposite :");
                    double depositeAmount = sc.nextDouble();
                    account.Deposite(depositeAmount);
                    break;
                case 3:
                    System.out.print("Enter amount to withdraw :");
                    double withdrawAmount = sc.nextDouble();
                    account.Withdraw(withdrawAmount);
                    break;
                case 4:
                    System.out.println("Thank you for using ATM.");
                    break;
                default:
                    System.out.println("Invalid option , try again.");
                    break;
            }

        } while (choice != 4);
        sc.close();
    }
}
