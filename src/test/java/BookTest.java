import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    private Book ThousandSons;

    @Before
    public void before(){
        ThousandSons = new Book("A Thousand Sons", "Dan Adbet", "Sci-Fi");
    }

    @Test
    public void bookExists(){
        assertEquals("A Thousand Sons", ThousandSons.getTitle());
        assertEquals("Dan Adbet", ThousandSons.getAuthor());
        assertEquals("Sci-Fi", ThousandSons.getGenre());
    }
}
