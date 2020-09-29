import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        LocalDateTime dateTime = LocalDateTime.parse(new Scanner(System.in).nextLine());
        System.out.println(dateTime.plusHours(11).toLocalDate());
    }
}