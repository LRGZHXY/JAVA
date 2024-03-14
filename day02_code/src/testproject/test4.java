package testproject;
//定义一个方法，将价格低于3000的手机信息返回
import java.util.ArrayList;

public class test4 {
    public static void main(String[] args) {
        //创建集合对象
        ArrayList<Phone> list=new ArrayList<>();

        //创建手机的对象
        Phone p1=new Phone("小米",1000);
        Phone p2=new Phone("苹果",8000);
        Phone p3=new Phone("华为",2999);

        //添加数据
        list.add(p1);
        list.add(p2);
        list.add(p3);

        //调用方法
        ArrayList<Phone> phoneInfoList=getPhoneInfo(list);

        //遍历集合
        for (int i = 0; i < phoneInfoList.size(); i++) {
            Phone phone = phoneInfoList.get(i);
            System.out.println(phone.getBrand()+","+phone.getPrice());
        }

    }

    //如果我们要返回多个数据，可以把这些数据先放到一个容器中，再把容器返回
    public static ArrayList<Phone> getPhoneInfo(ArrayList<Phone> list){
        //定义一个集合用于存储价格低于3000的手机对象
        ArrayList<Phone> resultList=new ArrayList<>();
        //遍历集合
        for (int i = 0; i < list.size(); i++) {
            Phone p=list.get(i);
            int price=p.getPrice();
            if(price<3000){
                resultList.add(p);
            }
        }
        return resultList;
    }

}
