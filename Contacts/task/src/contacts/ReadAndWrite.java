package contacts;

import java.io.*;
import java.util.ArrayList;

public class ReadAndWrite{

    public static void serialize(ArrayList<Record> phoneBook) throws IOException {
        FileOutputStream fos = new FileOutputStream("/Users/dmytro/Desktop/phonebook");
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(phoneBook);
        oos.close();
    }

    public static ArrayList<Record> deserialize() throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream("/Users/dmytro/Desktop/phonebook");
        BufferedInputStream bis = new BufferedInputStream(fis);
        ObjectInputStream ois = new ObjectInputStream(bis);
        ArrayList<Record> phoneBook = (ArrayList<Record>) ois.readObject();
        ois.close();
        return phoneBook;
    }
}



