package com.practice2.test11;

public class GoodsTest {
    public static void main(String[] args) {
        //创建一个数组
        Goods[] arr=new Goods[3];
        //创建三个商品对象
        Goods g1=new Goods("001","华为",5999.0,100);
        Goods g2=new Goods("002","杯子",113.0,10);
        Goods g3=new Goods("003","零食",59,14);
        //把商品添加到数组
        arr[0]=g1;
        arr[1]=g2;
        arr[2]=g3;
        //遍历
        for (int i = 0; i < arr.length; i++) {
            Goods goods=arr[i];
            System.out.println(goods.getId()+","+goods.getName()+","+goods.getPrice()+","+goods.getCount());
        }
    }
}
