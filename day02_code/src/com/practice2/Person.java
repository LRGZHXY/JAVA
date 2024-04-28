package com.practice2;

public class Person {
    private int age;//0

    public void method(){
        int age=10;
        System.out.println(age);//10
        System.out.println(this.age);//0
    }
}