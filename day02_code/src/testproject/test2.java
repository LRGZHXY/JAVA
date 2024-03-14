package testproject;

import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("输入字符串");
        String str=sc.next();

        String result=new StringBuilder().append(str).reverse().toString();

        if(str.equals(result)){
            System.out.println("字符串对称");
        }else{
            System.out.println("字符串不对称");
        }
    }
}
