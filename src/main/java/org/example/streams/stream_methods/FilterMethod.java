package org.example.streams.stream_methods;

import java.util.Arrays;
import java.util.List;

/**
 * Used for filtering elements based on a condition.
 */
public class FilterMethod {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "orange", "grape", "kiwi", "avocado");

        // Filter words starting with 'a'
        List<String> filteredWords = words.stream()
                .filter(s -> s.startsWith("a"))
                .toList();

        System.out.println(filteredWords);  // Output: [apple, avocado]

    }
}
