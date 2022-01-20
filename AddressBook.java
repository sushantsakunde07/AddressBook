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
        details.setFirstName(scanner.nextLine());
        System.out.println("Enter your last name: ");
        details.setLastName(scanner.next());
        System.out.println("Enter your address : ");
        details.setAddress(scanner.next());
        System.out.println("Enter your city name: ");
        details.setCity(scanner.next());
        System.out.println("Enter your state name: ");
        details.setState(scanner.next());
        System.out.println("Enter your zip code: ");
        details.setZip(scanner.nextInt());
        System.out.println("Enter your phone number: ");
        details.setPhoneNumber(scanner.nextLong());
        System.out.println("Enter your email address : ");
        details.setEmailAddress(scanner.next());
        list.add(details);
        System.out.println(list);
    }
}
