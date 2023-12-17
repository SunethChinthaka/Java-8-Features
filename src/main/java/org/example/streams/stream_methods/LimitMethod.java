package org.example.streams.stream_methods;

import java.util.Arrays;
import java.util.List;

/**
 * Used for limiting the number of elements in the stream.
 */
public class LimitMethod {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        // Limit to the first three numbers
        List<Integer> result = numbers.stream()
                .limit(3)
                .toList();

        System.out.println(result);  // Output: [1, 2, 3]

    }
}
