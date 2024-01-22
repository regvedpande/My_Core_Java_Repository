package com.mkpits.constructor;


// Constructor Concepts in Java:

// Constructor Definition:

// A constructor is a special method that is used to initialize objects.
// It has the same name as the class.
// It doesn't have a return type.

// Default Constructor:
// If a class does not have any constructor, Java provides a default constructor.
// The default constructor is provided by Java if no other constructor is defined.

// Parameterized Constructor:
// A constructor with parameters is called a parameterized constructor.
// It allows you to initialize the object with specific values during object creation.

// Constructor Overloading:
// A class can have multiple constructors with different parameter lists.
// This is known as constructor overloading.
// Chaining Constructors (this() and super()):

// this() is used to invoke the current class constructor.
// super() is used to invoke the constructor of the parent class.

// Private Constructor:
// A constructor can be declared as private.
// Used for classes that should not be instantiated, or to implement the Singleton pattern.


// Class representing a Book
class Book {
    private String title;
    private String author;

    // Default Constructor (no-args)
    public Book() {
        System.out.println("Default constructor called.");
    }

    // Parameterized Constructor
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        System.out.println("Parameterized constructor called with title: " + title + " and author: " + author);
    }

    // Constructor Overloading
    public Book(String title) {
        this.title = title;
        this.author = "Unknown";
        System.out.println("Constructor overloading with title: " + title);
    }

    // Chaining Constructors using 'this'
    public Book(String title, String author, int year) {
        this(title, author); // Invokes the parameterized constructor
        System.out.println("Chaining constructor with year: " + year);
    }

    // Display Book details
    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}

public class ConstructorConcepts {
    public static void main(String[] args) {
        // Creating objects using different constructors
        Book book1 = new Book(); // Default constructor
        Book book2 = new Book("Java Programming", "John Doe"); // Parameterized constructor
        Book book3 = new Book("Design Patterns"); // Constructor overloading
        Book book4 = new Book("Clean Code", "Robert Martin", 2022); // Chaining constructors

        // Displaying book details
        System.out.println("\nBook Details:");
        book1.displayDetails();
        book2.displayDetails();
        book3.displayDetails();
        book4.displayDetails();
    }
}
