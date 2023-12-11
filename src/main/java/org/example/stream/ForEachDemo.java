package org.example.stream;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

public class ForEachDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Harry");
        list.add("Hermione");
        list.add("Ron");
        list.add("Malfoy");

        //Normal Way
/*        for (String s : list) {
            System.out.println(s);
        }*/

        System.out.println();
        //Using StreamApi
        list.stream().forEach(i -> System.out.println(i));

        System.out.println();
        //Printing names that starting with "H"
        System.out.println("Printing names that starting with H:");
        for (String s : list) {
            if (s.startsWith("H")) {
                System.out.println(s);
            }
        }

        System.out.println();
        System.out.println("Printing names that starting with H using stream: ");
        list.stream()
                .filter(s -> s.startsWith("H"))
                .forEach(s -> System.out.println(s));

        ////////////////////////////////

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "a");
        map.put(2, "b");
        map.put(3, "c");
        map.put(4, "d");

        System.out.println();
        map.forEach((key, value) -> System.out.println(key + ":" + value));
        map.entrySet().stream().forEach((entry) -> System.out.println(entry));

        System.out.println();
        System.out.println("Printing only even keys");
        map.entrySet().stream()
                .filter(i ->i.getKey()%2 == 0)
                .forEach((entry) -> System.out.println(entry));


        System.out.println();
        // Normal Internal Structure of forEach(
        Consumer consumer = (t) -> System.out.println(t);
        for (String s : list) {
            consumer.accept(s);
        }
    }
}
