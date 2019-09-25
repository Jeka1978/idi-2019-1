package stream_api_examples;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

import static java.util.Arrays.asList;
import static org.junit.Assert.*;

/**
 * @author Evgeny Borisov
 */
public class EmployeeUtilsTest {

    @Test
    public void totalSalary() {

        List<Employee> employees = asList(
                new Employee(10),
                new Employee(11),
                new Employee(12),
                new Employee(20),
                new Employee(30)
        );

        int total = EmployeeUtils.totalSalary(employees);

        Assert.assertEquals(83,total);









    }
}