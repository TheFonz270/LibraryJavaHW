import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Library dragonsNook;
    private ArrayList<Book> books;
    private Book thousandSons;
    private Book nemesis;
    private Book fulgrim;

    @Before
    public void before(){
        thousandSons = new Book("A Thousand Sons", "Dan Adbet", "Sci-Fi");
        nemesis = new Book("Nemisis", "Dan Adbet", "Sci-Fi");
        fulgrim = new Book("Fulgrim", "Dan Adbet", "Sci-Fi");
        books = new ArrayList<Book>();
        books.add(thousandSons);
        books.add(nemesis);
        dragonsNook = new Library("Dragon's Nook", 2, books);
    }

    @Test
    public void libraryExists(){
        assertEquals("Dragon's Nook", dragonsNook.getName());
        assertEquals(2, dragonsNook.getCapacity());
    }

    @Test
    public void GetBookStock(){
        assertEquals(2, dragonsNook.getBookStock());
    }

    @Test
    public void cantAddBookOverCapacity(){
        assertEquals(2, dragonsNook.getBookStock());
        dragonsNook.addBook(fulgrim);
        assertEquals(2, dragonsNook.getBookStock());
    }

    @Test
    public void canAddBookAtCapacity(){
        assertEquals(2, dragonsNook.getBookStock());
        dragonsNook.setCapacity(3);
        dragonsNook.addBook(fulgrim);
        assertEquals(3, dragonsNook.getBookStock());
    }
}

