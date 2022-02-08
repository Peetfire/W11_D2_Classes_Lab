import java.util.ArrayList;

public class PettyArsonist {
    ArrayList<Book> burntBooks;

    public PettyArsonist() {
        this.burntBooks = new ArrayList<>();
    }

    public ArrayList<Book> getBurntBooks() {
        return burntBooks;
    }

    public void setBurntBooks(ArrayList<Book> burntBooks) {
        this.burntBooks = burntBooks;
    }

    public int getBurntBookTally() {
        return this.getBurntBooks().size();
    }

    public void burntABook(Book book){
        this.burntBooks.add(book);
    }

    public void burnBookFromLibrary(Book book, Library library) {
        library.removeBook(book);
        this.burntABook(book);
    }
}
