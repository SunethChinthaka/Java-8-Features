package org.example.streams.stream_methods;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Used for accumulating elements into a collection.
 */

public class CollectMethod {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "orange", "grape", "kiwi");

        // Collect words starting with 'a' into a list
        List<String> selectedWords = words.stream()
                .filter(s -> s.startsWith("a"))
                .collect(Collectors.toList());

        System.out.println(selectedWords);  // Output: [apple]

    }
}
