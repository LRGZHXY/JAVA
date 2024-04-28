package com.practice2;

public class test6 {
    /*public static void main(String[] args) {
        playGame();
    }
    public static void playGame(){
        System.out.println("选任务");*/

    /*public static void main(String[] args) {
        method(1,2);
    }
    public static void method(int num1,int num2){
        int result=num1+num2;
        System.out.println(result);*/
    public static void main(String[] args) {
        //直接调用
        getsum(1,2);
        //赋值调用
        int sum=getsum(1,2);
        System.out.println(sum);
        //输出调用
        System.out.println(getsum(1,2));
    }
    public static int getsum(int num1,int num2){
        int result=num1+num2;
        return result;
    }

}
