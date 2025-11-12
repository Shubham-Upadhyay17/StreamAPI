package StreamAPI.Hard;

import java.util.Arrays;
import java.util.stream.Collectors;

public class revSent {
    public static void main(String[] args) {
        String sentence = "Hi I am a dev";

        //Q. Reverse each word in a sentence using streams
        String collect = Arrays.stream(sentence.split(" "))
                .map(word -> new StringBuilder(word).reverse().toString())
                .collect(Collectors.joining(" "));
        System.out.println(collect); // iH I ma a ved
    }
}
