import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Score {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Map<String,Integer> scores = new HashMap<>();

        while(true){
            String name=input.next();
            if(name.equals("noname")){
                break;
            }
            int score=scores.get(name);
            scores.put(name,score);
        }

        while(input.hasNext()){
            String query=input.next();
            if(scores.containsKey(query)){
                int score=scores.get(query);
                double adjustedScore=score*0.21;
                System.out.printf("%.2f\n",adjustedScore);
            }else{
                System.out.println("Not found.");
            }
        }

        input.close();
    }
}
