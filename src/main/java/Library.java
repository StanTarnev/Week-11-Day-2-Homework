import java.util.ArrayList;

public class Library {
    // instance variables
    private ArrayList<Book> bookcollection;
    private int capacity;

    // constructor
    public Library(int capacity){
        this.bookcollection = new ArrayList<Book>();
        this.capacity = capacity;
    }

    public int countBooks() {
        return this.bookcollection.size();
    }

    public void addBookToLibrary(Book book) {
        if (this.capacity > this.bookcollection.size()){
            this.bookcollection.add(book);
        }
    }
}
