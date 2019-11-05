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

    @Before
    public void before(){
        library = new Library(3);
        book1 = new Book("The Lord of the Rings", "J.R.R. Tolkien", "Fantasy");
        book2 = new Book("The Sword of Truth", "T. Goodkind", "Fantasy");
        book3 = new Book("The Wheel of Time", "R. Jordan", "Fantasy");
        book4 = new Book("It", "S. King", "Horror");
    }

    @Test
    public void canCountBooks(){
        assertEquals(0, library.countBooks());
    }

    @Test
    public void canAddBookToLibrary(){
        library.addBookToLibrary(book1);
        library.addBookToLibrary(book2);
        library.addBookToLibrary(book3);
        assertEquals(3, library.countBooks());
        library.addBookToLibrary(book4);
        assertEquals(3, library.countBooks());
    }

}
