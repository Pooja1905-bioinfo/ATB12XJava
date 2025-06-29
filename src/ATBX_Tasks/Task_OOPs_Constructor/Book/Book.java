package ATBX_Tasks.Task_OOPs_Constructor.Book;

public class Book {
    String title;
    String author;
    Integer price;

    public Book(String title, String author, Integer price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void displayDetails(){
        System.out.println("Details of the book:");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
        System.out.println("___________________________");
    }

}
