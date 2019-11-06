import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class LibraryTest {
    private Library library;
    private Book book1;
    private Book book2;
    private Book book3;
    private Book book4;
    private Borrower borrower;

    @Before
    public void before(){
        library = new Library(3);
        borrower = new Borrower();
    }

    @Test
    public void canCountLibraryBooks(){
        assertEquals(0, library.countLibraryBooks());
    }

    @Test
    public void canAddBookToLibrary(){
        library.addBookToLibrary(book1);
        library.addBookToLibrary(book2);
        library.addBookToLibrary(book3);
        assertEquals(3, library.countLibraryBooks());
        library.addBookToLibrary(book4);
        assertEquals(3, library.countLibraryBooks());
    }

    @Test
    public void canRemoveBook(){
        library.addBookToLibrary(book4);
        library.removeBook(book4);
        assertEquals(0, library.countLibraryBooks());
    }
    
    @Test
    public void canLendBook(){
        library.addBookToLibrary(book4);
        library.lendBook(book4, borrower);
        assertEquals(0, library.countLibraryBooks());
    }

}
