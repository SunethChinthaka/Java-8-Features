package org.example.streams.parallel_streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class EmployeeTestDB {
    public static List<Employee> getEmployees() {
        List<Employee> employeeList = new ArrayList<>();
        for (int i = 1; i < 1000; i++) {
            employeeList.add(new Employee(i, "User" + i, "A", Double.valueOf(new Random().nextInt(1000 * 100))));
        }
        return employeeList;
    }
}
