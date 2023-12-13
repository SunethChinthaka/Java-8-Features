package org.example.optional;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalDemo {
    public static void main(String[] args) throws Exception {
        Customer customer = new Customer(
                101,
                "john",
                "john@gmail.com",
                Arrays.asList("397937955", "21654725"));

       /* Customer customer = new Customer(
                101,
                "john",
                null,
                Arrays.asList("397937955", "21654725"));*/

        //Optional.empty()
        System.out.println("-----Optional.empty()-----");
        Optional<Object> empty = Optional.empty();
        System.out.println(empty);

        System.out.println();

        //Optional.of()
        /*System.out.println("-----Optional.of()-----");
        Optional<String> emailOptional = Optional.of(customer.getEmail());
        System.out.println(emailOptional);*/

        System.out.println();

        //Optional.ofNullable()
        System.out.println("-----Optional.ofNullable()-----");
//        Optional<String> emailOptional2 = Optional.ofNullable(customer.getEmail());
        Optional<String> emailOptional2 = Optional.ofNullable(String.valueOf(customer.getEmail()));
        System.out.println(emailOptional2);

        //if email is null then it will not print any response otherwise if didn't check the condition it will throw NoSuchElementException
        /*Optional<String> emailOptional3 = Optional.ofNullable(customer.getEmail());
        if (emailOptional3.isPresent()){
            System.out.println(emailOptional3);
        }*/

        // this will print default email address if the email is null
        System.out.println(emailOptional2.orElse("default@email.com"));

        System.out.println(emailOptional2.orElseThrow(() -> new IllegalArgumentException("email not present")));

        System.out.println(emailOptional2.map(String::toUpperCase).orElseGet(() -> "default@email.com"));

        System.out.println();
        System.out.println("------Using Stream--------");
        getCustomerByEmail("abc@gmail.com");


    }

    public static Customer getCustomerByEmail(String email) throws Exception {
        List<Customer> customerList = CustomerTestDB.getAll();
        return customerList.stream()
                .filter(customer -> customer.getEmail().equals(email))
                .findAny()
                .orElseThrow(() -> new Exception("Invalid Customer Email!"));
    }
}
