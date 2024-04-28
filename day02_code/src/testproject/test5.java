package testproject;

import java.util.Scanner;

public class test5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        //int max=a>b?a:b;
        System.out.println(Math.max(a,b));
    }

}
