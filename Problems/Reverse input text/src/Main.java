import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();

        byte[] inputAsByte = input.getBytes();

        byte[] result = new byte[inputAsByte.length];

        for (int i = 0; i < inputAsByte.length; i++) {
            result[i] = inputAsByte[inputAsByte.length - i - 1];
        }
        System.out.println(new String(result));
        reader.close();
    }
}


