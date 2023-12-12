package org.example.stream.sort;

import org.example.stream.employee.Employee;

import java.util.*;

public class SortMapDemo {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("eight", 8);
        map.put("four", 4);
        map.put("ten", 10);
        map.put("two", 2);

        //Normal way to sort
        System.out.println("Normal way to sort");
        List<Map.Entry<String, Integer>> entries = new ArrayList<>(map.entrySet());
        /*Collections.sort(entries, new Comparator<Map.Entry<String, Integer>>() {

            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o1.getKey().compareTo(o2.getKey());//sorting based on key
            }
        });*/
        //using lambda function
        Collections.sort(entries, ((o1, o2) -> o1.getKey().compareTo(o2.getKey())));

        for (Map.Entry<String, Integer> entry : entries) {
            System.out.println(entry.getKey() + "=" + entry.getValue());
        }
        System.out.println();

        //using stream
        System.out.println("----Using Stream Comparing by Key----");
        map.entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .forEach(System.out::println);

        System.out.println("----Using Stream Comparing by Value----");
        map.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .forEach(System.out::println);

        System.out.println();

        System.out.println("*****************************");
        System.out.println("----Employee Example----");
        System.out.println("*****************************");
        System.out.println();

        Map<Employee, Integer> employeeMap = new TreeMap<>((o1, o2) -> (int) (o1.getSalary() - o2.getSalary()));
        employeeMap.put(new Employee(176, "Roshan", "IT", 600000), 60);
        employeeMap.put(new Employee(388, "Binura", "CIVIL", 900000), 90);
        employeeMap.put(new Employee(470, "Bimal", "DEFENCE", 500000), 50);
        employeeMap.put(new Employee(624, "Shan", "CORE", 400000), 40);
        employeeMap.put(new Employee(284, "Prasad", "SOCIAL", 1200000), 120);

        System.out.println(employeeMap);
        System.out.println();
        System.out.println("-----Using Stream-------");
        employeeMap.entrySet().stream()
                .sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getSalary)))
                .forEach(System.out::println);
//        employeeMap.entrySet().stream().forEach(System.out::println);//?

    }
}
