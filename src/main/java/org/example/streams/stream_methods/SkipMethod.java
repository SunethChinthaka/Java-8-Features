package org.example.streams.stream_methods;

import java.util.Arrays;
import java.util.List;

/**
 * Used for skipping the first n elements of the stream.
 */
public class SkipMethod {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        // Skip the first two numbers
        List<Integer> result = numbers.stream()
                .skip(2)
                .toList();

        System.out.println(result);  // Output: [3, 4, 5]

    }
}
