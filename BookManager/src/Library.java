/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author taing
 */
public class Library {

    private List<Book> catalog;

    public Library() {
        catalog = new ArrayList<>();
    }

    // Add a new book to the catalog
    public void addBook(Book book) {
        catalog.add(book);
        System.out.println(book.getTitle() + " has been added to the catalog.");
    }

    // Borrow a book
    public void borrowBook(String title) {
        for (Book book : catalog) {
            if (book.getTitle().equalsIgnoreCase(title) && !book.isBorrowed()) {
                book.borrow();
                System.out.println("You borrowed " + book.getTitle());
                return;
            }
        }
        System.out.println("Sorry, the book is either not available or already borrowed.");
    }

    // Return a book
    public void returnBook(String title) {
        for (Book book : catalog) {
            if (book.getTitle().equalsIgnoreCase(title) && book.isBorrowed()) {
                book.returnBook();
                System.out.println("You returned " + book.getTitle());
                return;
            }
        }
        System.out.println("This book was not borrowed from our library.");
    }

    // Display all books
    public void displayBooks() {
        System.out.println("Library Catalog:");
        for (Book book : catalog) {
            System.out.println(book);
        }
    }

    // Generate report for popular or overdue books (simple example)
    public void generateReport() {
        System.out.println("Popular or Overdue Books Report:");
        for (Book book : catalog) {
            if (book.isBorrowed()) {
                System.out.println(book.getTitle() + " is currently borrowed.");
            }
        }
    }
}

