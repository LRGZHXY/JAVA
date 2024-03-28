package testproject;

import java.util.Scanner;

public class test10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Double x1=sc.nextDouble();
        Double y1=sc.nextDouble();
        Double x2=sc.nextDouble();
        Double y2=sc.nextDouble();
        Double x3=sc.nextDouble();
        Double y3=sc.nextDouble();

        Double a=Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
        Double b=Math.sqrt((x1-x3)*(x1-x3)+(y1-y3)*(y1-y3));
        Double c=Math.sqrt((x2-x3)*(x2-x3)+(y2-y3)*(y2-y3));

        double x = Math.toDegrees(Math.acos((c * c - b * b - a * a) / (-2 * a * b)));
        double y = Math.toDegrees(Math.acos((b * b - a * a - c * c) / (-2 * a * c)));
        double z = Math.toDegrees(Math.acos((a * a - b * b - c * c) / (-2 * b * c)));

        System.out.printf("%.2f %.2f %.2f",x,y,z);
    }
}
