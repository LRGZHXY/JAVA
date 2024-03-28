package testproject;

import java.util.Scanner;

public class test9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int x=a+b+c;
        int y=a*b*c;
        Double z=x*1.0/3;
        String f=String.format("%.2f",z);
        System.out.println(x+" "+y+" "+f);
    }
}
