package org.example.streams.map_reduce;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MapReduceExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 7, 8, 1, 5, 9);

        //normal way to get the sum of the numbers
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println("Sum = " + sum);
        System.out.println();

        //using stream
        System.out.println("-----using stream mapToInt-----");
        int sum2 = numbers.stream().mapToInt(Integer::intValue).sum();
        System.out.println("Sum = " + sum2);

        System.out.println();

        System.out.println("-----using stream reduce-----");
        Integer reduceSum = numbers.stream().reduce(0, (a, b) -> a + b);
        System.out.println("Sum = " + reduceSum);

        System.out.println();

        System.out.println("-----using stream reduce with method reference-----");
        Optional<Integer> reduceSumWithMR = numbers.stream().reduce(Integer::sum);
        System.out.println("Sum = " + reduceSumWithMR.get());

        System.out.println();

        System.out.println("----multiplying example----");
        Integer reduceMultiply = numbers.stream().reduce(1, (a, b) -> a * b);
        System.out.println("Multiply = " + reduceMultiply);

        System.out.println();

        System.out.println("----find max value example----");
        Integer maxValue = numbers.stream().reduce(0, (a, b) -> a > b ? a : b);
        System.out.println("Max Value = " + maxValue);

        System.out.println();

        System.out.println("----find max value with method reference example----");
        Integer maxValueMR = numbers.stream().reduce(Integer::max).get();
        System.out.println("Max Value = " + maxValueMR);

        System.out.println();

        System.out.println("----word list example----");
        List<String> words = Arrays.asList("Java", "JavaScript", "Python");
        String longestWord = words.stream()
                .reduce((word1, word2) -> word1.length() > word2.length() ? word1 : word2)
                .get();
        System.out.println("Longest Word: " + longestWord);

        System.out.println();
        System.out.println("******************************");
        System.out.println("------Employee Example--------");
        System.out.println("******************************");

        //filter -> get the employee who has grade = A
        //map -> get the employee salary

        System.out.println("Printing Grade A Employee's Average Salary");

       /* Double averageSalary = EmployeeTestDB.getEmployees().stream()
                .filter(employee -> employee.getGrade().equalsIgnoreCase("A"))
                .map(employee -> employee.getSalary())
                .mapToDouble(d -> d)
                .average().getAsDouble();*/

        Double averageSalary = EmployeeTestDB.getEmployees().stream()
                .filter(employee -> employee.getGrade().equalsIgnoreCase("A"))
                .map(Employee::getSalary)
                .mapToDouble(Double::doubleValue)
                .average().getAsDouble();

        System.out.println(averageSalary);

        System.out.println();

        System.out.println("Printing Grade A Employees Total Salary");
        Double totalSalary = EmployeeTestDB.getEmployees().stream()
                .filter(employee -> employee.getGrade().equalsIgnoreCase("A"))
                .map(Employee::getSalary)
                .mapToDouble(Double::doubleValue)
                .sum();

        System.out.println(totalSalary);

    }
}
