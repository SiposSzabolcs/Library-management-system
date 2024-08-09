
public class Main {
    public static void main(String[] args) {

        Book book = new Book("Harry Potter", "J.K Rowling", "9780545069670");

        book.displayBookDetails();

        Member member1 = new Member("Szabolcs", "siposszabolcs10@gmail.com");

        Member member2 = new Member("Pista", "pistalajos@gmail.com");

        member2.displayMemberDetails();

        member1.borrowBook(book);
        member1.returnBook(book);
        member2.borrowBook(book);
        System.out.println(member1.borrowedBooks);
        System.out.println(member2.borrowedBooks);
    }
}