import java.util.Scanner;
import java.util.TreeSet;

public class telephone {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        TreeSet<String> A=new TreeSet<>();

        for (int i = 0; i < 2; i++) {
            String s=scanner.nextLine().trim();
            while(!s.equals("end")){
                A.add(s);
                s=scanner.nextLine().trim();
            }
        }

        for (String s : A) {
            System.out.println(s);
        }

        scanner.close();
    }
}