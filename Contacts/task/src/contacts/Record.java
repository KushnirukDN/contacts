package contacts;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Scanner;

abstract class Record implements Serializable {
    String name;
    String phoneNumber;
    LocalDateTime created;
    LocalDateTime lastEdit;

   // public abstract void edit(String fieldName, String newValue);

    public void setName(String name) {
        this.name = name;
    }
    public void setSurname(String surname) {
    }
    public void setBirthDate(String birthDate) {
    }
    public void setGender(String gender) {
    }
    public void setCreated(){
        this.created = LocalDateTime.now().withNano(0);
    }
    public void setLastEdit(){
        this.lastEdit = LocalDateTime.now().withNano(0);;
    }
    public void setAddress(String address) {
    }

    public void setPhoneNumber(String phoneNumber) {
        if (!checkNumber(phoneNumber)) {
            this.phoneNumber = "[no number]";
            System.out.println("Wrong number format!");
        } else {
            this.phoneNumber = phoneNumber;
        }
    }

    private boolean checkNumber(String phoneNumber) {
        String regex = "^\\+?(\\w{1,4})?([- ]\\(\\w{2,4}\\)[- ]\\w{2,4}|[- ]\\w{2,4}|[- ]\\(\\w{2,4}\\)|\\(\\w{1,}\\)|[- ]\\w{2,4}[- ]\\(\\w{2,4}\\)|)?([- ]\\w{2,4})?([- ]\\w{2,5})?";
        if (phoneNumber.matches(regex)) {
            return true;
        } else {
            return false;
        }
    }

    public String getInfo() {
        return null;
    }

    @Override
    public String toString() {
        return null;
    }
}

class Person extends Record {
    String surname;
    String birthDate;
    String gender;

    public Person() {
        System.out.print("Enter the name of the person: ");
        name = new Scanner(System.in).next();
        System.out.print("Enter the surname of the person: ");
        surname = new Scanner(System.in).next();
        System.out.print("Enter the birth date: ");
        birthDate = new Scanner(System.in).nextLine();
        setBirthDate(birthDate);
        System.out.print("Enter the gender (M, F): ");
        gender = new Scanner(System.in).nextLine();
        setGender(gender);
        System.out.print("Enter the number: ");
        phoneNumber = new Scanner(System.in).nextLine();
        setPhoneNumber(phoneNumber);
        setCreated();
        setLastEdit();
    }

    @Override
    public void setGender(String gender) {
        if (gender.equals("F") || gender.equals("M")) {
            this.gender = gender;
        } else {
            this.gender = "[no data]";
            System.out.println("Bad gender!");
        }
    }

    public void setBirthDate(String birthDate){
        String regex = "^\\d{4}-\\d{2}-\\d{2}$";
        if (birthDate.matches(regex)) {
            this.birthDate = birthDate;
        } else {
            this.birthDate = "[no data]";
            System.out.println("Bad birth date!");
        }
    }

    @Override
    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public String toString() {
        return name + " " + surname;
    }

    @Override
    public String getInfo() {
        return "Name: " + name + "\n" +
                "Surname: " + surname + "\n" +
                "Birth date: " + birthDate + "\n" +
                "Gender: " + gender + "\n" +
                "Number: "+ phoneNumber + "\n" +
                "Time created: " + created + "\n" +
                "Time last edit: " + lastEdit+ "\n";
    }
}

class Organization extends Record {
    String address;

    public Organization() {
        System.out.print("Enter the name of the organization: ");
        name = new Scanner(System.in).nextLine();
        System.out.print("Enter the address ");
        address = new Scanner(System.in).nextLine();
        System.out.print("Enter the number: ");
        phoneNumber = new Scanner(System.in).nextLine();
        setPhoneNumber(phoneNumber);
        setCreated();
        setLastEdit();
    }

    public void setAddress(String address) {
        this.address = address;
    }
    @Override
    public String toString() {
        return name;
    }

    @Override
    public String getInfo() {
        return "Organization name: " + name + "\n" +
                "Address: "+ address + "\n" +
                "Number: "+ phoneNumber + "\n" +
                "Time created: " + created + "\n" +
                "Time last edit: " + lastEdit + "\n";
    }
}