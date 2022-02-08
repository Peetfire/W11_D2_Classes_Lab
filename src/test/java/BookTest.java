import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {
    Book book;

    @Before
    public void before(){
        book = new Book("1984", "George Orwell", "Fiction");
    }

    @Test
    public void bookHasTitle(){
        assertEquals("1984", book.getTitle());
    }

    @Test
    public void bookHasAuthor(){
        assertEquals("George Orwell", book.getAuthor());
    }

    @Test
    public void bookHasGenre(){
        assertEquals("Fiction", book.getGenre());
    }
}
