class Book {
    String title;
    String author;
    double price;

    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    void displayDetails() {
        System.out.println("Title: " + title + ", Author: " + author + ", Price: " + price);
    }
}

public class Solution {
    public static void main(String[] args) {
        Book book = new Book("Effective Java", "Joshua Bloch", 45.99);
        book.displayDetails();
    }
}
