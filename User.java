import java.util.ArrayList;
public class User {
    private final String userID;
    private final String pin;
    private double balance;
    private ArrayList<Transactions> transactionHistory;

    public User(String userID, String pin, double initialBalance) {
        this.userID = userID;
        this.pin = pin;
        this.balance = initialBalance;
        this.transactionHistory = new ArrayList<>();
    }

    public String getUserID() { return userID; }
    public String getPin() { return pin; }
    public double getBalance() { return balance; }
    public ArrayList<Transactions> getTransactionHistory() { return transactionHistory; }

    public void addTransaction(Transactions transaction) {
        transactionHistory.add(transaction);
    }

    public void updateBalance(double amount) {
        balance += amount;
    }
}
