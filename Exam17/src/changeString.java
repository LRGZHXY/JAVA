import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class changeString {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        List<String> lines=new ArrayList<>();

        String line=scanner.nextLine();
        while(!line.equalsIgnoreCase("end")){
            lines.add(line);
        }

        String oldString=scanner.nextLine();
        String newString=scanner.nextLine();

        for (String originalLine : lines) {
            String replacedLine=originalLine.replace(oldString,newString);
            System.out.println(replacedLine);
        }

        scanner.close();
    }
}
