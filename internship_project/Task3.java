
import java.util.Scanner;

// Step 1: Create a class to represent the ATM
class ATM {
    private BankAccount account;

    public ATM(BankAccount account) {
        this.account = account;
    }

    // Step 3: Implement methods
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount.");
        } else if (account.getBalance() >= amount) {
            account.debit(amount);
            System.out.println(" Withdrawal successful. Amount: ₹" + amount);
        } else {
            System.out.println(" Insufficient balance.");
        }
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println(" Invalid deposit amount.");
        } else {
            account.credit(amount);
            System.out.println(" Deposit successful. Amount: ₹" + amount);
        }
    }

    public void checkBalance() {
        System.out.println(" Current Balance: ₹" + account.getBalance());
    }
}
class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public void debit(double amount) {
        balance -= amount;
    }

    public void credit(double amount) {
        balance += amount;
    }

    public double getBalance() {
        return balance;
    }
}
public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BankAccount userAccount = new BankAccount(10000.00);
        ATM atm = new ATM(userAccount);

        while (true) {
            System.out.println("\n==== ATM Menu ====");
            System.out.println("1. Withdraw");
            System.out.println("2. Deposit");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter withdrawal amount: ₹");
                    double withdrawAmount = scanner.nextDouble();
                    atm.withdraw(withdrawAmount);
                    break;
                case 2:
                    System.out.print("Enter deposit amount: ₹");
                    double depositAmount = scanner.nextDouble();
                    atm.deposit(depositAmount);
                    break;
                case 3:
                    atm.checkBalance();
                    break;
                case 4:
                    System.out.println("Thank you for using our ATM!");
                    scanner.close();
                    return;
                default:
                    System.out.println(" Invalid option. Please try again.");
            }
        }
    }
}









