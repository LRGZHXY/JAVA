import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class ascSort {
    public static void main(String[] args) {
        ArrayList<Student> ar=new ArrayList<>();
        Scanner scanner=new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            String number=scanner.next();
            String name=scanner.next();
            float score=scanner.nextFloat();
            ar.add(new Student(number,name,score));
        }

        Collections.sort(ar, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.number.compareTo(o2.number);
            }
        });

        for (Student student : ar) {
            System.out.println(student);
        }
    }
}
