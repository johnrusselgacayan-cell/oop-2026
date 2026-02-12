

public class Book {
    String title;
    String author;
    String isbn;
    String publicationDate;

    public Book(){}

    public Book (String bookTitle, String bookAuthor, String bookIsbn, String bookPublicationDate ){
        title = bookTitle;
        author = bookAuthor;
        isbn = bookIsbn;
        publicationDate = bookPublicationDate;
    }

    void printBookInfo(){
        System.out.printf("Title: %s\nAuthor: %s\nIsbn: %s\nPublication Date: %s\n", title, author, isbn, publicationDate);
        System.out.println();
    }
}
