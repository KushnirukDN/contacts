package contacts;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        System.out.println("open phonebook.db\n");
        Actions phoneBook = new Actions();
        phoneBook.menu();
    }
}





