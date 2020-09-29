import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> nameList = new ArrayList<>(Arrays.asList("Mr.Green", "Mr.Yellow", "Mr.Red"));
        int size = nameList.size();

        for (int i = 0; i < size; i++) {
            System.out.println(nameList.get(i));
        }
    }
}