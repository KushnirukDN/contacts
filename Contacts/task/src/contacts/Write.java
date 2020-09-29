package contacts;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Write {
    public static void write(String[] args) throws IOException {

        File file = new File("/Users/dmytro/Downloads/Contacts.txt");
        FileWriter writer = new FileWriter(file, true);

        writer.write(String.valueOf(args));
        writer.close();
    }
}
