package hu.crs.ff.creatureofhavoc;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class DecoderTest {

    @Test
    void removeSpaces() {
        var decoder = new Decoder();
        Assertions.assertEquals("aaa", decoder.removeSpaces(" a a    a   "));
    }

    @Test
    void replaceVowelsToSpace() {
        var decoder = new Decoder();
        Assertions.assertEquals("l l l ", decoder.replaceVowels("lalala"));
    }
}