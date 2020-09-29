import java.util.Scanner;
import java.time.*;

class Main {
    public static void main(String[] args) {
        String line = new Scanner(System.in).nextLine();
        LocalTime time = LocalTime.parse(line).withSecond(0);
        System.out.println(time);
    }
}