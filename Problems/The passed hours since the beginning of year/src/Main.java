import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        LocalDateTime dateTime = LocalDateTime.parse(new Scanner(System.in).nextLine());
        int date = dateTime.toLocalDate().getDayOfYear();
        int timeSeconds = dateTime.toLocalTime().toSecondOfDay();
        int hours = (date - 1) * 24 + timeSeconds / 3600;
        System.out.println(hours);
    }
}