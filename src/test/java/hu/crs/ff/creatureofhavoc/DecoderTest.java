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

    @Test
    void replaceConsonants() {
        var decoder = new Decoder();
        Assertions.assertEquals("au", decoder.replaceConsonants("bv"));
    }

    @Test
    void decode() {
        var decoder = new Decoder();
        Assertions.assertEquals("You get the hang oe them aeter a while!", decoder.decode("Yp vugfte t hfehbn ga pfoth f mebftf rebawh jlf!"));
    }
}