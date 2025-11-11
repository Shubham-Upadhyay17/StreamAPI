package StreamAPI.Intermediate;

import StreamAPI.Intermediate.DAO.Employee;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class sortEmpBySal {
    public static void main(String[] args) {
        List<Employee> employeeList = Arrays.asList(
                new Employee(101,"Amit",50000),
                new Employee(102,"Bahadur",60000),
                new Employee(103,"Chandan",70000),
                new Employee(104,"Dinesh",80000),
                new Employee(105,"Eshwar",90000)
        );

        List<Employee> list = employeeList.stream()
                        .sorted(Comparator.comparing(Employee::getSalary)
                        .reversed()).toList();
        System.out.println(list);
//        [Employee{id=105, name='Eshwar', salary=90000.0},
//         Employee{id=104, name='Dinesh', salary=80000.0},
//         Employee{id=103, name='Chandan', salary=70000.0},
//         Employee{id=102, name='Bahadur', salary=60000.0},
//         Employee{id=101, name='Amit', salary=50000.0}]

        
    }
}
