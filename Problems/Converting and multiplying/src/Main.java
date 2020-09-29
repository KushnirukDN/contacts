import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = null;

        do {
            try {
                input = scanner.nextLine();
                if (!"0".equals(input)) {
                    int result = Integer.parseInt(input) * 10;
                    System.out.println(result);
                }
            } catch (Exception e) {
                System.out.println("Invalid user input: " + input);
            }
        } while (!"0".equals(input));
    }
}