package collectors_examples;

import org.junit.Test;
import stream_api_examples.Employee;

import java.util.List;
import java.util.Map;

import static java.util.Arrays.asList;
import static org.junit.Assert.*;

/**
 * @author Evgeny Borisov
 */
public class EmployeeUtilsTest {

    private List<Employee> employees = asList(
            new Employee(13),
            new Employee(3),
            new Employee(23),
            new Employee(33),
            new Employee(34)
            );

    @Test
    public void groupBySeniority() {
        Map<Seniority, List<Employee>> map = EmployeeUtils.groupBySeniority(employees);
        System.out.println("map = " + map);

        Map<Seniority, Long> countMap = EmployeeUtils.groupBySeniorityCount(employees);
        System.out.println("countMap = " + countMap);
    }
}




