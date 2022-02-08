import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PettyArsonistTest {
    PettyArsonist bill;
    Library libby;
    Book book1, book2, book3, book4, book5;


    @Before
    public void before(){
        bill = new PettyArsonist();
        book1 = new Book("Mog", "Judith Kerr", "Children");
        book2 = new Book("Fup", "Jim Dodge", "Fiction");
        book3 = new Book("Oryx and Crake", "Margaret Atwood", "Sci-Fi");
        book4 = new Book("Burglar Bill", "Janet and Allan Ahlberg", "Children");
        book5 = new Book("The Tiger Who Came To Tea", "Judith Kerr", "Children");
        libby = new Library(5);
        libby.addBook(book1);
        libby.addBook(book2);
        libby.addBook(book3);
        libby.addBook(book4);
        libby.addBook(book5);
    }

    @Test
    public void startsNoBurntBooks(){
        assertEquals(0, bill.getBurntBookTally());
    }

    @Test
    public void isFireFodderInLibrary(){
        assertEquals(5, libby.getBookCount());
    }

    @Test
    public void canAddABurntBookToTally(){
        bill.burntABook(book1);
    }

    @Test
    public void canBurnALibraryBook(){
        bill.burnBookFromLibrary(book1, libby);
        assertEquals(4, libby.getBookCount());
        assertEquals(1, bill.getBurntBookTally());
    }
}
