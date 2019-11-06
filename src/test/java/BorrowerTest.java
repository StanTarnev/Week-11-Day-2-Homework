import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {
    private Borrower borrower;
    private Book book4;

    @Before
    public void before(){
        borrower = new Borrower();
    }

    @Test
    public void canBorrowBook(){
        borrower.borrowBook(book4);
        assertEquals(1, borrower.countBorrowerBooks());
    }
}
