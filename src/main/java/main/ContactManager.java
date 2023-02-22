package main;

import java.util.ArrayList;
import java.util.Scanner;

public class ContactManager {

    private static Contact [] contacts;

    public static int showMainMenu() {
        Scanner input = new Scanner(System.in);
        System.out.println("1. View contacts.");
        System.out.println("2. Add a new contact.");
        System.out.println("3. Search a contact by name.");
        System.out.println("4. Delete an existing contact.");
        System.out.println("5. Exit.");
        System.out.print("Enter an option (1, 2, 3, 4 or 5): ");
        int menuChoice = input.nextInt();
        return menuChoice;
    }

    //
//
    public static Contact addContact() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter phone number: ");
        String phoneNumber = scanner.nextLine();
        System.out.println("Contact added.");
        return Contact.add(new Contact(name, phoneNumber));
    }
    private static ArrayList<String> contactList = new ArrayList<String>();

    public static void getCategoryName(int userMenuChoice) {
        switch (userMenuChoice) {
            case 1:
                System.out.println("not done yet");;
                break;
            case 2:
                addContact();
                break;
            default:
                System.out.println("That wasnt a proper input");;
                break;
        }
    }


    public static void main(String[] args) {
        String nameTitle = "Name";
        String numberTitle = "Phone Number";

        int userMenuChoice = showMainMenu();
        getCategoryName(userMenuChoice);


        System.out.printf("""
                | %-14s| %-14s|
                 --------------- ---------------
                | %-14s| %-14s|
                """, nameTitle, numberTitle, Contact.contactName,Contact.contactNumber);

        viewAllContacts(contactList); {
            for (Contact contact : contacts) {
//                System.out.println(contact);
//                System.out.printf("""
//                | %-14s| %-14s|
//                 --------------- ---------------
//                | %-14s| %-14s|
//                """, nameTitle, numberTitle, Contact.contactName, Contact.contactNumber);
            }
//            System.out.println();
        }

    }

    private static void viewAllContacts(ArrayList<String> contactList) {
    }
}




