package Controller;

import java.util.Scanner;

public class Default {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Operations operations = new Operations(); 
        
        while (true) { 
            System.out.println("Choose the operation you have to perform for the contact:");
            System.out.println("**********************************************************");
            System.out.println("1. Add");
            System.out.println("2. Search");
            System.out.println("3. Edit");
            System.out.println("4. Delete");
            System.out.println("5. All Contacts");
            System.out.println("6. Exit");
            System.out.println("**********************************************************");
            System.out.print("Enter choice: ");
            
            int num = sc.nextInt();
            sc.nextLine(); 

            switch (num) {
                case 1:
                    System.out.println("****************************** Adding a Contact ******************************");
                    System.out.print("Input the contact name: ");
                    String name = sc.nextLine();
                    System.out.print("Input the phone number: ");
                    long phonenum = sc.nextLong();
                    sc.nextLine(); // Fix for Scanner issue
                    System.out.print("Input the email (optional, press Enter to skip): ");
                    String email = sc.nextLine();
                    
                    
                    operations.addContacts(name, phonenum, email);
                    break;
                    
                case 2:
                    System.out.println("****************************** Searching a Contact ******************************");
                    System.out.print("Enter full contact name or starting letter: ");
                    String searchKey = sc.nextLine();
                    
                    // If user enters only 1 letter, use starting letter search
                    if (searchKey.length() == 1) {
                        operations.searchContactsByStartingLetter(searchKey);
                    } else {
                        operations.searchContacts(searchKey);
                    }
                    break;
                case 3:
                    System.out.println("****************************** Editing a Contact ******************************");
                    System.out.print("Enter the contact name you want to edit: ");
                    String editName = sc.nextLine();
                    operations.editContact(editName);
                    break;

                case 4:
                    System.out.println("****************************** Deleting a Contact ******************************");
                    System.out.print("Enter the contact name you want to delete: ");
                    String deleteName = sc.nextLine();
                    operations.deleteContact(deleteName);
                    break;
                    
                case 5:
                    System.out.println("****************************** Viewing All Contacts ******************************");
                    operations.viewContacts();
                    break;
                    
                case 6:
                    System.out.println("****************************** Exiting ******************************");
                    operations.exit();
                    break;
                    
                default:
                    System.out.println("Invalid choice! Please enter a valid option (1-6).");
            }
        }
    }
}
