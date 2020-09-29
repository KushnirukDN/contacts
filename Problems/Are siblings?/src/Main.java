import java.io.ByteArrayOutputStream;

class Main {
    public static void main(String[] args) {
        int[] message = new int[]{114, 101, 97, 100, 32, 97, 98, 111, 117, 116, 32, 65, 83, 67, 73, 73};

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        for (int code : message) {
            outputStream.write(code);
        }

        System.out.println(outputStream.toString());
    }
}


/*import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

class Main {
    public static void main(String[] args) throws IOException {

File file = new File("/Users/dmytro/Downloads/hren.txt");
        FileWriter writer = new FileWriter(file, true); // appends text to the file

        writer.write("Hello, World\n");
        writer.close();
    }
}*/


// поиск года, в котором был самый большой прирост. Поиск производится в файле, в колонке.
/*import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        File file = new File("/Users/dmytro/Downloads/dataset_91069.txt");
        int year = 0;
        long increase = 0;


        try (Scanner scanner = new Scanner(file)) {
            String head = scanner.nextLine();
            year = Integer.parseInt(scanner.next());
            long population = Long.parseLong(scanner.next().replace(",", ""));
            while (scanner.hasNext()) {
                int nextYear = Integer.parseInt(scanner.next());
                long nextPopulation = Long.parseLong(scanner.next().replace(",", ""));
                long newIncrease = nextPopulation - population;
                population = nextPopulation;

                if (newIncrease > increase) {
                    increase = newIncrease;
                    year = nextYear;
                }
            }
            System.out.println(year);
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
    }
}
*/



/* Задача по поиску максимального числа в файле.
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        File file = new File("/Users/dmytro/Downloads/dataset_91007.txt");
        int max = 0;

        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNext()) {
                int next = Integer.parseInt(scanner.next());
                if (next > max) {
                    max = next;
                }
            }
            System.out.println(max);
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
    }
} */