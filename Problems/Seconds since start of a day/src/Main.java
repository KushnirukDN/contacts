import java.util.Scanner;
import java.time.*;

class Main {
    public static void main(String[] args) {
        int seconds = new Scanner(System.in).nextInt();
        LocalTime time = LocalTime.ofSecondOfDay(seconds);
        System.out.println(time);
    }
}
