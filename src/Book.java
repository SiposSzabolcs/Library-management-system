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

    public void borrowBook(){
        if (!borrowed){
            this.borrowed = true;
            System.out.printf("%s book has been borrowed.\n", this.title);
        } else {
            System.out.printf("%s book already borrowed.\n", this.title);
        }
    }

    public void returnBook(){
        if (borrowed){
            this.borrowed = false;
            System.out.printf("%s book has been returned.\n", this.title);
        } else {
            System.out.printf("%s book wasn't borrowed from here.\n", this.title);
        }
    }

    public void displayBookDetails(){
        System.out.printf("Title: %s\nAuthor: %s\nISBN: %s\nBorrowed: %s\n", this.title, this.author, this.ISBN, this.borrowed);
    }

}
