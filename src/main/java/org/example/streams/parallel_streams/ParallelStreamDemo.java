package org.example.streams.parallel_streams;

import java.util.List;
import java.util.stream.IntStream;

public class ParallelStreamDemo {
    public static void main(String[] args) {
        long startTime = 0;
        long endTime = 0;

        System.out.println("---Using Streams----");

        startTime = System.currentTimeMillis();
        IntStream.range(1, 100).forEach(System.out::println);
        endTime = System.currentTimeMillis();
        long durationS = endTime - startTime;

        System.out.println();
        System.out.println("--------------------------------");

        System.out.println("---Using Parallel Streams----");

        startTime = System.currentTimeMillis();
        IntStream.range(1, 100).parallel().forEach(System.out::println);
        endTime = System.currentTimeMillis();
        long durationPS = endTime - startTime;

        System.out.println("********************************");

        System.out.println("Time taken to complete using Streams: " + durationS);
        System.out.println("Time taken to complete using Parallel Streams: " + durationPS);

        System.out.println("********************************");

        System.out.println();

        System.out.println("---Using Streams----");
        IntStream.range(1, 10).forEach(x -> System.out.println("Thread Name: " + Thread.currentThread().getName() + " : " + x));

        System.out.println();

        System.out.println("---Using Parallel Streams----");
        IntStream.range(1, 10).parallel().forEach(x -> System.out.println("Thread Name: " + Thread.currentThread().getName() + " : " + x));

        System.out.println();
        System.out.println("******************************");
        System.out.println("------Employee Example--------");
        System.out.println("******************************");

        List<Employee> employeeList = EmployeeTestDB.getEmployees();

        System.out.println("---Using Streams----");

        startTime = System.currentTimeMillis();

        double salaryUsingStreams = employeeList.stream()
                .map(Employee::getSalary)
                .mapToDouble(Double::doubleValue)
                .average()
                .getAsDouble();

        endTime = System.currentTimeMillis();

        System.out.println("Normal Stream Duration : " + (endTime - startTime) + " || Average Salary : " + salaryUsingStreams);

        System.out.println();

        System.out.println("---Using Parallel Streams----");

        startTime = System.currentTimeMillis();

        double salaryUsingParallelStreams = employeeList.parallelStream()
                .map(Employee::getSalary)
                .mapToDouble(Double::doubleValue)
                .average()
                .getAsDouble();

        endTime = System.currentTimeMillis();

        System.out.println("Parallel Stream Duration : " + (endTime - startTime) + " || Average Salary : " + salaryUsingParallelStreams);

    }
}
