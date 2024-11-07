public class Book {
    private String title;
    private String author;
    private String isbn;
    public static int totalBooks = 0;
    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        totalBooks++;
    }
    public static void displayTotalBooks() {
        System.out.println("Total books: " + totalBooks);
    }
}
