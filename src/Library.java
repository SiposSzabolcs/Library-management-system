import java.util.ArrayList;

public class Library {
    ArrayList<Book> books = new ArrayList<>();
    ArrayList<Member> members = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
        System.out.printf("%s successfully added.\n", book.title);
    }

    public void removeBook(Book book) {
        books.remove(book);
        System.out.printf("%s successfully removed.\n", book.title);
    }

    public Book findBookByTitle(String title) {
        for (Book book : books) {
            if (book.title.equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null;
    }

    public Book findBookByAuthor(String author) {
        for (Book book : books) {
            if (book.author.equalsIgnoreCase(author)) {
                return book;
            }
        }
        return null;
    }

    public Book findBookByISBN(String ISBN) {
        for (Book book : books) {
            if (book.ISBN.equalsIgnoreCase(ISBN)) {
                return book;
            }
        }
        return null;
    }

    public void registerMember(Member member) {
        members.add(member);
        System.out.printf("%s member registered.\n", member.name);
    }

    public void removeMembership(Member member) {
        members.remove(member);
        System.out.printf("%s successfully removed.\n", member.name);
    }

    public Member findMemberByMemberId(String memberId){
        for (Member member : members) {
            if (member.memberId.equalsIgnoreCase(memberId)) {
                return member;
            }
        }
        return null;
    }

    public void borrowBook(String ISBN, String memberId){
        Book book = findBookByISBN(ISBN);
        Member member = findMemberByMemberId(memberId);

        member.borrowBook(book);
        System.out.printf("%s borrowed %s\n", member.name, book.title);
    }

    public void returnBook(String ISBN, String memberId){
        Book book = findBookByISBN(ISBN);
        Member member = findMemberByMemberId(memberId);

        member.returnBook(book);
        System.out.printf("%s returned %s\n", member.name, book.title);
    }

    public ArrayList<Book> listAvailableBooks(){
        ArrayList<Book> availableBooks = new ArrayList<>();
        for (Book book : books){
            if (!book.borrowed){
                availableBooks.add(book);
            }
        }
        return availableBooks;
    }

    public ArrayList<Book> listBorrowedBooks(){
        ArrayList<Book> borrowedBooks = new ArrayList<>();
        for (Book book : books){
            if (book.borrowed){
                borrowedBooks.add(book);
            }
        }
        return borrowedBooks;
    }


}
