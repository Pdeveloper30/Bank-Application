package Bankapp;

import java.util.Scanner;

public class bankapp {

    private static double balance = 0;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean quit = false;
        while (!quit) {
            printMenu();
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    deposit();
                    break;
                case 2:
                    withdraw();
                    break;
                case 3:
                    checkBalance();
                    break;
                case 4:
                    quit = true;
                    break;
                default:
                    System.out.println("Invalid choice, please enter a valid option.");
            }
        }
        System.out.println("Thank you for using our banking application.");
    }

    private static void printMenu() {
        System.out.println("\nMenu:");
        System.out.println("1. Deposit");
        System.out.println("2. Withdraw");
        System.out.println("3. Check Balance");
        System.out.println("4. Exit");
    }

    private static void deposit() {
        System.out.print("Enter the amount to deposit: ");
        double amount = scanner.nextDouble();
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful. Current balance: " + balance);
        } else {
            System.out.println("Invalid amount. Deposit failed.");
        }
    }

    private static void withdraw() {
        System.out.print("Enter the amount to withdraw: ");
        double amount = scanner.nextDouble();
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful. Current balance: " + balance);
        } else {
            System.out.println("Invalid amount or insufficient funds. Withdrawal failed.");
        }
    }

    private static void checkBalance() {
        System.out.println("Current balance: " + balance);
    }
}


