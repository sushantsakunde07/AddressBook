package AddressBook;

import java.util.ArrayList;

import java.util.*;

public class AddressBook {
    ArrayList<Person> list = new ArrayList<Person>();
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Welcome to address book ");
        AddressBook addressBook = new AddressBook();
        System.out.println("Enter details to create contact in address book:");
        addressBook.createContact();
    }

    public void createContact() {
        Person details = new Person();
        System.out.println("Enter your first name: ");
        String firstName = scanner.nextLine();
        System.out.println("Enter your last name: ");
        String lastName = scanner.nextLine();
        System.out.println("Enter your address : ");
        String address = scanner.nextLine();
        System.out.println("Enter your city name: ");
        String city = scanner.nextLine();
        System.out.println("Enter your state name: ");
        String state = scanner.nextLine();
        System.out.println("Enter your zip code: ");
        int zipcode = scanner.nextInt();
        System.out.println("Enter your phone number: ");
        long phoneNumber = scanner.nextLong();
        System.out.println("Enter your email address : ");
        String emailAddress = scanner.next();
        list.add(details);
        System.out.println(list);
    }
}