package org.example.stream.employee;

import java.util.List;
import java.util.stream.Collectors;

public class TaxService {

    public static void main(String[] args) {
        System.out.println(findTaxEligibleUsers("tax"));
    }

    public static List<Employee> findTaxEligibleUsers(String salary) {
        /*if (salary.equalsIgnoreCase("tax")){
            return EmployeeTestDB.getEmployees().stream()
                    .filter(employee -> employee.getSalary()>=500000)
                    .collect(Collectors.toList());
        }else {
            return EmployeeTestDB.getEmployees().stream()
                    .filter(employee -> employee.getSalary()<500000)
                    .collect(Collectors.toList());
        }*/

        return (salary.equalsIgnoreCase("tax"))
                ?
                EmployeeTestDB.getEmployees().stream()
                        .filter(employee -> employee.getSalary() >= 500000)
                        .collect(Collectors.toList())
                :
                EmployeeTestDB.getEmployees().stream()
                        .filter(employee -> employee.getSalary() < 500000)
                        .collect(Collectors.toList());

    }
}
