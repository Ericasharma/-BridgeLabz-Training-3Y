import java.util.*;

class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = Math.max(initialBalance, 0);
    }

    public void Deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Total balance: " + balance);
        } else {
            System.out.println("Invalid amount");
        }
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount.");
        } else if (amount > balance) {
            System.out.println("Insufficient funds. Withdrawal denied.");
        } else {
            balance -= amount;
            System.out.println("Withdrew: " + amount);
        }
    }

    public double checkBalance() {
        return balance;
    }
}

public class BankAccountManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Account Number: ");
        String accNo = sc.nextLine();

        System.out.print("Enter Initial Balance: ");
        double balance = sc.nextDouble();

        BankAccount acc = new BankAccount(accNo, balance);

        System.out.print("Enter amount to deposit: ");
        double depositAmt = sc.nextDouble();
        acc.Deposit(depositAmt);

        System.out.print("Enter amount to withdraw: ");
        double withdrawAmt = sc.nextDouble();
        acc.withdraw(withdrawAmt);

        System.out.println("Final Balance: " + acc.checkBalance());

        sc.close();
    }
}
