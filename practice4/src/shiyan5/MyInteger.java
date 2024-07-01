package shiyan5;

public class MyInteger {
    private int value;

    // Constructor
    public MyInteger(int value) {
        this.value = value;
    }

    // Getter method
    public int getValue() {
        return value;
    }

    // Instance methods
    public boolean isEven() {
        return isEven(value);
    }

    public boolean isOdd() {
        return isOdd(value);
    }

    public boolean isPrime() {
        return isPrime(value);
    }

    // Static methods
    public static boolean isEven(int value) {
        return value % 2 == 0;
    }

    public static boolean isOdd(int value) {
        return value % 2 != 0;
    }

    public static boolean isPrime(int value) {
        if (value <= 1) return false;
        for (int i = 2; i <= Math.sqrt(value); i++) {
            if (value % i == 0) return false;
        }
        return true;
    }

    public static boolean isEven(MyInteger myInteger) {
        return myInteger.isEven();
    }

    public static boolean isOdd(MyInteger myInteger) {
        return myInteger.isOdd();
    }

    public static boolean isPrime(MyInteger myInteger) {
        return myInteger.isPrime();
    }

    // Equals methods
    public boolean equals(int value) {
        return this.value == value;
    }

    public boolean equals(MyInteger myInteger) {
        return this.value == myInteger.value;
    }

    // Parse methods
    public static int parseInt(char[] chars) {
        return Integer.parseInt(new String(chars));
    }

    public static int parseInt(String str) {
        return Integer.parseInt(str);
    }

    // Client program to test the MyInteger class
    public static void main(String[] args) {
        MyInteger myInt = new MyInteger(5);

        System.out.println("Value: " + myInt.getValue());
        System.out.println("isEven: " + myInt.isEven());
        System.out.println("isOdd: " + myInt.isOdd());
        System.out.println("isPrime: " + myInt.isPrime());

        System.out.println("isEven(10): " + MyInteger.isEven(10));
        System.out.println("isOdd(10): " + MyInteger.isOdd(10));
        System.out.println("isPrime(10): " + MyInteger.isPrime(10));

        System.out.println("isEven(myInt): " + MyInteger.isEven(myInt));
        System.out.println("isOdd(myInt): " + MyInteger.isOdd(myInt));
        System.out.println("isPrime(myInt): " + MyInteger.isPrime(myInt));

        System.out.println("equals(5): " + myInt.equals(5));
        System.out.println("equals(new MyInteger(5)): " + myInt.equals(new MyInteger(5)));

        System.out.println("parseInt(\"123\"): " + MyInteger.parseInt("123"));
        System.out.println("parseInt(new char[] {'1', '2', '3'}): " + MyInteger.parseInt(new char[] {'1', '2', '3'}));
    }
}
