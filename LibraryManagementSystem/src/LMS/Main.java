package LMS;

import java.util.Scanner; // Import the Scanner class

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);

        // Sample books
        library.addBook(new Book("1", "Core and Advanced Java", " Dr. R. Nageswara Rao"));
        library.addBook(new Book("2", "Head First Java", "Kathy Sierra, Bert Bates"));
        library.addBook(new Book("3", "Effective Java", "Joshua Bloch"));
        library.addBook(new Book("4", "Thinking in Java ", "Bruce Eckel"));

        while (true) {
            System.out.println("\nLibrary Management System");
            System.out.println("1. Display Books");
            System.out.println("2. Issue Book");
            System.out.println("3. Return Book");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    library.displayBooks();
                    break;
                case 2:
                    System.out.print("Enter Book ID to issue: ");
                    String issueId = scanner.nextLine();
                    library.issueBook(issueId);
                    break;
                case 3:
                    System.out.print("Enter Book ID to return: ");
                    String returnId = scanner.nextLine();
                    library.returnBook(returnId);
                    break;
                case 4:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
