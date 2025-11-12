package StreamAPI.Intermediate;

import StreamAPI.Intermediate.DAO.Employee2;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class avgSalByDept {
    public static void main(String[] args) {
        List<Employee2> list = Arrays.asList(
                new Employee2(1,"Amit","HR",12000),
                new Employee2(2,"Bahadur","HR",23400),
                new Employee2(3,"Chintu","IT",45600),
                new Employee2(4,"Dinesh","IT",234780),
                new Employee2(5,"Eshwar","Sales",900000)
        );

        //Q. Group employees by department and calculate average salary
        Map<String, Double> collect = list.stream()
                .collect(Collectors.groupingBy(Employee2::getDept, Collectors.averagingDouble(Employee2::getSalary)));
        System.out.println(collect);// {Sales=900000.0, HR=17700.0, IT=140190.0}


        //Q. Find the highest paid employee in each department
        Map<String, Optional<Employee2>> collect1 = list.stream().collect(Collectors.groupingBy(Employee2::getDept, Collectors.maxBy(Comparator.comparing(Employee2::getSalary))));
        System.out.println(collect1);
//        {Sales=Optional[Employee2{id=5, name='Eshwar', dept='Sales', salary=900000.0}],
//            HR=Optional[Employee2{id=2, name='Bahadur', dept='HR', salary=23400.0}],
//            IT=Optional[Employee2{id=4, name='Dinesh', dept='IT', salary=234780.0}]}


        //Q. Find all departments with more than one employee
        Map<String, Long> map = list.stream().collect(Collectors.groupingBy(Employee2::getDept, Collectors.counting()));
        System.out.println(map);// {Sales=1, HR=2, IT=2}

        List<Map.Entry<String, Long>> result = map.entrySet().stream().filter(e -> e.getValue() > 1).toList();
        System.out.println(result);// [HR=2, IT=2]


        //Q. Find department with the highest average salary
        Map.Entry<String, Double> highestAvgSalByDept = list.stream()
                .collect(Collectors.groupingBy(Employee2::getDept, Collectors.averagingDouble(Employee2::getSalary)))
                .entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .orElseThrow();
        System.out.println(highestAvgSalByDept); // Sales=900000.0

    }
}
