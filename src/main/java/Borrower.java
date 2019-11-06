import java.util.ArrayList;

public class Borrower {
    private ArrayList<Book> borrowerCollection;

    public Borrower(){
        this.borrowerCollection = new ArrayList<Book> ();
    }

    public int countBorrowerBooks() {
        return this.borrowerCollection.size();
    }

    public void borrowBook(Book book) {
        this.borrowerCollection.add(book);
    }
}
