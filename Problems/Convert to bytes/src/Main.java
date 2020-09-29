import java.io.*;
import java.util.ArrayList;

class Employee implements Serializable {

    String id;
    String firstName;
    String lastName;

    //Getters and setters

    public Employee(String id, String firstName, String lastName) {
        super();
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + "]";
    }
}

class Main {
    public static void main(String[] args) throws Exception {
        ArrayList<Employee> employees = new ArrayList<>();

        employees.add(new Employee("1", "lokesh", "gupta"));
        employees.add(new Employee("2", "brian", "motto"));

        try {
            FileOutputStream fos = new FileOutputStream("/Users/dmytro/Desktop/employeeData");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(employees);
            oos.close();
            fos.close();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}

class ArrayListExample {
    public static void main(String[] args) throws Exception {
        ArrayList<Employee> employees = new ArrayList<>();

        try {
            FileInputStream fis = new FileInputStream("/Users/dmytro/Desktop/employeeData");
            ObjectInputStream ois = new ObjectInputStream(fis);

            employees = (ArrayList) ois.readObject();

            ois.close();
            fis.close();
        } catch (IOException ioe) {
            ioe.printStackTrace();
            return;
        } catch (ClassNotFoundException c) {
            System.out.println("Class not found");
            c.printStackTrace();
            return;
        }

        //Verify list data
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}