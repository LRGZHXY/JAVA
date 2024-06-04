import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        sc.close();

        if(isPalindrome(number)){
            System.out.println(number+" is a palindrome.");
        }else{
            System.out.println(number+" is NOT a palindrome.");
        }
    }
    public static int reverse(int number){
        int reversedNumber=0;
        while(number!=0){
            int digit=number%10;
            reversedNumber=reversedNumber*10+digit;
            number=number/10;
        }
        return reversedNumber;
    }
    public static boolean isPalindrome(int number){
        return number==reverse(number);
    }
}
