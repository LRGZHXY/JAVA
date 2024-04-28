package testproject;

import java.util.Scanner;

public class test6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        Double c=a*1.0/b;
        System.out.println(c);
    }

}
