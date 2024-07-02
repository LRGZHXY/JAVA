import java.util.Scanner;

public class testChar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();

        int letterCount = countLetters(str);

        System.out.println(letterCount);

        input.close();
    }

        public static int countLetters(String s){
            int count=0;
            for (int i = 0; i < s.length(); i++) {
                char ch = s.charAt(i);
                if(Character.isLetter(ch)){
                    count++;
                }
            }
            return count;
        }
}
