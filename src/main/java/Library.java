import java.util.ArrayList;

public class Library {
    // instance variables
    private ArrayList<Book> libraryCollection;
    private int capacity;

    // constructor
    public Library(int capacity){
        this.libraryCollection = new ArrayList<Book>();
        this.capacity = capacity;
    }

    public int countLibraryBooks() {
        return this.libraryCollection.size();
    }

    public void addBookToLibrary(Book book) {
        if (this.capacity > this.libraryCollection.size()){
            this.libraryCollection.add(book);
        }
    }

    public void removeBook(Book book) {
        this.libraryCollection.remove(book);
//        borrower.borrowBook(book4);
    }

    public void lendBook(Book book4, Borrower borrower) {
        removeBook(book4);
        borrower.borrowBook(book4);
    }
}
