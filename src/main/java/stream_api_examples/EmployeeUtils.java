package stream_api_examples;

import java.util.List;

/**
 * @author Evgeny Borisov
 */
public class EmployeeUtils {
    public static int totalSalary(List<Employee> employees) {


        return employees.stream()
                .mapToInt(Employee::getSalary)
                .sum();


//        Optional<Integer> optional = employees.stream()
//                .map(Employee::getSalary)
//                .reduce(Integer::sum);
//        return optional.orElse(10);

//        employees.stream().reduce((employee, employee2) -> employee.getSalary()+employee2.getSalary())
//        return 0;
    }
}
