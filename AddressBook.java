package AddressBook;

import java.util.*;

public class AddressBook {
    public static void main(String[] args) {
        System.out.println("Welcome to address book ");
        AddressBook addressBook = new AddressBook();
        System.out.println("Enter details to create contact in address book: ");
        addressBook.createContact();
    }

    public void createContact() {

        Scanner scanner = new Scanner(System.in);
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
    }
}
