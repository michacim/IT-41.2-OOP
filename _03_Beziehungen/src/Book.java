import java.util.ArrayList;
import java.util.List;

public class Book {
    private String title;
    private String isbn;
    private List<Author> authors = new ArrayList<>();

    public Book(String title, String isbn, List<Author> authors) {
        this.title = title;
        this.isbn = isbn;
        this.authors = authors;
    }

    public Book(String title, String isbn, Author author) {
        this.title = title;
        this.isbn = isbn;
        authors.add(author);
    }

    public Book(String title, String isbn) {
        this.title = title;
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void addAuthor(Author author){
        authors.add(author);
    }

    public List<Author> getAuthors() {
        return authors;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", isbn='" + isbn + '\'' +
                ", authors=" + authors +
                '}';
    }
}
