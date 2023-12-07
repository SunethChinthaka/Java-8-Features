package org.example.functional;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateDemo {
    public static void main(String[] args) {

        Predicate<Integer> predicate = i -> i % 2 == 0;
        System.out.println(predicate.test(56));

        //////////////////////////////////////
        System.out.println();

        //Practical Example
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
        list1.stream()
                .filter(i -> i % 2 == 0)
                .forEach(i -> System.out.println("Print Event: " + i));
    }
}

// Normal Way

/*public class PredicateDemo implements Predicate<Integer> {
    @Override
    public boolean test(Integer i) {
        if (i % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Predicate<Integer> predicate=new PredicateDemo();
        System.out.println(predicate.test(4));
    }
}*/
