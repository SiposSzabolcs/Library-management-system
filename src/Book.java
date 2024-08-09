public class Book {

    String title;
    String author;
    String ISBN;
    Boolean borrowed;

    public Book(String title, String author, String ISBN){
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.borrowed = false;
    }


}
