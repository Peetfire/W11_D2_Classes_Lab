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

//    public void burnBook(Book book, Library library) {
//        library.
//    }
}
