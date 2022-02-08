import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LibraryTest {
    Library library;
    Book book1, book2, book3, book4, book5;

    @Before
    public void before(){
        library = new Library(5);
        book1 = new Book("Mog", "Judith Kerr", "Children");
        book2 = new Book("Fup", "Jim Dodge", "Fiction");
        book3 = new Book("Oryx and Crake", "Margaret Atwood", "Sci-Fi");
        book4 = new Book("Burglar Bill", "Janet and Allan Ahlberg", "Children");
        book5 = new Book("The Tiger Who Came To Tea", "Judith Kerr", "Children");
    }

    @Test
    public void startsEmpty(){
        assertEquals(0, library.getBookCount());
    }

    @Test
    public void canAddBook(){
        assertTrue(library.addBook(book1));
    }

    @Test
    public void canNotAddBook(){
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        library.addBook(book5);
        assertFalse(library.addBook(book1));
    }

    @Test
    public void canRemoveBook(){
        library.addBook(book1);
        assertTrue(library.removeBook(book1));
    }

    @Test
    public void canNotRemoveBook(){
        assertFalse(library.removeBook(book1));
    }

}
