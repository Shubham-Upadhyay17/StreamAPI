package StreamAPI.SuperEasy;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SqrNums {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(0,1,2,3,4,5,6,10,23,11,45);
        //Q. Convert numbers in the list to their squares

        //create a new list with Integer as its generic
        //use stream(), and collect() method to operate on the given list and collect it into a list format
        List<Integer> result = list.stream().map(n -> n*n).collect(Collectors.toList());
        System.out.println(result); //[0, 1, 4, 9, 16, 25, 36, 100, 529, 121, 2025]


        //Q. Square even numbers from the list
        List<Integer> answer = list.stream().filter(n->n%2==0).map(n->n*n).collect(Collectors.toList());
        System.out.println(answer); //[0, 4, 16, 36, 100]


        //Q. Find the first number greater than 10 from list
        Optional<Integer> ans = list.stream().filter(n->n>10).sorted().findFirst();
        System.out.println(ans.get()); //11
    }
}
