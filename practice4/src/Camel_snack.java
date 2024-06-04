import java.util.Scanner;

public class Camel_snack {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String camelCase=sc.nextLine();
        sc.close();

        StringBuilder snakeCase=new StringBuilder();
        for(int i=0;i<camelCase.length();i++){
            char c=camelCase.charAt(i);
            if(Character.isUpperCase(c)){
                snakeCase.append("_").append(Character.toLowerCase(c));
            }else{
                snakeCase.append(c);
            }
        }
        System.out.println(snakeCase.toString());
    }
}
