package StreamAPI.Hard;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class freqWords {
    public static void main(String[] args) {
        String paragraph = "The morning sun filtered through the tall oak trees, casting soft golden rays across the quiet park. Dew still clung to the blades of grass, sparkling like tiny gems in the light. A gentle breeze carried the scent of blooming flowers, mingling with the distant sound of birds greeting the new day. As the city slowly came to life, the park remained a peaceful sanctuary, offering a brief moment of calm before the rush of daily routines began.";

        //Q. Find the top 3 most frequent words in a paragraph
        List<Map.Entry<String, Long>> freqWordHigh = Arrays.stream(
                paragraph.toLowerCase()
                        .replaceAll("[^a-z\\s]", "")
                        .split(" ")
        ).collect(Collectors.groupingBy(
                Function.identity(),
                Collectors.counting()
        )).entrySet().stream()
                .sorted(Map.Entry.<String, Long>comparingByValue().reversed())
                .limit(3).toList();
        System.out.println(freqWordHigh);// [the=11, of=5, a=3]
    }
}
