package org.example.streams.sort;

import org.example.streams.employee.Employee;
import org.example.streams.employee.EmployeeTestDB;

import java.util.*;

public class SortListDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(8);
        list.add(3);
        list.add(12);
        list.add(4);

        Collections.sort(list); // ascending order
        Collections.reverse(list); // descending order
        System.out.println(list);

        System.out.println();
        System.out.println("-----Using Stream-----");

        list.stream().sorted().forEach(s -> System.out.println(s)); // ascending order
        System.out.println();
        list.stream().sorted(Comparator.reverseOrder()).forEach(s -> System.out.println(s)); // descending order

        System.out.println();
        System.out.println("----Employee Example----");

        List<Employee> employees = EmployeeTestDB.getEmployees();

        // using separate EmployeeComparator
//        Collections.sort(employees, new EmployeeComparator());

        //using Anonymous of Comparator Interface
        /*Collections.sort(employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return (int) (o1.getSalary() - o2.getSalary());
            }
        });*/

        //optimal implementation
        Collections.sort(employees, (o1, o2) -> (int) (o1.getSalary() - o2.getSalary()));
        System.out.println(employees);

        System.out.println();

        //using streams
        System.out.println("Using Stream");
        System.out.println("Sorting Based on Employee Salary");

        /*employees.stream()
                .sorted((o1, o2) -> (int) (o1.getSalary() - o2.getSalary()))
                .forEach(System.out::println);*/

        //using streams in optimal way
        employees.stream()
                .sorted(Comparator.comparing(employee -> employee.getSalary()))
                .forEach(System.out::println);

        System.out.println();

        //soring based on the name
        System.out.println("Sorting Based on Employee Name");
        employees.stream()
                .sorted(Comparator.comparing(Employee::getName))
                .forEach(System.out::println);


    }

}
/*class EmployeeComparator implements Comparator<Employee>{

    @Override
    public int compare(Employee o1, Employee o2) {
        return (int) (o1.getSalary() - o2.getSalary()); //salary based on ascending order
//        return (int) (o2.getSalary() - o1.getSalary()); //salary based on descending order
    }
}*/
