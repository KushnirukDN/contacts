import java.time.LocalDate;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        LocalDate date = LocalDate.parse(line);

        System.out.println(date.getDayOfYear() + " " + date.getDayOfMonth());
    }
}