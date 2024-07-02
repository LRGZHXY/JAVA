import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class calendar {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        long mills=scanner.nextLong();
        GregorianCalendar calendar=new GregorianCalendar();
        calendar.setTimeInMillis(mills);

        int year=calendar.get(Calendar.YEAR);
        int month=calendar.get(Calendar.MONTH);
        int day=calendar.get(Calendar.DAY_OF_MONTH);

        System.out.println(year+"-"+month+"-"+day);
    }
}
