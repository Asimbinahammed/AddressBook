package bridgelabz;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class AddressBook {

    Scanner scanner = new Scanner(System.in);
    ArrayList<PersonInfo> contact;

    // declaring array list
    public AddressBook() {
        contact = new ArrayList<PersonInfo>();
    }

    public static void main(String[] args) {

        //declared new hash map for multiple address book storing
        HashMap<String, AddressBook> addressBook = new HashMap<String, AddressBook>();

        System.out.println("Welcome to Address Book");
        @SuppressWarnings("resource")
        Scanner input = new Scanner(System.in);
        String firstName, lastName;

        AddressBook address = new AddressBook();

        while (true) {
            System.out.println("Enter name of Address Book");
            String addressBookName = input.next();

            addressBook.put(addressBookName, address);

            System.out.println("Select an action..");
            System.out.println("1. Add a person");
            System.out.println("2. Edit information");
            System.out.println("3. Delete a person");
            System.out.println("4. Quit");

            int choice = input.nextInt();
            switch (choice) {
                case 1:
                    addressBook.get(addressBookName).addPerson();
                    System.out.println("\n");
                    break;
                case 2:
                    System.out.print("Enter first name and last name of the person to edit the contact: ");
                    firstName = input.next();
                    lastName = input.next();
                    addressBook.get(addressBookName).editPerson(firstName, lastName);
                    System.out.println("\n");
                    break;
                case 3:
                    System.out.print("Enter first and last name of the person to delete the contact: ");
                    firstName = input.next();
                    lastName = input.next();
                    addressBook.get(addressBookName).deletePerson(firstName, lastName);
                    System.out.println("\n");
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Enter a valid option");
                    break;
            }
        }

    }

    // add new person
    public void addPerson() {
        System.out.print("Enter first name: ");
        String firstName = scanner.next();
        System.out.println("Enter the Last name: ");
        String lastName = scanner.next();
        System.out.print("Enter complete address: ");
        String address = scanner.next();
        System.out.print("Enter city: ");
        String city = scanner.next();
        System.out.println("Enter state: ");
        String state = scanner.next();
        System.out.println("Enter ZIP: ");
        String zip = scanner.next();
        System.out.println("Enter phone number: ");
        String phoneNumber = scanner.next();
        System.out.println("Enter email id: ");
        String email = scanner.next();

        //construct new person object
        PersonInfo person = new PersonInfo(firstName, lastName, address, city, state, zip, phoneNumber, email);
        System.out.println(person);

        //add PersonInfo object to arraylist
        contact.add(person);
        System.out.println("Contact added successfully\n");
    }

    // edit person details
    public void editPerson(String firstName, String lastName) {
        for (int i = 0; i <= contact.size(); i++) {
            PersonInfo person = contact.get(i);
            if (firstName.equals(person.getFirstName()) && lastName.equals(person.getLastName())) {
                System.out.print("Enter address: ");
                String address = scanner.next();
                System.out.print("Enter city: ");
                String city = scanner.next();
                System.out.println("Enter state: ");
                String state = scanner.next();
                System.out.println("Enter ZIP: ");
                String zip = scanner.next();
                System.out.println("Enter phone number: ");
                String phoneNumber = scanner.next();
                System.out.println("Enter email id: ");
                String email = scanner.next();

                person = new PersonInfo(person.getFirstName(), person.getLastName(), address, city, state, zip,
                        phoneNumber, email);
                System.out.println(person);
                System.out.println("Contact updated successfully\n");
                contact.add(person);
                contact.remove(i);
                break;
            } else {
                System.out.println(person);
                System.out.println("firstname and lastname didnt match");
            }

        }
    }

    // delete person
    public void deletePerson(String firstName, String lastName) {
        for (int i = 0; i <= contact.size(); i++) {
            PersonInfo person = contact.get(i);
            if (firstName.equals(person.getFirstName()) && lastName.equals(person.getLastName())) {
                person = null;
                System.out.println(person);
                System.out.println("Contact Deleted successfully\n");
                contact.remove(i);
            } else {
                System.out.println(person);
                System.out.println("firstname and lastname didnt match");
            }

        }
    }
}