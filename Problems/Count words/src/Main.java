import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine().trim();
        reader.close();

        if (!str.isEmpty()) {
            String[] newString = str.split("\\s+");
            System.out.println(newString.length);
        } else {
            System.out.println(0);
        }
    }
}