import java.util.Scanner;

class Contact {
    String name;
    String phoneNumber;
    String email;
    Contact next;

    public Contact(String name, String phoneNumber, String email) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.next = null;
    }
}

public class ContactBook {
    private Contact head;

    public ContactBook() {
        head = null;
    }

    public void addContact(String name, String phoneNumber, String email) {
        Contact newContact = new Contact(name, phoneNumber, email);
        if (head == null) {
            head = newContact;
        } else {
            Contact temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newContact;
        }
    }

    public void printContacts() {
        Contact temp = head;
        if (temp == null) {
            System.out.println("Contact list is empty.");
            return;
        }
        System.out.println("Contact List:");
        while (temp != null) {
            System.out.println("Name: " + temp.name + ", Phone: " + temp.phoneNumber + ", Email: " + temp.email);
            temp = temp.next;
        }
    }

    public void deleteContact(String name) {
        if (head == null) {
            System.out.println("Contact list is empty.");
            return;
        }
        if (head.name.equals(name)) {
            head = head.next;
            return;
        }
        Contact prev = null;
        Contact current = head;
        while (current != null && !current.name.equals(name)) {
            prev = current;
            current = current.next;
        }
        if (current == null) {
            System.out.println("Contact not found.");
            return;
        }
        prev.next = current.next;
    }

    public Contact searchContactByName(String name) {
        Contact temp = head;
        while (temp != null) {
            if (temp.name.equalsIgnoreCase(name)) {
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }

    public Contact searchContactByEmail(String email) {
        Contact temp = head;
        while (temp != null) {
            if (temp.email.toLowerCase().contains(email.toLowerCase())) {
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ContactBook contactBook = new ContactBook();

        char choice;
        do {
            System.out.println("**************************************");
            System.out.println("(A)dd");
            System.out.println("(D)elete");
            System.out.println("(E)mail Search");
            System.out.println("(P)rint List");
            System.out.println("(S)earch");
            System.out.println("(Q)uit");
            System.out.println("**************************************");
            System.out.print("Please Enter a command: ");
            choice = scanner.next().toUpperCase().charAt(0);
            scanner.nextLine();  // Consume newline character

            switch (choice) {
                case 'A':
                    System.out.print("Enter name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter phone number: ");
                    String phoneNumber = scanner.nextLine();
                    System.out.print("Enter email: ");
                    String email = scanner.nextLine();
                    contactBook.addContact(name, phoneNumber, email);
                    break;
                case 'D':
                    System.out.print("Enter name to delete: ");
                    String deleteName = scanner.nextLine();
                    contactBook.deleteContact(deleteName);
                    break;
                case 'E':
                    System.out.print("Enter email to search: ");
                    String searchEmail = scanner.nextLine();
                    Contact foundByEmail = contactBook.searchContactByEmail(searchEmail);
                    if (foundByEmail != null) {
                        System.out.println("Contact Found: Name: " + foundByEmail.name +
                                ", Phone: " + foundByEmail.phoneNumber + ", Email: " + foundByEmail.email);
                    } else {
                        System.out.println("Contact not found.");
                    }
                    break;
                case 'P':
                    contactBook.printContacts();
                    break;
                case 'S':
                    System.out.print("Enter name to search: ");
                    String searchName = scanner.nextLine();
                    Contact foundByName = contactBook.searchContactByName(searchName);
                    if (foundByName != null) {
                        System.out.println("Contact Found: Name: " + foundByName.name +
                                ", Phone: " + foundByName.phoneNumber + ", Email: " + foundByName.email);
                    } else {
                        System.out.println("Contact not found.");
                    }
                    break;
                case 'Q':
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid command.");
            }
        } while (choice != 'Q');
        scanner.close();
    }
}
