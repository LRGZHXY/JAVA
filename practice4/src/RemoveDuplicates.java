import java.util.ArrayList;
import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        ArrayList<Integer> list=new ArrayList<Integer>();
        for(int i=0;i<n;i++){
            list.add(input.nextInt());
        }

        RemoveDuplicate(list);

        for(Integer num:list){
            System.out.print(num+" ");
        }
    }
    public static void RemoveDuplicate(ArrayList<Integer> list){
        ArrayList<Integer> temp=new ArrayList<>();
        for(Integer num:list){
            if(!temp.contains(num)){
                temp.add(num);
            }
        }
        list.clear();
        list.addAll(temp);
    }
}
