package TwenrtOne;
import java.time.YearMonth;
import java.time.LocalDate;

public class LastDateMonth {
    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();
        YearMonth yearMonth = YearMonth.of(currentDate.getYear(),
                currentDate.getMonth());

        LocalDate lastDateOfMonth = yearMonth.atEndOfMonth();
        System.out.println("The last date of the Month is: "+ lastDateOfMonth);
    }
}
