package com.practice.javaprograms;

import java.util.Scanner;

class BookLibrary {
    String[] books;
    int noOfBooks;
    public BookLibrary() {
        this.books = new String[100];
    }
    public String insertBooks() {
        Scanner insert = new Scanner(System.in);
        System.out.print("Enter your book : ");
        return (insert.nextLine());
    }
    public void addBook() {
        String book = insertBooks();
        this.books[noOfBooks] = book;
        System.out.println(book + " has been added");
        noOfBooks++;
    }
    public void issueBook() {
        String book = insertBooks();
        for (int i = 0; i < books.length; i++) {
            if(books[i].equals(book)) {
                System.out.println(book + " has been issued");
                books[i] = null;
            }
        }
    }
    public void returnBook() {
        addBook();
    }
    public void showBooks() {
        for (String book: this.books) {
            if (book == null) {
                continue;
            }
            System.out.println("* " + book);
        }
    }
}
public class Library {
    public static void main(String[] args) {
        BookLibrary lib = new BookLibrary();
        System.out.println("Welcome to My Library !!!");
        System.out.println("What do you want to do ?");
        System.out.println("1. Add Book\n2. Issue Book\n3. Return Book\n4. Show Books");
        Scanner sc = new Scanner(System.in);
        int choice;
        boolean b = true;
        while (b) {
            System.out.print("Enter your choice : ");
            choice = sc.nextInt();
            switch (choice) {
                case 1 -> lib.addBook();
                case 2 -> lib.issueBook();
                case 3 -> lib.returnBook();
                case 4 -> lib.showBooks();
                default -> System.out.print("Please enter a valid choice : ");
            }
            System.out.print("\nIf you want to use another choice\npress 'Y' or press any key to exit : ");
            char c = sc.next().charAt(0);
            if (c != 'Y' && c != 'y') {
                b = false;
            }
        }
    }
}
