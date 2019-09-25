package date_time;

import java.time.Duration;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

/**
 * @author Evgeny Borisov
 */
public class Main {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        LocalDate tomorrow = now.plusDays(1);
        LocalDate ilan = LocalDate.of(1973, 8, 23);
        LocalDate evgeny = LocalDate.of(1978, 3, 10);
        System.out.println(tomorrow);
        System.out.println(tomorrow.getDayOfWeek().getDisplayName(TextStyle.SHORT, Locale.ENGLISH));
        System.out.println(tomorrow.getDayOfWeek().getDisplayName(TextStyle.FULL_STANDALONE, Locale.JAPAN));
        System.out.println(tomorrow.getDayOfWeek().getDisplayName(TextStyle.SHORT, Locale.JAPAN));

        long between = ChronoUnit.DAYS.between(ilan, evgeny);
        System.out.println("between = " + between);
    }


}
