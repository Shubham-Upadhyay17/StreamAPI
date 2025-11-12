package StreamAPI.Hard;

import java.util.Arrays;
import java.util.Comparator;

public class longestWord {
    public static void main(String[] args) {
        String sentence = "The quick, brown fox jumped over the lazy dog!";

        //Q. Find the longest word in a sentence  ignoring punctuations and case
        String result = Arrays.stream(
                sentence.toLowerCase()
                        .replaceAll("[^a-z\\s]", "")
                        .split(" ")
        ).max(Comparator.comparing(String::length)).orElse("");
        System.out.println(result);
    }
}
