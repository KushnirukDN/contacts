import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {

    public static LocalDateTime merge(LocalDateTime dateTime1, LocalDateTime dateTime2) {
        int year1 = dateTime1.getYear();
        int month1 = dateTime1.getMonthValue();
        int day1 = dateTime1.getDayOfMonth();
        int hours1 = dateTime1.getHour();
        int minutes1 = dateTime1.getMinute();
        int seconds1 = dateTime1.getSecond();

        int year2 = dateTime2.getYear();
        int month2 = dateTime2.getMonthValue();
        int day2 = dateTime2.getDayOfMonth();
        int hours2 = dateTime2.getHour();
        int minutes2 = dateTime2.getMinute();
        int seconds2 = dateTime2.getSecond();

        return LocalDateTime.of(Math.max(year1, year2),
                Math.max(month1, month2),
                Math.max(day1, day2),
                Math.max(hours1, hours2),
                Math.max(minutes1, minutes2),
                Math.max(seconds1, seconds2));
    }

    /* Do not change code below */
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final LocalDateTime firstDateTime = LocalDateTime.parse(scanner.nextLine());
        final LocalDateTime secondDateTime = LocalDateTime.parse(scanner.nextLine());
        System.out.println(merge(firstDateTime, secondDateTime));
    }
}