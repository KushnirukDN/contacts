package contacts;

import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

public class Actions implements Serializable {
    ArrayList<Record> phoneBook;

    public void menu() throws IOException, ClassNotFoundException {
        File file = new File("/Users/dmytro/Desktop/phonebook");
        if (file.length() != 0) {
        phoneBook = ReadAndWrite.deserialize();
        } else {
            phoneBook = new ArrayList<>();
        }
        String command;
        do {
            System.out.print("[menu] Enter action (add, list, search, count, exit): ");
            command = new Scanner(System.in).next().toLowerCase();
            if (command.equals("add")) {
                add();
                ReadAndWrite.serialize(phoneBook);
            } else if (command.equals("count")) {
                count();
                ReadAndWrite.serialize(phoneBook);
            } else if (command.equals("list")) {
                list();
                ReadAndWrite.serialize(phoneBook);
            } else if (command.equals("search")) {
                search(phoneBook);
                ReadAndWrite.serialize(phoneBook);
            } else if (command.equals("exit")) {
                file.delete();
            }
        } while(!command.equals("exit"));
    }


    public void add () throws IOException {
        System.out.print("Enter the type (person, organization): ");
        String type = new Scanner(System.in).next().toLowerCase();
        Record record;

        switch (type) {
            case "person":
                record = new Person();
                phoneBook.add(record);
                break;
                case "organization":
                    record = new Organization();
                    phoneBook.add(record);
                    break;
                    default:
                        break;
        }
        System.out.println("The record added.\n");
    }

    public void delete (int recordIndex) throws IOException {
            phoneBook.remove(recordIndex - 1);
            System.out.println("The record deleted!\n");
        }

    public void edit (int recordIndex) throws IOException {
            //todo: dao get by from file into abstract field
            //todo: call  edit method
           // Record record = dao.get();
           // record.edit("", "");

          //  if (record instanceof Organization) {

            //}
         //  boolean isPerson = phoneBook.get(recordIndex - 1).getClass() == Person.class;
            if (phoneBook.get(recordIndex - 1) instanceof Person) {
                System.out.print("Select a field (name, surname, birth date, gender, number): ");
                String element = new Scanner(System.in).nextLine().toLowerCase();
                if (element.equals("name")) {
                    System.out.print("Enter name: ");
                    phoneBook.get(recordIndex - 1).setName(new Scanner(System.in).next());
                } else if (element.equals("surname")) {
                    System.out.print("Enter surname: ");
                    phoneBook.get(recordIndex  - 1).setSurname(new Scanner(System.in).next());
                } else if (element.equals("number")) {
                    System.out.print("Enter number: ");
                    phoneBook.get(recordIndex  - 1).setPhoneNumber(new Scanner(System.in).nextLine());
                } else if (element.equals("gender")) {
                    System.out.print("Enter the gender (M, F): ");
                    phoneBook.get(recordIndex  - 1).setGender(new Scanner(System.in).nextLine());
                } else if (element.equals("birth date")) {
                    System.out.print("Enter the birth date: ");
                    phoneBook.get(recordIndex  - 1).setBirthDate(new Scanner(System.in).nextLine());
                }
            } else {
                System.out.print("Select a field (name, address, number): ");
                String element = new Scanner(System.in).next().toLowerCase();
                if (element.equals("name")) {
                    System.out.print("Enter name: ");
                    phoneBook.get(recordIndex  - 1).setName(new Scanner(System.in).nextLine());
                } else if (element.equals("address")) {
                    System.out.print("Enter address: ");
                    phoneBook.get(recordIndex  - 1).setAddress(new Scanner(System.in).nextLine());
                } else if (element.equals("number")) {
                    System.out.print("Enter number: ");
                    phoneBook.get(recordIndex  - 1).setPhoneNumber(new Scanner(System.in).nextLine());
                }
            }
            phoneBook.get(recordIndex - 1).setLastEdit();
            System.out.println("Saved");
            System.out.println(phoneBook.get(recordIndex - 1).getInfo());
            ReadAndWrite.serialize(phoneBook);
    }


    public void count () {
        if (phoneBook.size() != 0) {
            System.out.printf("The Phone Book has %s records.\n\n", phoneBook.size());
        } else {
            System.out.println("The Phone Book has 0 records.\n");
        }
    }
    public void list () throws IOException, ClassNotFoundException {
        for (int i = 0; i < phoneBook.size(); i++) {
            System.out.println((i + 1) + ". " + phoneBook.get(i));
        }
        System.out.println("");
        System.out.print("[list] Enter action ([number], back): ");
        String command = new Scanner(System.in).next().toLowerCase();
        if ("back".equals(command)) {
            menu();
        } else {
            int recordIndex = Integer.parseInt(command);
            System.out.println(phoneBook.get(recordIndex - 1).getInfo());
            record(recordIndex);
        }
    }
    public void record (int recordIndex) throws IOException, ClassNotFoundException {
        System.out.print("[record] Enter action (edit, delete, menu): ");
        String command = new Scanner(System.in).next().toLowerCase();
        switch (command) {
            case "edit":
                edit(recordIndex);
                break;
            case "delete":
                delete(recordIndex);
                break;
            case "menu":
               System.out.println("");
                break;
            default: record(recordIndex);
        }
    }

    public void search (ArrayList<Record> phoneBook) throws IOException, ClassNotFoundException {
        ArrayList<Integer> serchResultIndexOfRecord = new ArrayList<>();
        String command;
        System.out.print("Enter search query: ");
        String regexSearch = new Scanner(System.in).next().toLowerCase();

        for (int i = 0; i < phoneBook.size(); i++) {
            String recordSearch = phoneBook.get(i).getInfo().toLowerCase();
            System.out.println(recordSearch);
            if (recordSearch.contains(regexSearch)) {
                serchResultIndexOfRecord.add(i);
            }
        }

        System.out.printf("Found %s results:\n", serchResultIndexOfRecord.size());

        if (serchResultIndexOfRecord.size() == 0) {
            search(phoneBook);
        }

        for (int i = 0; i < serchResultIndexOfRecord.size(); i++) {
            System.out.println((i + 1) + ". " + phoneBook.get(serchResultIndexOfRecord.get(i)));
        }
        System.out.println("");
        System.out.print("[search] Enter action ([number], back, again): ");

        command = new Scanner(System.in).next().toLowerCase();
        if ("back".equals(command)) {
            menu();
        } else if ("again".equals(command)) {
            search(phoneBook);
        } else {
            int recordIndex = Integer.parseInt(command);
            System.out.println(phoneBook.get(serchResultIndexOfRecord.get(recordIndex - 1)).getInfo());
            record(serchResultIndexOfRecord.get(recordIndex - 1) + 1); // тут мы плюсуем к индексу единицу, потому что потом во всех методах она отнимается
        }
    }
}

