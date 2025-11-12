package StreamAPI.Hard;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class SlidingNums {
    public static void main(String[] args) {
        //Q. Given a list of integers, compute the average of every 3-element sliding window
        List<Integer> list = Arrays.asList(1,2,3,4,5,6);
        int window = 3;
        List<Double> avgSlidWin = IntStream.range(0, list.size() - (window - 1)).mapToObj(i -> list.subList(i, i + window))
                .map(w -> w.stream()
                        .mapToInt(Integer::intValue)
                        .average()
                        .orElse(0.0)).toList();
        System.out.println(avgSlidWin); //[2.0, 3.0, 4.0, 5.0]


    }
}
