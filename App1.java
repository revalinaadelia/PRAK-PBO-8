public class App1 {
    public static void main(String[] args) {
        Book book1 = new Book("Belajar Coding", "Revalina", "ISBN 1");
        Book book2 = new Book("Cara Membuat Website", "Raihan", "ISBN 2");
        Book book3 = new Book("Tips Mahir Coding", "Zaki", "ISBN 3");

        Book.displayTotalBooks();
    }
}
