package bullsandcows;

import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class BullsAndCowsTest {
    @Test public void countBulls01() {
        assertTrue(0 == BullsAndCows.countBulls("qweasdzxc", "uiojklbnm"));
    }

    @Test public void countBulls02() {
        assertTrue(1 == BullsAndCows.countBulls("ac", "ab"));
    }

    @Test public void countBulls03() {
        assertTrue(1 == BullsAndCows.countBulls("ca", "ba"));
    }

    @Test public void countBulls04() {
        assertTrue(1 == BullsAndCows.countBulls("cab", "bac"));
    }

    @Test public void countBulls05() {
        assertTrue(2 == BullsAndCows.countBulls("poru", "tobu"));
    }

    @Test public void countBulls06() {
        assertTrue(1 == BullsAndCows.countBulls("qw", "ewr"));
    }

    @Test public void countBulls07() {
        assertTrue(1 == BullsAndCows.countBulls("wry", "ur"));
    }

    @Test public void countCows01() {
        assertTrue(1 == BullsAndCows.countCows("ab", "ca"));
    }

    @Test public void countCows02() {
        assertTrue(4 == BullsAndCows.countCows("rotan", "nator"));
    }

    @Test public void countCows03() {
        assertTrue(1 == BullsAndCows.countCows("qwer", "rca"));
    }

    @Test public void countCows04() {
        assertTrue(1 == BullsAndCows.countCows("abrq", "caro"));
    }

    @Test public void countCows05() {
        assertTrue(4 == BullsAndCows.countCows("rotanuuu", "natoriii"));
    }

    @Test public void countCows06() {
        assertTrue(1 == BullsAndCows.countCows("qr", "rca"));
    }

    @Test public void countCows07() {
        assertTrue(0 == BullsAndCows.countCows("jerom", ""));
    }

    @Test public void countCows08() {
        assertTrue(0 == BullsAndCows.countCows("", "rcaqweasdxzxzx"));
    }

    @Test public void countCows09() {
        assertTrue(9 == BullsAndCows.countCows("ababab", "cacaca"));
    }

    @Test public void countCows10() {
        assertTrue(3 == BullsAndCows.countCows("aba", "aac"));
    }

    @Test public void isCorrectGuess01() {
        assertTrue(BullsAndCows.isCorrectGuess("abcdefghijklmnopqrstuvwxyz"));
    }
    
    @Test public void isCorrectGuess02() {
        assertFalse(BullsAndCows.isCorrectGuess("abcdefghijklm0123456789nopqrstuvwxyz"));
    }
    
    @Test public void isCorrectGuess03() {
        assertFalse(BullsAndCows.isCorrectGuess("a c e g i k m o q s u w y"));
    }
    
    @Test public void isCorrectGuess04() {
        assertTrue(BullsAndCows.isCorrectGuess("йцукенгшщзхъфывапролджэячсмитьбю"));
    }
}
