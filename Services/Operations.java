package Services;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Operations {
    private Database database = new Database();

 // Operation 5: View All Contacts (Sorted)
    public void viewContacts() {
        List<Contact> contactList = database.getContacts();
        if (contactList.isEmpty()) {
            System.out.println("No records found, Contacts is empty!");
            System.out.println("***************************************************");
            return;
        }

        Collections.sort(contactList); // Sorts by name (because Contact implements Comparable)

        for (Contact contact : contactList) {
            System.out.println("Name: " + contact.getName());
            System.out.println("Phone: " + contact.getPhoneNumber());
            System.out.println("Email: " + contact.getEmail());
            System.out.println("------------------------------------------");
        }
        System.out.println("***************************************************");
    }

    // Operation 1: Add a contact
    public void addContacts(String name, long phoneNum, String email) {
        Contact newContact = new Contact(name, phoneNum, email);
        database.getContacts().add(newContact);
        System.out.println("Contact added successfully!!!");
        System.out.println("***************************************************");
    }

    // Operation 2: Search by exact name
    public void searchContacts(String key) {
        List<Contact> contactList = database.getContacts();
        boolean found = false;
        
        for (Contact contact : contactList) {
            if (contact.getName().equalsIgnoreCase(key)) {
                System.out.println("Contact Found!");
                System.out.println("Name: " + contact.getName());
                System.out.println("Phone: " + contact.getPhoneNumber());
                System.out.println("Email: " + contact.getEmail());
                System.out.println("***************************************************");
                found = true;
                break;
            }
        }
        
        if (!found) {
            System.out.println("Contact was not found!");
            System.out.println("***************************************************");
        }
    }

    // New Feature: Search contacts by starting letter
    public void searchContactsByStartingLetter(String letter) {
        List<Contact> contactList = database.getContacts();
        boolean found = false;
        
        for (Contact contact : contactList) {
            if (contact.getName().toLowerCase().startsWith(letter.toLowerCase())) {
                System.out.println("Name: " + contact.getName());
                System.out.println("Phone: " + contact.getPhoneNumber());
                System.out.println("Email: " + contact.getEmail());
                System.out.println("***************************************************");
                found = true;
            }
        }
        
        if (!found) {
            System.out.println("No contacts found starting with '" + letter + "'");
            System.out.println("***************************************************");
        }
    }

    // Operation 6: Exit application
    public void exit() {
        System.out.println("Exiting the application... Goodbye!");
        System.out.println("***************************************************");
        System.exit(0); // Terminates the program
    }
    
    //operation 3: update value of contact 
 // Operation 3: Edit Contact
    public void editContact(String name) {
        List<Contact> contactList = database.getContacts();
        boolean found = false;

        for (Contact contact : contactList) {
            if (contact.getName().equalsIgnoreCase(name)) {
                found = true;
                Scanner sc = new Scanner(System.in);

                System.out.println("Contact found! What do you want to edit?");
                System.out.println("1. Name");
                System.out.println("2. Phone Number");
                System.out.println("3. Email");
                System.out.print("Enter choice: ");
                int choice = sc.nextInt();
                sc.nextLine(); 

                switch (choice) {
                    case 1:
                        System.out.print("Enter new name: ");
                        String newName = sc.nextLine();
                        contact.setName(newName);
                        System.out.println("Name updated successfully!");
                        break;

                    case 2:
                        System.out.print("Enter new phone number: ");
                        long newPhone = sc.nextLong();
                        contact.setPhoneNumber(newPhone);
                        System.out.println("Phone number updated successfully!");
                        break;

                    case 3:
                        System.out.print("Enter new email: ");
                        String newEmail = sc.nextLine();
                        contact.setEmail(newEmail);
                        System.out.println("Email updated successfully!");
                        break;

                    default:
                        System.out.println("Invalid choice!");
                }
                System.out.println("***************************************************");
                break; 
            }
        }

        if (!found) {
            System.out.println("Contact not found!");
            System.out.println("***************************************************");
        }
    }
    
    //operation 4: delete contact
 // Operation 4: Delete Contact
    public void deleteContact(String name) {
        List<Contact> contactList = database.getContacts();
        boolean found = false;

        for (int i = 0; i < contactList.size(); i++) {
            Contact contact = contactList.get(i);
            if (contact.getName().equalsIgnoreCase(name)) {
                contactList.remove(i);
                System.out.println("Contact deleted successfully!");
                System.out.println("***************************************************");
                found = true;
                break; // Important: break after deleting
            }
        }

        if (!found) {
            System.out.println("Contact not found, cannot delete!");
            System.out.println("***************************************************");
        }
    }


}
