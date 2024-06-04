package test;

public class RandomUppercaseLetter {
    public static void main(String[] args) {
        // ASCII values for uppercase letters range from 65 ('A') to 90 ('Z')
        int letter = 65 + (int)(Math.random() * (90 - 65 + 1)); // +1 to include 90 in range

        // Cast the integer to char to get the corresponding uppercase letter
        char randomUppercase = (char)letter;

        // Display the result
        System.out.println("Random uppercase letter: " + randomUppercase);
    }
}

