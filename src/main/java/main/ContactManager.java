package main;

import java.util.Scanner;

public class ContactManager {

    public static int showMainMenu() {
        Scanner input = new Scanner(System.in);
        System.out.println("1. View contacts.");
        System.out.println("2. Add a new contact.");
        System.out.println("3. Search a contact by name.");
        System.out.println("4. Delete an existing contact.");
        System.out.println("5. Exit.");
        System.out.print("Enter an option (1, 2, 3, 4 or 5): ");
        int menueChoice = input.nextInt();
        return menueChoice;
    }

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


    public static void main(String[] args) {

        int UserMenueChoice = showMainMenu();


        private static String getCategoryName(int userMenueChoice) {
            switch (userMenueChoice) {
                case 1:
                    return "Produce";
                case 2:
                    return "Dairy";
                case 3:
                    return "Meat";
                case 4:
                    return "Bakery";
                case 5:
                    return "Canned Goods";
                case 6:
                    return "Frozen Foods";
                default:
                    return "Unknown";
            }
        }

    }
}




