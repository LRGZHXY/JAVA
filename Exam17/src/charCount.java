import java.util.Scanner;

public class charCount {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        String str=scanner.next();
        char a=scanner.next().charAt(0);

        int count=count(str,a);
    }

    public static int count(String str, char a) {
        int count=0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)==a){
                count++;
            }
        }
        return count;
    }
}
