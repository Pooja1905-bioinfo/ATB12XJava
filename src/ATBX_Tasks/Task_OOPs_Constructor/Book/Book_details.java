package ATBX_Tasks.Task_OOPs_Constructor.Book;

public class Book_details {
    public static void main(String[] args) {
        Book b1 = new Book("Malgudi Days","R.K. Narayan", 250);
        Book b2 = new Book("Gitanjali","Rabindranath Tagore", 450);
        Book b3 = new Book("Hamlet","William Shakespeare", 670);

        b1.displayDetails();
        b2.displayDetails();
        b3.displayDetails();
    }
}
