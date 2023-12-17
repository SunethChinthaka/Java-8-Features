package org.example.streams.stream_methods;

import java.util.Arrays;
import java.util.List;

/**
 * Used for flattening the elements of nested collections.
 */
public class FlatMapMethod {
    public static void main(String[] args) {
        List<List<String>> listOfLists = Arrays.asList(
                Arrays.asList("apple", "orange"),
                Arrays.asList("banana", "kiwi"),
                Arrays.asList("grape", "melon")
        );

        // Flatten the nested lists
        List<String> flatList = listOfLists.stream()
                .flatMap(List::stream)
                .toList();

        System.out.println(flatList);  // Output: [apple, orange, banana, kiwi, grape, melon]

    }
}
