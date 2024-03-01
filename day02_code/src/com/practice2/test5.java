package com.practice2;

import java.util.Random;

public class test5 {
    public static void main(String[] args) {
    int[] arr={1,2,3,4,5};
    Random r=new Random();

        for (int i = 0; i < arr.length; i++) {
            int number=r.nextInt(arr.length);
            int temp=arr[i];
            arr[i]=arr[number];
            arr[number]=temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
