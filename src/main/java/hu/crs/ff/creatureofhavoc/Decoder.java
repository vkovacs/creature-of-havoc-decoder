package hu.crs.ff.creatureofhavoc;

import java.util.Arrays;
import java.util.stream.Collector;

public class Decoder {
    public static void main(String[] args) {
        var decoder = new Decoder();

        Arrays.stream(args)
                .map(decoder::decode)
                .forEach(System.out::println);
    }

    String decode(String cipherText) {
        return replaceConsonants(replaceVowels(removeSpaces(cipherText)));
    }

    public String removeSpaces(String string) {
        return string.replaceAll(" ", "");
    }

    public String replaceVowels(String string) {
        return string.replaceAll("[aeiou]", " ");
    }

    public String replaceConsonants(String text) {
        return text.chars()
                .mapToObj(c -> (char) c)
                .map(this::replace)
                .collect(Collector.of(
                        StringBuilder::new,
                        StringBuilder::append,
                        StringBuilder::append,
                        StringBuilder::toString));
    }

    private char replace(char letter) {
        return switch (letter) {
            case 'b' -> 'a';
            case 'B' -> 'B';
            case 'f' -> 'e';
            case 'F' -> 'E';
            case 'j' -> 'i';
            case 'J' -> 'j';
            case 'p' -> 'o';
            case 'P' -> 'O';
            case 'v' -> 'u';
            case 'V' -> 'U';
            default -> letter;
        };
    }
}
