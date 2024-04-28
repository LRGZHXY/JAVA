package testproject;

import java.util.Scanner;

public class test8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=a+b;
        Double m=a*100.0/c;
        Double n=b*100.0/c;

        String x=String.format("%.2f",m);
        String y=String.format("%.2f",n);
        System.out.println(x+"%"+" "+y+"%");
    }
}
