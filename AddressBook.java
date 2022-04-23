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
        System.out.println("Enter number of persons to add in adressbook");
        Scanner scan1 = new Scanner(System.in);


        int number = 1;
        for (int i = 0; i < 4; i++) {
            while (number == 1) {
                System.out.println("1.Add Contact" + "2.Edit Contact" + "3.Delete Contact" + "4. Exit");
                Scanner sc = new Scanner(System.in);
                int choice = sc.nextInt();
                if (choice == 1) {
                    addressBook.createContact();
                } else if (choice == 2) {
                    addressBook.editContact();
                } else if (choice == 3) {
                    addressBook.deleteContact();
                } else if (choice == 4) {
                    number = 2;
                    break;
                } else {
                    System.out.println("Enter Valid Option");
                }
            }
        }
    }

    public void createContact() {
        Person details = new Person();
        System.out.println("Enter your first name: ");
        details.setFirstName(scanner.nextLine());
        System.out.println("Enter your last name: ");
        details.setLastName(scanner.nextLine());
        System.out.println("Enter your address : ");
        details.setAddress(scanner.nextLine());
        System.out.println("Enter your city name: ");
        details.setCity(scanner.nextLine());
        System.out.println("Enter your state name: ");
        details.setState(scanner.nextLine());
        System.out.println("Enter your zip code: ");
        details.setZip(scanner.nextInt());
        System.out.println("Enter your phone number: ");
        details.setPhoneNumber(scanner.nextLong());
        System.out.println("Enter your email address : ");
        details.setEmailAddress(scanner.nextLine());
        list.add(details);
        showAllContact();
    }
    public void showAllContact() {
        if (list.isEmpty()) {
            System.out.println("---> PhoneBook is empty:");
        } else {
            for (Person person : list) {
                System.out.println(person);
            }
        }
    }


    public void editContact() {
        System.out.println("Enter Name for Edit");
        String editName = this.scanner.nextLine();

        for (int i = 0; i < this.list.size(); ++i) {
            System.out.println("hello");
            if ((list.get(i)).getFirstName().equals(editName)) {
                System.out.println("Select Options");
                System.out.println("1: First Name\n 2:Last Name\n 3:Address\n 4:City Name\n 5:State Name\n 6: Zip Code\n 7:Phone Number\n 8:Email Address");
                int option = this.scanner.nextInt();
                switch (option) {
                    case 1:
                        System.out.println("Enter first name");
                        list.get(i).setFirstName(this.scanner.nextLine());
                        break;
                    case 2:
                        System.out.println("Enter last name");
                        list.get(i).setLastName(this.scanner.nextLine());
                        break;
                    case 3:
                        System.out.println("Enter address");
                        list.get(i).setAddress(this.scanner.nextLine());
                        break;
                    case 4:
                        System.out.println("Enter city");
                        list.get(i).setCity(this.scanner.nextLine());
                        break;
                    case 5:
                        System.out.println("Enter state");
                        list.get(i).setState(this.scanner.nextLine());
                        break;
                    case 6:
                        System.out.println("Enter Zip Code");
                        list.get(i).setZip(this.scanner.nextInt());
                        break;
                    case 7:
                        System.out.println("Enter Phone Number");
                        list.get(i).setPhoneNumber(this.scanner.nextLong());
                        break;
                    case 8:
                        System.out.println("Enter Email Address");
                        list.get(i).setEmailAddress(this.scanner.nextLine());
                        break;
                    default:
                        System.out.println("Enter valid name");
                }
            }
        }
        System.out.println("Edited list is ");
        showAllContact();
    }

    public void deleteContact() {
        System.out.println("confirm the name to delete contact");
        String confirmName = this.scanner.nextLine();
        if (list.get(0).getFirstName().equals(confirmName)) {
        }
        this.list.remove(0);
        showAllContact();
    }
}