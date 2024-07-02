import java.util.Scanner;

public class snakeToCamel {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String snakeCase=scanner.nextLine();
        String camelCase=convertSnakeToCamel(snakeCase);
        System.out.println(camelCase);
    }
    public static String convertSnakeToCamel(String snakeCase){
        StringBuilder camelCase=new StringBuilder();
        boolean toUpper=false;
        for(char c:snakeCase.toCharArray()){
            if(c=='_'){
                toUpper=true;
            }else{
                camelCase.append(toUpper?Character.toUpperCase(c):c);
                toUpper=false;
            }
        }
        return camelCase.toString();
    }
}
