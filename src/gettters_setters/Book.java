package gettters_setters;

import java.util.Scanner;

// Creating class
class Book1 {
    // set up three private properties
    private String title;
    private String author;
    private int numberOfPages;
    // getters and setters go here

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setTitle(String title) {
        if (title != null) {
            this.title = title;
        }

    }

    public void setAuthor(String author) {
        if (author != null) {
            this.author = author;
        }

    }

    public void setNumberOfPages(int numberOfPages) {
        if (numberOfPages > 0) {
            this.numberOfPages = numberOfPages;
        }

    }

    // Remember:
    // 1. They must not allow empty string for 'title' and 'author'.
    // 2. They must not allow negative or zero value for 'numberOfPages'.
    // 3. If such values are attempted to be set, the property should remain unchanged.
}

public class Book {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        // Create an object of the Book class
        Book1 book = new Book1();

        // Take Title, Author and numberOfPages as next inputs and set them using the mutator methods
        // Your code here
        String title = sc.nextLine();
        String author = sc.nextLine();
        int pages = sc.nextInt();

        // Then use the accessor methods to get and print these values.
        // Your code here

        book.setTitle(title);
        book.setAuthor(author);
        book.setNumberOfPages(pages);

        System.out.println(book.getTitle());
        System.out.println(book.getAuthor());
        System.out.println(book.getNumberOfPages());

        sc.close();
    }
}
