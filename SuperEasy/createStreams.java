package StreamAPI.SuperEasy;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class createStreams {
    //How do you create streams in java?
    public static void main(String[] args) {
        List<String> list = Arrays.asList("AMIT","BaHaDUR");
        //1. List -> Stream
        Stream<String> stream = list.stream();

        String[] arr = {"AMIT", "BAHADUR"};
        //2. Array -> Stream
        Stream<String> stream1 = Arrays.stream(arr);

        //3. Using .of() method of stream
        Stream<String> stream2 = Stream.of("1","2","3");

        //4. Using .generate() method of stream with .limit() to make the values defined
        Stream<Double> stream3 = Stream.generate(Math::random).limit(5);
    }
}
