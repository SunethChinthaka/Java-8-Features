package org.example.stream.map_reduce;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmployeeTestDB {
    public static List<Employee> getEmployees() {
        return Stream.of(new Employee(101, "John", "A", 60000),
                        new Employee(109, "Peter", "B", 30000),
                        new Employee(102, "Mark", "A", 80000),
                        new Employee(103, "Kim", "A", 90000),
                        new Employee(104, "Jack", "C", 15000))
                .collect(Collectors.toList());
    }
}
