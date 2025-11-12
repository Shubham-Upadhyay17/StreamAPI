package StreamAPI.Intermediate;

import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StringQue {
    public static void main(String[] args) {

        //Q. Find most frequent character in the string
        String input = "banana";
        Map.Entry<Character, Long> countMaxFreqChar = input.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        Collectors.counting()
                )).entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .orElseThrow();
        System.out.println(countMaxFreqChar); //a=3

        //Q. Find first non-repeating character in the string
        Optional<Map.Entry<Character, Long>> firstNonRepChar = input.chars().mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        Collectors.counting()
                )).entrySet().stream().filter(entry -> entry.getValue() == 1).findFirst();
        System.out.println(firstNonRepChar); //Optional[b=1]
        System.out.println(firstNonRepChar.get()); // b=1
    }
}
