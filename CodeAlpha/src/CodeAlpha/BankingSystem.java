package CodeAlpha;

import java.util.Scanner;

public class BankingSystem {

    public static void main(String[] args) {
        // Create a new Account object
        Account account = new Account();
        Scanner scanner = new Scanner(System.in);

        // Display the main menu
        int choice;
        do {
            System.out.println("\n--- Simple Banking System ---");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice (1-4): ");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // Handle deposit
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = scanner.nextDouble();
                    account.deposit(depositAmount);
                    break;

                case 2:
                    // Handle withdrawal
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = scanner.nextDouble();
                    account.withdraw(withdrawAmount);
                    break;

                case 3:
                    // Check balance
                    account.checkBalance();
                    break;

                case 4:
                    // Exit the program
                    System.out.println("Exiting the banking system. Goodbye!");
                    break;

                default:
                    // Invalid input
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4); // Continue until user chooses to exit

        scanner.close(); // Close the scanner
    }
}
