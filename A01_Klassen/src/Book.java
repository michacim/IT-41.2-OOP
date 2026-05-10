import java.math.BigDecimal;
import java.time.LocalDate;


/**
 * Aufgabe:
 * 1. Suche mögliche Eigenschaften (Instanzvariablen)
 * -> mögliche Datentypen in Java: String, int, double, float, boolean (true, false)
 * 2. schreibe/generiere Get/Set-methoden
 * 3. mindestens ein Konstruktor
 * 4. toString()-Methode
 * Test in Main
 * 5. Erzeuge mindestens 2 Book-Objekte und rufe einige Methoden auf
 */


public class Book {

    private int id;
    private String isbn;
    private String title;
    private String author;
    private double price;
    private int year;
    private boolean available =true;

    public Book(String isbn, String title) {
        this.isbn = isbn;
        this.title = title;
    }


    public Book(int id, String isbn, String title, String author, double price, int year, boolean available) {
        this.id = id;
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.price = price;
        this.year = year;
        this.available = available;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", isbn='" + isbn + '\'' +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                ", year=" + year +
                ", available=" + available +
                '}';
    }
}

