import java.util.Scanner;

public class Main {

    public static int convert(Long val) {
        int a;
        if (val == null) {
            a = 0;
        } else if (val > Integer.MAX_VALUE) {
            a = Integer.MAX_VALUE;
        } else if (val < Integer.MIN_VALUE) {
            a = Integer.MIN_VALUE;
        } else {
            a = val.intValue();
        }
        return a;
    }


    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String val = scanner.nextLine();
        Long longVal = "null".equals(val) ? null : Long.parseLong(val);
        System.out.println(convert(longVal));
    }
}