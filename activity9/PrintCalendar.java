import java.util.Calendar;
import java.util.GregorianCalendar;

public class PrintCalendar {

    public static void main(String[] args) {

        if (args.length < 2) {
            System.out.println("Usage: java PrintCalendar <month> <year>");
            return;
        }

        int month = Integer.parseInt(args[0]);
        int year = Integer.parseInt(args[1]);

        GregorianCalendar cal = new GregorianCalendar(year, month - 1, 1);

        System.out.println("\n     " + getMonthName(month) + " " + year);
        System.out.println("-----------------------------");
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        int startDay = cal.get(Calendar.DAY_OF_WEEK);

        for (int i = 1; i < startDay; i++) {
            System.out.print("    ");
        }

        int totalDays = cal.getActualMaximum(Calendar.DAY_OF_MONTH);

        for (int i = 1; i <= totalDays; i++) {
            System.out.printf("%3d ", i);

            if ((i + startDay - 1) % 7 == 0) {
                System.out.println();
            }
        }

        System.out.println();
    }

    public static String getMonthName(int m) {
        String[] months = {
            "January","February","March","April","May","June",
            "July","August","September","October","November","December"
        };
        return months[m - 1];
    }
}