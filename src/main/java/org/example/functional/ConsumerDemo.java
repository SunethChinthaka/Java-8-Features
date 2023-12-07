package org.example.functional;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;


// Normal Way
/*public class ConsumerDemo implements Consumer<Integer> {
    @Override
    public void accept(Integer i) {
        System.out.println("Printing: " + i);
    }
}*/

public class ConsumerDemo {
    public static void main(String[] args) {
        Consumer<Integer> consumer = i -> System.out.println("Printing: " + i);
        consumer.accept(25);

//        Integer[] array = {1, 2, 3, 4, 5}; //you can pass the array to thr Arrays.asList()
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println(list1);

        list1.forEach(i -> System.out.println("Printing: " + i));
    }
}
