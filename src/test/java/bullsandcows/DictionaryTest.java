package bullsandcows;

import java.io.IOException;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class DictionaryTest {
    @Test public void randomWord01() throws IOException {
        Dictionary dict = new Dictionary("russian-short-utf.txt");
        assertNotNull(dict.randomWord());
    }
}
