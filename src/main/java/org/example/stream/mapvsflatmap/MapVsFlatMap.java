package org.example.stream.mapvsflatmap;

import java.util.List;
import java.util.stream.Collectors;

public class MapVsFlatMap {
    public static void main(String[] args) {
        List<Customer> customerList = CustomerTestDB.getAll();
        /*
         * List<Customer>  convert -> List<String> -> Data Transformation
         * Mapping : customer -> customer.getEmail()
         * customer -> customer.getEmail() -> One to One Mapping
         *
         */
        System.out.println("-----Using map()------");
        System.out.println("Based on Emails");
//        List<String> emailList = customerList.stream().map(customer -> customer.getEmail()).collect(Collectors.toList());
        List<String> emailList = customerList
                .stream()
                .map(Customer::getEmail)
                .collect(Collectors.toList());
        System.out.println(emailList);

        System.out.println();

        System.out.println("Based on Phone Numbers");
        //customer -> customer.getPhoneNumbers() -> One to One Mapping
        List<List<String>> phoneList = customerList
                .stream()
                .map(Customer::getPhoneNumbers)
                .collect(Collectors.toList());
        System.out.println(phoneList);

        System.out.println();

        System.out.println("-----Using flatMap()------");

        /*
         * List<Customer>  convert -> List<String> -> Data Transformation
         * Mapping : customer -> Phone Numbers
         * customer -> customer.getPhoneNumbers() -> One to Many Mapping
         * */
        List<String> phoneList2 = customerList
                .stream()
                .flatMap(customer -> customer.getPhoneNumbers().stream()).
                collect(Collectors.toList());
        System.out.println(phoneList2);
    }
}
