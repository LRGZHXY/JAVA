/*public class SquareNumber {
    public static void main(String[] args) {
        int count = 10;

        long start = (long) Math.sqrt(Long.MAX_VALUE) + 1;

        for (int i = 0; i < count; i++) {
            long square = start * start;
            System.out.println(square);
            start++;
        }
    }
}*/


public class SquareNumber {
    public static void main(String[] args) {
        long start = (long) Math.ceil(Math.sqrt(Long.MAX_VALUE));

        int count = 0;

        while (count < 10) {
            long square = start * start;
            System.out.println(square);
            start++;
            count++;
        }
    }
}

