import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

public class Calendar {

    public static void main(String[] args) {
    
        if (args.length != 3) {
            System.out.println("Usage: java Calendar <day> <month> <year>");
            return;
        }

    
        int day = Integer.parseInt(args[0]);
        int month = Integer.parseInt(args[1]);
        int year = Integer.parseInt(args[2]);

        LocalDate date = LocalDate.of(year, month, day);

        String dayOfWeek = date.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.ENGLISH);

        System.out.println("The Day for given date is " + dayOfWeek);
    }
}
