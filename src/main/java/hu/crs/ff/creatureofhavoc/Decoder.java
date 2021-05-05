package hu.crs.ff.creatureofhavoc;

import java.util.Set;

public class Decoder {
    private Set<String> vowels = Set.of("a", "e", "i", "o",  "u");

    public static void main(String[] args) {

    }

    String decode(String cipherText) {
        return cipherText;
    }

    public String removeSpaces(String string) {
        return string.replaceAll(" ", "");
    }

    public String replaceVowels(String string) {
        String vowelsConcatenated = String.join(" ", vowels);
        return string.replaceAll("["+ vowelsConcatenated +"]+", " ");
    }
}
