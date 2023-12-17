package org.example.streams.stream_methods;

import java.util.Arrays;
import java.util.List;

/**
 * Used for combining elements to produce a single result.
 */
public class ReduceMethod {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        // Sum of all numbers
        int sum = numbers.stream()
                .reduce(0, (a, b) -> a + b);

        System.out.println(sum);  // Output: 15

    }
}
