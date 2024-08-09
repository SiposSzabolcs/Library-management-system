
public class Main {
    public static void main(String[] args) {

        Book book = new Book("Harry Potter", "J.K Rowling", "9780545069670");

        System.out.printf("Title: %s\nAuthor: %s\nISBN: %s\nBorrowed: %s", book.title, book.author, book.ISBN, book.borrowed);

    }
}