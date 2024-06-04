import java.math.BigInteger;
import java.util.Scanner;

public class BigNum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n=scan.nextInt();
        scan.close();

        BigInteger longMaxValue=BigInteger.valueOf(Long.MAX_VALUE);
        BigInteger nextNumber=longMaxValue.add(BigInteger.ONE);

        BigInteger bigN=BigInteger.valueOf(n);
        BigInteger remainder=nextNumber.mod(bigN);
        if(!remainder.equals(BigInteger.ZERO)){
            nextNumber=nextNumber.add(bigN.subtract(remainder));
        }

        for (int i = 0; i < 3; i++) {
            System.out.println(nextNumber);
            nextNumber=nextNumber.add(bigN);
        }
    }
}
