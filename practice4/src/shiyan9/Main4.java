package shiyan9;

public class Main4 {
    public static void main(String[] args) {
        try {
            Loan loan1 = new Loan(2.5, 1, 1000);
            System.out.println("Loan 1 created successfully.");
        } catch (IllegalArgumentException ex) {
            System.out.println("Failed to create loan 1: " + ex.getMessage());
        }

        try {
            Loan loan2 = new Loan(-2.5, 1, 1000);
            System.out.println("Loan 2 created successfully.");
        } catch (IllegalArgumentException ex) {
            System.out.println("Failed to create loan 2: " + ex.getMessage());
        }

        try {
            Loan loan3 = new Loan(2.5, 0, 1000);
            System.out.println("Loan 3 created successfully.");
        } catch (IllegalArgumentException ex) {
            System.out.println("Failed to create loan 3: " + ex.getMessage());
        }

        try {
            Loan loan4 = new Loan(2.5, 1, -1000);
            System.out.println("Loan 4 created successfully.");
        } catch (IllegalArgumentException ex) {
            System.out.println("Failed to create loan 4: " + ex.getMessage());
        }
    }
}

