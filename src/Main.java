
public class Main {
    public static void main(String[] args) {

        Book book1 = new Book("Harry Potter", "J.K Rowling", "9780545069670");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", "9780060173227");
        Book book3 = new Book("Anna Karenina", " Leo Tolstoy", "9780075536321");
        Book book4 = new Book("1984", "George Orwell", "9780198185215");

        Member member1 = new Member("Szabolcs", "siposszabolcs10@gmail.com");

        Member member2 = new Member("Pista", "pistalajos@gmail.com");

        Library library = new Library();

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);

        library.registerMember(member1);
        library.registerMember(member2);

        library.borrowBook( book1.ISBN, member1.memberId);

        System.out.println(library.listAvailableBooks());
        System.out.println(library.listBorrowedBooks());

    }
}