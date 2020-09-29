import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = readArrayList(scanner);
        int number = scanner.nextInt();
        ArrayList<Integer> newList = new ArrayList<>();
        int min = minNumber(number, list);

        for (Integer item : list) {
            if (Math.abs(item - number) == min) {
                newList.add(item);
            }
        }

        Collections.sort(newList);
        for (Integer item : newList) {
                System.out.print(item + " ");
        }
    }

    public static int minNumber(int number, ArrayList<Integer> list) {
        int minNumber;
        ArrayList<Integer> minList = new ArrayList<>();
        for (Integer j : list) {
            int a = Math.abs(number - j);
            minList.add(a);
        }
        minNumber = Collections.min(minList);
        return minNumber;
    }

    private static ArrayList<Integer> readArrayList(Scanner scanner) {
        return Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toCollection(ArrayList::new));
    }
}
