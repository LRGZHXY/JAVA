import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Dictionary {
    public static void main(String[] args) {
        Map<String,String> dictionary = new HashMap<String,String>();
        dictionary.put("encapsulation","封装性");
        dictionary.put("inheritance", "继承性");
        dictionary.put("polymorphism", "多态性");
        dictionary.put("message", "消息");
        dictionary.put("class", "类");
        dictionary.put("object", "对象");
        dictionary.put("constructor", "构造方法");

        Scanner sc=new Scanner(System.in);
        String word=sc.nextLine().trim().toLowerCase();
        sc.close();

        if(dictionary.containsKey(word)){
            System.out.println(word+":"+dictionary.get(word));
        }else{
            System.out.println("抱歉！没有找到" + word);
        }
    }
}
