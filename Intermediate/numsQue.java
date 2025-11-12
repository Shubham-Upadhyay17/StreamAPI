package StreamAPI.Intermediate;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class numsQue {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,5,6,7,8,9,10);

        //Q. Partition numbers in odd and even lists
        Map<Boolean, List<Integer>> collect = list.stream().collect(Collectors.partitioningBy(n -> n % 2 == 0));
        System.out.println(collect);
    }
}
