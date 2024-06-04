package shiyan1;

public class TestAccount {
    public static void main(String[] args) {
        // Create an account with ID 1122 and a balance of $20,000
        Account account = new Account(1122, 20000);

        // Set the annual interest rate to 4.5%
        account.setAnnualInterestRate(4.5);

        // Withdraw $2,500
        account.withdraw(2500);

        // Deposit $3,000
        account.deposit(3000);

        // Print the balance, the monthly interest, and the date when this account was created
        System.out.println("Balance: $" + account.getBalance());
        System.out.println("Monthly Interest: $" + account.getMonthlyInterest());
        System.out.println("Date Created: " + account.getDateCreated());
    }
}
