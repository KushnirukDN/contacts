import java.util.*;

class FixingNullPointerException {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        String string1 = "null";
        if (Objects.equals(string, string1)) {
            System.out.println("NPE!");
        } else {
            System.out.println(string.toLowerCase());
        }
    }
}