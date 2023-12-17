package org.example.streams.stream_methods;

import java.util.Arrays;
import java.util.List;

/**
 * Used for checking if any element matches a given condition.
 */
public class AnyMatchMethod {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        // Check if any number is even
        boolean hasEvenNumber = numbers.stream()
                .anyMatch(n -> n % 2 == 0);

        System.out.println(hasEvenNumber);  // Output: true

    }
}
