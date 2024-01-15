import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;
public class DateConvert {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a short date (YYYY-MM-DD): ");
        String shortDate = scanner.nextLine();
        try {
            SimpleDateFormat inputFormat = new SimpleDateFormat("yyyy-MM-dd");
            Date date = inputFormat.parse(shortDate);
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date);
            String dayOfWeekName = new SimpleDateFormat("EEEE", Locale.ENGLISH).format(date);
            int day = calendar.get(Calendar.DAY_OF_MONTH);
            int year = calendar.get(Calendar.YEAR);
            System.out.println("Short Date: " + shortDate);
            System.out.println("Full Date: "  +  getMonthName(calendar)+ " " + day + " " + ", " + year);
        } catch (ParseException e) {
            System.err.println("Invalid date format");
        }
    }
    private static String getMonthName(Calendar calendar) {
        String[] monthNames = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        int month = calendar.get(Calendar.MONTH);
        return monthNames[month];
    }
}
