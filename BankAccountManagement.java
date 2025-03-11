import java.util.Scanner;

public class BankAccountManagement {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);

            SavingsAccount savingsAccount = new SavingsAccount();

            // Input Account Number
            System.out.print("Enter Account Number: ");
            savingsAccount.accountNumber = scanner.nextInt();
            scanner.nextLine();

            // Input Account Holder
            System.out.print("Enter Account Holder: ");
            savingsAccount.accountHolder = scanner.nextLine();

            // Input Balance
            System.out.print("Enter Balance: ");
            double balance = scanner.nextDouble();
            savingsAccount.setBalance(balance);

            // Display Account Details
            savingsAccount.displayDetails();

            scanner.close();
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}

class BankAccount {
    public int accountNumber;
    protected String accountHolder;
    private double balance;

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if(balance >= 0) {
            this.balance = balance;
        } else {
            System.out.println("Invalid balance. Must be non-negative.");
        }
    }
}

class SavingsAccount extends BankAccount {
    public void displayDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: " + getBalance());
    }
}

/*
Input:
Enter Account Number: 123456
Enter Account Holder: Prakul
Enter Balance: 150000

Output:
Account Number: 123456
Account Holder: Prakul
Balance: 150000
*/
