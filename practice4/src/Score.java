import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Score {
    public static void main(String[] args) {
        Map<String,Integer> scores = new HashMap<String,Integer>();
        Scanner sc=new Scanner(System.in);

        while(true){
            String input=sc.nextLine();
            if(input.equals("noname")){
                break;
            }
            String[] parts=input.split(" ");
            String name = parts[0];
            int score = Integer.parseInt(parts[1]);
            scores.put(name, score);
        }
        String queryName=sc.nextLine().trim();
        if(scores.containsKey(queryName)){
            double score=scores.get(queryName)*0.21;
            System.out.println(String.format("%.2f",score));
        }else{
            System.out.println("Not found.");
        }
        sc.close();
    }
}
