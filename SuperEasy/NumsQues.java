package StreamAPI.SuperEasy;

import java.util.Arrays;
import java.util.List;

public class NumsQues {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);

        //Q. Count how many numbers are greater than 5 in list
        long count = list.stream().filter(n -> n > 5).count();
        System.out.println(count); //4

        //Q. Find sum/product of all the elements in the list
        Integer sum = list.stream().reduce(0,(a,b)-> a+b);
        Integer product = list.stream().reduce(1,(a,b)-> a*b);
        System.out.println("Sum is: "+sum+" & Product is : "+product); //Sum is: 45 & Product is : 362880

        //Q. Find sum of even numbers in list
        Integer evenSum = list.stream().filter(n-> n%2==0).reduce(0,(a,b)->a+b);
        System.out.println(evenSum); //20

        //Q. Find the maximum number in the list
        Integer maxNum = list.stream().reduce(0,(a,b)-> Integer.max(a,b));
        System.out.println(maxNum); //9

        //Q. Find sum of squares of even numbers in the list
        Integer sqrNum = list.stream().filter(n-> n%2==0).map(n->n*n).reduce(0,(a,b)->a+b);
        System.out.println(sqrNum); //120
    }
}
