import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();
        String regexCount = "[a-zA-z0-9]{12,}";
        String regexLowerCase = ".*[a-z].*";
        String regexUpperCase = ".*[A-Z].*";
        String regexDigit = ".*[0-9].*";
        boolean count = password.matches(regexCount);
        boolean lowerCase = password.matches(regexLowerCase);
        boolean upperCase = password.matches(regexUpperCase);
        boolean digit = password.matches(regexDigit);

        System.out.println(count && lowerCase && upperCase && digit ? "YES" : "NO");
    }
}