package StreamAPI.Easy;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StringsQues {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Apple", "Banana", "Apricot", "Avavado","Baingan");
        List<String> list2 = Arrays.asList("","","Hello","World","");
        //Q. Count how many strings start with a specific letter(like "A")
        long result = list.stream().filter(n->n.startsWith("A")).count();
        System.out.println(result); // 3

        //Q. Join all the strings in a list to a single comma-separated string
        String joinString = list.stream().collect(Collectors.joining(","));
        System.out.println(joinString); // Apple,Banana,Apricot,Avavado,Baingan

        //Q. Find the first non-empty string in a list
        Optional<String> firstNonEmtStr = list2.stream().filter(s-> !s.isEmpty()).findFirst();
        System.out.println(firstNonEmtStr.get()); // Hello

    }
}
