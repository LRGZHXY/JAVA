package test;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.nextLine(); //消耗换行符

        ArrayList<String> names = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            names.add(scanner.nextLine());
        }

        Collections.sort(names);

        for (String name : names) {
            System.out.println(name);
        }
    }
}

