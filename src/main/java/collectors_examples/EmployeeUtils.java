package collectors_examples;


import stream_api_examples.Employee;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.groupingBy;

/**
 * @author Evgeny Borisov
 */
public class EmployeeUtils {
    public static Map<Seniority, List<Employee>> groupBySeniority(List<Employee> employees) {
        return employees.stream()
                .collect(
                        groupingBy(employee -> Seniority.findBySalary(employee.getSalary())));
    }

    public static Map<Seniority, Long> groupBySeniorityCount(List<Employee> employees) {
        return employees.stream()
                .collect(
                        groupingBy(employee -> Seniority.findBySalary(employee.getSalary()), Collectors.counting()));
    }
}
