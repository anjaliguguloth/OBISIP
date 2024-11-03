//import java.util.Scanner;
public class Transactions{
    private final String type;
    private final double amount;

    public Transactions(String type, double amount) {
        this.type = type;
        this.amount = amount;
    }

    @Override
    public String toString() {
        return type + ": $" + amount;
    }
}
