package StreamAPI.Easy;

import java.util.*;
import java.util.stream.Collectors;

public class NumsQues {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,4,6,3,4,1,2,5,9);
        List<List<Integer>> list2 = Arrays.asList(
                Arrays.asList(1,2,3),
                Arrays.asList(4,5,6),
                Arrays.asList(7,8,9)
        );

        //Q. Find all distinct elements from the list(remove duplicates)
        List<Integer> result = list.stream().distinct().collect(Collectors.toList());
        System.out.println(result); //[1, 2, 4, 6, 3, 5, 9]

        //Q. Find the average of the number in the list
        OptionalDouble avgNums = list.stream().mapToInt(Integer::intValue).average();
        System.out.println(avgNums.getAsDouble()); // 3.7

        //Q. Sort a list in asc and desc using streams
        List<Integer> ascList = list.stream().sorted().toList();
        System.out.println(ascList); // [1, 1, 2, 2, 3, 4, 4, 5, 6, 9]
        List<Integer> descList = list.stream().sorted(Comparator.reverseOrder()).toList();
        System.out.println(descList);// [9, 6, 5, 4, 4, 3, 2, 2, 1, 1]

        //Q. Check if any number is divides by 3
        boolean num = list.stream().anyMatch(n->n%3==0);
        System.out.println(num); // true

        //Q. Find the second-highest element present in the list using streams
        Optional<Integer> secondHighest = list.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst();
        System.out.println(secondHighest.get()); // 6

        //Q. Check if all elements are positive numbers
        boolean posNum = list.stream().allMatch(n->n>0);
        System.out.println(posNum); // true

        //Q. Flatten the list of list
        List<Integer> flatList = list2.stream().flatMap(List::stream).toList();
        System.out.println(flatList); // [1, 2, 3, 4, 5, 6, 7, 8, 9]
    }
}
