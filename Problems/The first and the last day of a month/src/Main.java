import java.time.LocalDate;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        int month = scanner.nextInt();

        LocalDate date1 = LocalDate.of(year, month, 1);
        LocalDate dateTemp = date1.plusMonths(1);
        LocalDate date2 = dateTemp.minusDays(1);

        System.out.println(date1 + " " + date2);
    }
}
