import java.util.ArrayList;
import java.util.List;

public class Cart {

    private List<Book> books = new ArrayList<>();

    public List<Book> getBooks() {
        return books;
    }

    public void addBook(Book book){
        //if verfügbar
        books.add(book);
    }

    @Override
    public String toString() {
        return "Cart{" +
                "books=" + books +
                '}';
    }
}
