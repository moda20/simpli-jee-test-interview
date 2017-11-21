package en.simplifia.input.locale;

import fr.simplifia.input.locale.LocaleExtractor;
import org.testng.annotations.Test;

import java.util.Locale;

import static org.testng.Assert.assertEquals;


public class LocaleExtractorTest {
    @Test
    public void testToLocale() throws Exception {
        assertEquals(Locale.FRENCH, LocaleExtractor.toLocale("fr"));
    }

    @Test //TODO
    public void testToLocaleEn() throws Exception {
    }

    @Test(expectedExceptions = NullPointerException.class)
    public void testToLocaleNull() throws Exception {
        LocaleExtractor.toLocale(null);
    }

    @Test //TODO
    public void testToLocaleNEmpty() throws Exception {

    }


}