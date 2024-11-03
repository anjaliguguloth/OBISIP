
import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        BankName bank = new BankName();
        Scanner sc = new Scanner(System.in);
        
        System.out.println("\nWelcome to the ATM!");
        System.out.print("Please Enter Your UserID: ");
        String userID = sc.nextLine();
        System.out.print("Please Enter Your PIN: ");
        String pin = sc.nextLine();

        if (bank.authenticateUser(userID, pin)) {
            AtmOperations operations = new AtmOperations(bank.getUser(userID));
            boolean running = true;

            while (running) {
                System.out.println("\nATM Menu:");
                System.out.println("1. Transfer");
                System.out.println("2. Withdraw");
                System.out.println("3. Deposit");
                System.out.println("4. Transaction History");
                System.out.println("5. Quit");
                System.out.print("Choose an option: ");
                int choice = sc.nextInt();

                switch (choice) {
                    case 1 -> operations.transfer(); 
                    case 2 -> operations.withdraw();
                    case 3 -> operations.deposit();
                    case 4 -> operations.showTransactionHistory();
                    case 5 ->{
                        System.out.println("Thank you for using the ATM!");
                        running = false;
                    }
                    default -> System.out.println("Invalid option. Please try again.");
                }
            }
        } else {
            System.out.println("Authentication failed. Exiting..");
        }
        sc.close();
    }
}

