package com.practice2;

import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("自己的时髦度");
        int my=sc.nextInt();
        System.out.println("别人的时髦度");
        int he=sc.nextInt();
        boolean result=my>he;
        System.out.println(result);
    }
}
