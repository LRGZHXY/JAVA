import java.util.Scanner;

public class isPrime {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        long m=scanner.nextLong();
        int n=scanner.nextInt();

        findAndPrintPrimes(m,n);
    }

    private static void findAndPrintPrimes(long m,int count){
        for(long i=m;count>0;i++){
            if(isPrime(i)){
                System.out.println(i);
                count--;
            }
        }
    }

    private static boolean isPrime(long num){
        if(num<=1){
            return false;
        }
        for(long i=2;i*i<num;i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
}
/*import java.math.BigInteger;
import java.util.Scanner;

public class isPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String mStr = scanner.next();
        String nStr = scanner.next();

        scanner.close();

        BigInteger m = new BigInteger(mStr);
        int n = Integer.parseInt(nStr);

        int count = 0;
        BigInteger number = m;

        while (count < n) {
            if (isPrime1(number)) {
                System.out.println(number);
                count++;
            }
            number = number.add(BigInteger.ONE); // Increment number
        }
    }

    public static boolean isPrime1(BigInteger num) {
        if (num.compareTo(BigInteger.ONE) <= 0) {
            return false;
        }
        if (num.equals(BigInteger.TWO) || num.equals(BigInteger.valueOf(3))) {
            return true;
        }
        if (num.mod(BigInteger.TWO).equals(BigInteger.ZERO) || num.mod(BigInteger.valueOf(3)).equals(BigInteger.ZERO)) {
            return false;
        }

        BigInteger sqrtNum = num.sqrt().add(BigInteger.ONE);
        for (BigInteger i = BigInteger.valueOf(5); i.compareTo(sqrtNum) < 0; i = i.add(BigInteger.valueOf(6))) {
            if (num.mod(i).equals(BigInteger.ZERO) || num.mod(i.add(BigInteger.valueOf(2))).equals(BigInteger.ZERO)) {
                return false;
            }
        }

        return true;
    }
}*/
