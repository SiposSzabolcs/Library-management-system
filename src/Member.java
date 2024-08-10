import java.util.ArrayList;

public class Member {

    String name;
    String memberId;
    String contactInfo;
    ArrayList<Book> borrowedBooks;

    private static int instanceCount = 0;

    public Member(String name, String contactInfo){
        instanceCount++;

        this.name = name;
        this.memberId = generateMemberId();
        this.contactInfo = contactInfo;
        this.borrowedBooks = new ArrayList<>();
    }

    public String generateMemberId(){
        return String.format("%03d", instanceCount);
    }

    public void borrowBook(Book book){
        if (!book.borrowed){
            borrowedBooks.add(book);
            book.borrowBook();
            System.out.printf("%s book borrowed by %s.\n", book.title, this.name);
        } else {
            System.out.printf("%s is already borrowed\n", book.title);
        }
    }

    public void returnBook (Book book){
        if (borrowedBooks.contains(book)){
            borrowedBooks.remove(book);
            book.returnBook();
        } else {
            System.out.printf("%s didn't borrow the %s book.\n",this.name, book.title);
        }

    }

    public void displayMemberDetails(){
        System.out.printf("Name: %s\nMember id: %s\nContact info: %s\n",this.name, this.memberId, this.contactInfo);
    }
}
