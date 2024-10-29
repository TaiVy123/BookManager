/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;

/**
 *
 * @author taing
 */
public class LibraryManager {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        System.out.println("Welcome to the Library Management System");

        while (running) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Add a new book");
            System.out.println("2. Borrow a book");
            System.out.println("3. Return a book");
            System.out.println("4. Display all books");
            System.out.println("5. Generate report of borrowed books");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter book title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter book author: ");
                    String author = scanner.nextLine();
                    Book newBook = new Book(title, author);
                    library.addBook(newBook);
                    break;

                case 2:
                    System.out.print("Enter the title of the book to borrow: ");
                    title = scanner.nextLine();
                    library.borrowBook(title);
                    break;

                case 3:
                    System.out.print("Enter the title of the book to return: ");
                    title = scanner.nextLine();
                    library.returnBook(title);
                    break;

                case 4:
                    library.displayBooks();
                    break;

                case 5:
                    library.generateReport();
                    break;

                case 6:
                    System.out.println("Exiting Library Management System...");
                    running = false;
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }
}

