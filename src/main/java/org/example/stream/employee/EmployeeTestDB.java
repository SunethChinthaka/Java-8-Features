package org.example.stream.employee;

import java.util.ArrayList;
import java.util.List;

// DAO Layer
public class EmployeeTestDB {

    public static List<Employee> getEmployees() {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee(176, "Roshan", "IT", 600000));
        list.add(new Employee(388, "Binura", "CIVIL", 900000));
        list.add(new Employee(470, "Bimal", "DEFENCE", 500000));
        list.add(new Employee(624, "Shan", "CORE", 400000));
        list.add(new Employee(176, "Prasad", "SOCIAL", 1200000));
        return list;
    }
}
