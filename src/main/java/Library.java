import java.util.ArrayList;
import java.util.HashMap;

public class Library {

    ArrayList<Book> books;
    int capacity;
    HashMap<String, Integer> genreCounter;

    public Library(int capacity) {
        this.books = new ArrayList<>();
        this.capacity = capacity;
        this.genreCounter = new HashMap<>();
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
            this.updateGenreCounter(book);
            return true;
        }
        return false;
    }

    public void updateGenreCounter(Book book){
        int count = 1;
        if(genreCounter.containsKey(book.getGenre())){
            count = genreCounter.get(book.getGenre()) + 1;
        }
        this.genreCounter.put(book.getGenre(), count);
    }

    private boolean hasCapacity() {
        return this.getBookCount() <= this.getCapacity() - 1;
    }

    public boolean removeBook(Book book) {
        return this.books.remove(book);
    }

    public int getGenreCount(String genre) {
        return this.genreCounter.get(genre);
    }

    public int getAllGenreCount() {
        return this.genreCounter.keySet().size();
    }
}
