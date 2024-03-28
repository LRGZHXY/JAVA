package testproject;

import java.util.Scanner;

public class test7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int temp=a;
        int b;
        int count=0;

        while(temp!=0)
        {
            b=temp%10;
            temp/=10;
            count+=b;
        }

        System.out.println(count);
    }

}
