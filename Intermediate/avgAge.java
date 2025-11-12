package StreamAPI.Intermediate;

//import StreamAPI.Intermediate.DAO.Employee;
import StreamAPI.Intermediate.DAO.Person;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class avgAge {
    public static void main(String[] args) {
        List<Person> persons = Arrays.asList(
                new Person("Amit",23),
                new Person("Bahadur",27),
                new Person("Dinesh",30),
                new Person("Chintu", 32)
        );

        //Q. Calculate the average age of a list of person objects using java streams
        double average = persons.stream().mapToInt(Person::getAge).average().orElse(0.0);
        System.out.println(average);
    }
}
