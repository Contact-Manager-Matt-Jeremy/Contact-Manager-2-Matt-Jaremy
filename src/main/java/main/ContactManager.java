package main;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class ContactManager {

    public static void showMainMenu() {
        System.out.println("1. View contacts.");
        System.out.println("2. Add a new contact.");
        System.out.println("3. Search a contact by name.");
        System.out.println("4. Delete an existing contact.");
        System.out.println("5. Exit.");
        System.out.print("Enter an option (1, 2, 3, 4 or 5): ");
    }

    public static ArrayList<Contact> loadContacts() {
        ArrayList<Contact> contacts = new ArrayList<>();
        try {
            Path path =  Paths.get("Contacts.txt");
            File file  = path.toFile();
            if (file.exists()) {
                Scanner scanner = new Scanner(file);
                while (scanner.hasNextLine()) {
                    String line = scanner.nextLine();
                    String[] parts = line.split(",");
                    contacts.add(new Contact(parts[0], parts[1]));
                }
                scanner.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return contacts;
    }

    public static void addContact(ArrayList<Contact> contacts) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter phone number: ");
        String phoneNumber = scanner.nextLine();
        System.out.println("Contact added.");
        Contact aNewContact = Contact.add(new Contact(name, phoneNumber));
        contacts.add(aNewContact);
        System.out.println(contacts);
    }

    public static void searchContact(ArrayList<Contact> contacts) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the contact name: ");
        String name = scanner.nextLine();
        for (Contact contact : contacts) {
            if (contact.contactName.contains(name)) {
                System.out.println(contact.contactName + " | " + contact.contactNumber);
            }
        }
    }

    public static void deleteContact(ArrayList<Contact> contacts) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the contact name to delete: ");
        String name = scanner.nextLine();
        System.out.println(contacts);

        for (int i = 0; i < contacts.size(); i++) {
            if (contacts.get(i).contactName.contains(name)) {
                System.out.println("deleting: " + contacts.get(i).contactName);
                contacts.remove(contacts.get(i));
            }
        }
        System.out.println(contacts);
    }

    public static void saveContacts(ArrayList<Contact> contacts) {
        try {
            FileWriter writer = new FileWriter("Contacts.txt");
            for (Contact contact : contacts) {
                writer.write(contact.contactName + "," + contact.contactNumber + "\n");
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }









    public static void main(String[] args) {
        ArrayList<Contact> contacts = loadContacts();
        Scanner scanner = new Scanner(System.in);
        String choice;
        do {
            showMainMenu();
            choice = scanner.nextLine();
            System.out.println(choice);
            switch (choice) {
                case "1":
                    System.out.println(" ");
                    System.out.println(loadContacts());
                    System.out.println(" ");
                    break;
                case "2":
                    System.out.println(" ");
                    addContact(contacts);
                    saveContacts(contacts);
                    System.out.println(" ");
                    break;
                case "3":
                    System.out.println(" ");
                    searchContact(contacts);
                    System.out.println(" ");
                    break;
                case "4":
                    System.out.println(" ");
                    deleteContact(contacts);
                    saveContacts(contacts);
                    System.out.println(" ");
                    break;
                case "5":
                    System.out.println(" ");
                    System.out.println("Goodbye...");
                    System.out.println(" ");
                    break;
                default:
                    System.out.println(" ");
                    System.out.println("Invalid choice, please try again.");
                    System.out.println(" ");
            }
        } while (!choice.equals("5"));
           saveContacts(contacts);
    }
}