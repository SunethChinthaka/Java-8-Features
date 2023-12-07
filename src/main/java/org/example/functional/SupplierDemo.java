package org.example.functional;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierDemo {
    public static void main(String[] args) {
        Supplier supplier = () -> "Welcome to Suneth Chinthaka YouTube Channel!";
        System.out.println(supplier.get());

        //////////////////////////////////////
        System.out.println();

//        List<String> list= Arrays.asList("a", "b", "c", "d", "e", "f");
        List<String> list = Arrays.asList();
        String s = list.stream()
                .findAny()
                .orElseGet(() -> "Subscribe!");
        System.out.println(s);
    }
}

//Normal Way
/*public class SupplierDemo implements Supplier<String> {
    @Override
    public String get() {
        return "Hello World";
    }

    public static void main(String[] args) {
        Supplier<String> supplier = new SupplierDemo();
        System.out.println(supplier.get());
    }
}*/
