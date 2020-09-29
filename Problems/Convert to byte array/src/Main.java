import java.io.*;
import java.lang.reflect.Array;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.io.Serializable;





/*
class Main {
    public static void main (String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Record> phoneBook = null;
        File file = new File("/Users/dmytro/Desktop/PhoneBook.txt");

        System.out.println("enter an action: ");
        int action = scanner.nextInt();

        if (action == 1) {
            if (file.length() == 0) {
                System.out.println("new");
                phoneBook = new ArrayList<>();
                Record record = new Person();
                ReadAndWrite.serialize(phoneBook.add(record), file);
            } else {
                System.out.println("old");
                Record record = new Person();
                //phoneBook = (ArrayList<Record>) ReadAndWrite.deserialize(file);
                ReadAndWrite.serialize(phoneBook.add(record), file);
            }
        } else {
            ReadAndWrite.Example();
           // System.out.println(ReadAndWrite.deserialize(file));
          //  for (Record record : phoneBook) {
            //    System.out.println(record);
            //}
        }
    }
}

class ReadAndWrite {

    public static void serialize(Object obj, File file) throws IOException {
        FileOutputStream fos = new FileOutputStream(file);
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(obj);
        oos.close();
    }

   /* public static ArrayList<Record> deserialize(File file) throws IOException, ClassNotFoundException {
        //ArrayList<Record> phoneBook;
        FileInputStream fis = new FileInputStream(file);
        BufferedInputStream bis = new BufferedInputStream(fis);
        ObjectInputStream ois = new ObjectInputStream(bis);
     //   phoneBook = (ArrayList) ois.readObject();
        ois.close();
        return phoneBook;*/
/*
        public static void Example () throws Exception
            {
                ArrayList<Record> phoneBook = new ArrayList<>();

                try
                {
                    FileInputStream fis = new FileInputStream("/Users/dmytro/Desktop/Look");
                    ObjectInputStream ois = new ObjectInputStream(fis);

                    phoneBook = (ArrayList) ois.readObject();

                    ois.close();
                    fis.close();
                }
                catch (IOException ioe)
                {
                    ioe.printStackTrace();
                    return;
                }
                catch (ClassNotFoundException c)
                {
                    System.out.println("Class not found");
                    c.printStackTrace();
                    return;
                }

                //Verify list data
                for (Record record : phoneBook) {
                    System.out.println(record);
                }
            }
        }

    class Record implements Serializable {

        String name;

        public void setName(String name) {
            this.name = name;
        }

        public void setSurname(String surname) {
        }
    }

    class Person extends Record implements Serializable {
        // private static final long serialVersionUID = 1L;
        String surname;

        public Person() {
            System.out.println("Enter the name of the person:");
            name = new Scanner(System.in).next();
            System.out.println("Enter the surname of the person:");
            surname = new Scanner(System.in).next();
        }

        @Override
        public void setSurname(String surname) {
            this.surname = surname;
        }

        @Override
        public String toString() {
            return name + " " + surname;
        }
    }*/

/*import java.io.CharArrayWriter;
import java.io.IOException;
import java.util.Arrays;


class Converter {
    public static char[] convert(String[] words) throws IOException {

        try (CharArrayWriter convert = new CharArrayWriter()) {
            convert.write(Arrays.toString(words));

            char[] array = Arrays.toString(words).toCharArray();

            return array;
        }
    }
}*/