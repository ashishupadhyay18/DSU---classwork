

import java.util.Scanner;

class BankAccount {
    int accountNumber;
    String holderName;
    double balance;

    // Constructor
    BankAccount(int accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    // Method to display account details
    void displayDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + holderName);
        System.out.println("Balance: Rs. " + balance);
    }

    // Method to deposit money
    void deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
            System.out.println("Amount deposited successfully.");
            System.out.println("Updated Balance: Rs. " + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Method to check balance
    void checkBalance() {
        System.out.println("Current Balance: Rs. " + balance);
    }
}

public class CircleDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Account Number: ");
        int accNo = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Account Holder Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Initial Balance: ");
        double bal = sc.nextDouble();

        BankAccount account = new BankAccount(accNo, name, bal);

        System.out.println("\n--- Account Details ---");
        account.displayDetails();

        System.out.print("\nEnter amount to deposit: ");
        double amount = sc.nextDouble();

        account.deposit(amount);
        account.checkBalance();

        sc.close();
    }
}


