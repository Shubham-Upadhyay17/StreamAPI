package StreamAPI.Hard;

import StreamAPI.Hard.DAO.Employee;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class employeeQue {
    public static void main(String[] args) {
        List<Employee> list = Arrays.asList(
                new Employee(1,"Amit",12000),
                new Employee(2,"Bahadur",23400),
                new Employee(3,"Chintu",45600),
                new Employee(4,"Dinesh",234780),
                new Employee(5,"Dyaneshwar",900000)
        );

        //Q. Find the most common first letter among all employee names
        Optional<Map.Entry<Character, Long>> maxChar = list.stream().map(e -> e.getName().charAt(0)).collect(Collectors.groupingBy(
                Function.identity(),
                Collectors.counting()
        )).entrySet().stream().max(Map.Entry.comparingByValue());
        System.out.println(maxChar.get()); // D=2
    }
}
