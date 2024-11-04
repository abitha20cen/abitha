package LMS;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        for (Book b : books) {
            if (b.getId().equals(book.getId())) {
                System.out.println("Book with this ID already exists.");
                return;
            }
        }
        books.add(book);
        System.out.println("Book added successfully!");
    }

    public void displayBooks() {
        if (books.isEmpty()) {
            System.out.println("No books available in the library.");
        } else {
            for (Book book : books) {
                System.out.println(book);
            }
        }
    }

    public void issueBook(String id) {
        for (Book book : books) {
            if (book.getId().equals(id) && book.isAvailable()) {
                book.setAvailable(false);
                System.out.println("Book issued successfully!");
                return;
            }
        }
        System.out.println("Book is either not available or does not exist.");
    }

    public void returnBook(String id) {
        for (Book book : books) {
            if (book.getId().equals(id) && !book.isAvailable()) {
                book.setAvailable(true);
                System.out.println("Book returned successfully!");
                return;
            }
        }
        System.out.println("This book was not issued.");
    }

    // Additional methods for searching can be added here
}
