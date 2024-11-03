
import java.util.Scanner;
public class AtmOperations {
    private User user;
    private Scanner sc;

    public AtmOperations(User user) {
        this.user = user;
        this.sc = new Scanner(System.in);
    }

    public void transfer() {
        System.out.print("Enter transfer amount: ");
        double amount = sc.nextDouble();
        if (amount > 0 && amount <= user.getBalance()) {
            user.updateBalance(-amount);
            user.addTransaction(new Transactions("Transfer", amount));
            System.out.println("Transferred: $" + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    public void withdraw() {
        System.out.print("Enter withdraw amount: ");
        double amount = sc.nextDouble();
        if (amount > 0 && amount <= user.getBalance()) {
            user.updateBalance(-amount);
            user.addTransaction(new Transactions("Withdraw", amount));
            System.out.println("Withdrawn Amount: $" + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    public void deposit() {
        System.out.print("Enter deposit amount: ");
        double amount = sc.nextDouble();
        if (amount > 0) {
            user.updateBalance(amount);
            user.addTransaction(new Transactions("Deposit", amount));
            System.out.println("Deposited Amount: $" + amount);
        } else {
            System.out.println("Invalid amount.");
        }
    }

    public void showTransactionHistory() {
        System.out.println("Transaction History:");
        for (Transactions transaction : user.getTransactionHistory()) {
            System.out.println(transaction);
        }
    }
}