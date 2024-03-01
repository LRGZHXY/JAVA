package com.practice2;

public class test7 {

    public static void main(String[] args) {
        compare(1, 2);
    }

    public static void compare(byte b1, byte b2) {
        System.out.println("  byte");
        System.out.println(b1 == b2);
    }

    public static void compare(int a1, int a2) {
        System.out.println("int");
        System.out.println(a1 == a2);
    }

}
