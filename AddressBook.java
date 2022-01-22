package AddressBook;

import java.util.*;
import java.util.ArrayList;

public class AddressBook {
    ArrayList<Person> list = new ArrayList();
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welcome to address book ");
        AddressBook addressBook = new AddressBook();
        System.out.println("Enter details to create contact in address book:");
        addressBook.createContact();
        addressBook.editContact();
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

    public void editContact() {
        System.out.println("Enter Name for Edit");
        String editName = this.scanner.next();

        for (int i = 0; i < this.list.size(); ++i) {
            if (((Person) this.list.get(i)).getFirstName().equals(editName)) {
                System.out.println("Select Options");
                System.out.println("1: First Name\n 2:Last Name\n 3:Address\n 4:City Name\n 5:State Name\n 6: Zip Code\n 7:Phone Number\n 8:Email Address");
                int option = this.scanner.nextInt();
                switch (option) {
                    case 1:
                        System.out.println("Enter first name");
                        ((Person) this.list.get(i)).setFirstName(this.scanner.next());
                        break;
                    case 2:
                        System.out.println("Enter last name");
                        ((Person) this.list.get(i)).setLastName(this.scanner.next());
                        break;
                    case 3:
                        System.out.println("Enter address");
                        ((Person) this.list.get(i)).setAddress(this.scanner.next());
                        break;
                    case 4:
                        System.out.println("Enter city");
                        ((Person) this.list.get(i)).setCity(this.scanner.next());
                        break;
                    case 5:
                        System.out.println("Enter state");
                        ((Person) this.list.get(i)).setState(this.scanner.next());
                        break;
                    case 6:
                        System.out.println("Enter Zip Code");
                        ((Person) this.list.get(i)).setZip(this.scanner.nextInt());
                        break;
                    case 7:
                        System.out.println("Enter Phone Number");
                        ((Person) this.list.get(i)).setPhoneNumber(this.scanner.nextLong());
                        break;
                    case 8:
                        System.out.println("Enter Email Address");
                        ((Person) this.list.get(i)).setEmailAddress(this.scanner.nextLine());
                        break;
                    default:
                        System.out.println("Enter valid name");
                }
            }
            System.out.println("Edited list is ");
            System.out.println(this.list);
        }
    }

    public void deleteContact() {
        System.out.println("confirm the name to delete contact");
        String confirmName = this.scanner.next();
        if (((Person) this.list.get(0)).getFirstName().equals(confirmName)) {
        }
        this.list.remove(0);
        System.out.println(this.list);
    }
}