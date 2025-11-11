package StreamAPI.SuperEasy;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenNums {
    //Filter even numbers from list
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        //collecting the ans in to a list using .stream(), .filter() and .collect() methods
        List<Integer> result = list.stream().filter( n -> n%2==0).collect(Collectors.toList());
        System.out.println(result); //[2, 4, 6, 8, 10]
    }
}
