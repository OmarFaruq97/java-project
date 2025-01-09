package SixthClass;


import java.util.Calendar;

public class Calnder {
    public static void main(String[] args) {
        int year = 2024;
        int month = 12;

        printCalendar(year, month);
    }

    public static void printCalendar(int year, int month) {
        month = month - 1;

        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, year);
        calendar.set(Calendar.MONTH, month);
        calendar.set(Calendar.DAY_OF_MONTH, 1);

        int firstDayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
        int daysInMonth = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);

        System.out.println("\n  Calendar for " + year + ", " + (month + 1));
        System.out.println(" Sun Mon Tue Wed Thu Fri Sat");

        for (int i = 1; i < firstDayOfWeek; i++) {
            System.out.print("\t\t");
        }
        for (int day = 1; day <= daysInMonth; day++) {
            System.out.printf("%3d ", day);

            if ((day + firstDayOfWeek - 1) % 7 == 0) {
                System.out.println();
            }
        }
        System.out.println();
    }
}


