package test;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(input.nextInt());
        }

        removeDuplicate(list);

        for (Integer num : list) {
            System.out.print(num + " ");
        }
    }

    public static void removeDuplicate(ArrayList<Integer> list) {
        ArrayList<Integer> temp = new ArrayList<>();
        for (Integer num : list) {
            if (!temp.contains(num)) {
                temp.add(num);
            }
        }
        list.clear();
        list.addAll(temp);
    }
}
