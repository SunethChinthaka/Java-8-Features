package org.example.streams.mapvsflatmap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CustomerTestDB {
    public static List<Customer> getAll() {
        return Stream.of(
                new Customer(101, "John", "john@gmail.com", Arrays.asList("397937955", "21654725")),
                new Customer(102, "Smith", "smith@gmail.com", Arrays.asList("89563865", "2487238947")),
                new Customer(103, "Peter", "peter@gmail.com", Arrays.asList("38946328654", "3286487236")),
                new Customer(104, "Kelly", "kelly@gmail.com", Arrays.asList("389246829364", "948609467"))
        ).collect(Collectors.toList());
    }
}
