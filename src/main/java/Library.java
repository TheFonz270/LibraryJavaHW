import java.util.ArrayList;

public class Library {

    private String name;
    private int capacity;
    private ArrayList<Book> bookStock;

    public Library(String name, int capacity, ArrayList<Book> books) {
        this.name = name;
        this.capacity = capacity;
        this.bookStock = books;
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public ArrayList<Book> getBooks() {
        return bookStock;
    }

    public void setBooks(ArrayList<Book> books) {
        this.bookStock = books;
    }

    public int getBookStock() {
        return bookStock.size();
    }

    public void addBook(Book book) {
        if (getBookStock() < this.capacity){
            this.bookStock.add(book);
        }
        else {
            System.out.println("Library Full");
        }
    }
}
