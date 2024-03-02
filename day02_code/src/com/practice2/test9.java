package com.practice2;
//将数字位置随机交换，不能重复
import java.util.Random;

public class test9 {
    public static void main(String[] args) {
        int[] arr={2,3,4,5,6};
        Random r=new Random();
        for (int i = 0; i < arr.length; i++) {
            int randomIndex=r.nextInt(arr.length);
            int temp=arr[i];
            arr[i]=arr[randomIndex];
            arr[randomIndex]=temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }

}
