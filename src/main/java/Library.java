import java.util.ArrayList;

public class Library {
    ArrayList<Book> books;
    int capacity;

    public Library(int capacity) {
        this.books = new ArrayList<>();
        this.capacity = capacity;
    }

    public int getBookCount() {
        return this.getBooks().size();
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public boolean addBook(Book book) {
        if(this.hasCapacity()){
            this.books.add(book);
            return true;
        }
        return false;
    }

    private boolean hasCapacity() {
        return this.getBookCount() <= this.getCapacity() - 1;
    }

    public boolean removeBook(Book book) {
        return this.books.remove(book);
    }
}
