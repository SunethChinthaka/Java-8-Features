package org.example.streams.stream_methods;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Used for removing duplicate elements.
 */
public class DistinctMethod {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 2, 3, 4, 4, 5);

        // Get distinct numbers
        List<Integer> distinctNumbers = numbers.stream()
                .distinct()
                .toList();

        System.out.println(distinctNumbers);  // Output: [1, 2, 3, 4, 5]

    }
}
