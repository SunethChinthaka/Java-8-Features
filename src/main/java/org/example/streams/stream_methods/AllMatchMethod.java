package org.example.streams.stream_methods;

import java.util.Arrays;
import java.util.List;

/**
 * Used for checking if all elements match a given condition.
 */
public class AllMatchMethod {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2, 4, 6, 8, 10);

        // Check if all numbers are even
        boolean allEven = numbers.stream()
                .allMatch(n -> n % 2 == 0);

        System.out.println(allEven);  // Output: true

    }
}
