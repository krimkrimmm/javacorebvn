import java.util.Scanner;

class Account {
    private String username;
    private String password;
    private double balance;

    public Account(String username, String password, double balance) {
        this.username = username;
        this.password = password;
        this.balance = balance;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public double getBalance() {
        return balance;
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("You have withdrawn " + amount + " VND at " + java.time.LocalTime.now());
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    public void displayInfo() {
        System.out.println("Username: " + username);
        System.out.println("Password: " + password);
        System.out.println("Balance: " + balance);
    }
}

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Account account = new Account("techmaster", "hoclacoviec", 1000000);

        while (true) {
            System.out.println("Enter username:");
            String username = scanner.nextLine();
            System.out.println("Enter password:");
            String password = scanner.nextLine();

            if (username.equals(account.getUsername()) && password.equals(account.getPassword())) {
                while (true) {
                    System.out.println("1. View account information");
                    System.out.println("2. Withdraw money");
                    System.out.println("Do you want to continue? (Y/N)");
                    String choice = scanner.nextLine();

                    if (choice.equals("1")) {
                        account.displayInfo();
                    } else if (choice.equals("2")) {
                        System.out.println("Enter amount to withdraw:");
                        double amount = scanner.nextDouble();
                        scanner.nextLine(); // consume newline
                        account.withdraw(amount);
                    }

                    System.out.println("Do you want to continue? (Y/N)");
                    String continueChoice = scanner.nextLine();
                    if (continueChoice.equalsIgnoreCase("N")) {
                        System.exit(0);
                    }
                }
            } else {
                System.out.println("Login failed. Do you want to try again? (Y/N)");
                String retry = scanner.nextLine();
                if (retry.equalsIgnoreCase("N")) {
                    break;
                }
            }
        }
        scanner.close();
    }
}



