package org.example.streams.stream_methods;

import java.util.Arrays;
import java.util.List;

/**
 * Used for checking if none of the elements match a given condition.
 */
public class NonMatchMethod {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 3, 5, 7, 9);

        // Check if none of the numbers are even
        boolean noneEven = numbers.stream()
                .noneMatch(n -> n % 2 == 0);

        System.out.println(noneEven);  // Output: true

    }
}
