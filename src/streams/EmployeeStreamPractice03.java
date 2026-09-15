package streams;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Exercise 3: Retrieve list of all employee names converted to uppercase
 *
 * Separate practice class for independent execution in IntelliJ IDEA.
 */
public class EmployeeStreamPractice03 {

    // Practice note: kept this example small so the result is easy to verify.
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>(Arrays.asList(
                new Employee(101, "Neha", "Engineering", 88000, 28),
                new Employee(102, "Arjun", "HR", 62000, 35),
                new Employee(103, "Smita", "HR", 76000, 32),
                new Employee(104, "Ravi", "Engineering", 97000, 36),
                new Employee(105, "Meera", "Finance", 71000, 26),
                new Employee(106, "Farhan", "Engineering", 121000, 38),
                new Employee(107, "Aman", "IT", 57000, 42),
                new Employee(108, "Aisha", "IT", 96000, 45)
        ));

List<String> upperNames = employees.stream()
                .map(Employee::getName)
                .map(String::toUpperCase)
                .toList();
        System.out.println("3. Uppercase employee names: " + upperNames);
    }
}
