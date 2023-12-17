package org.example.streams.stream_methods;


import java.util.Arrays;
import java.util.List;

/**
 * Used for sorting elements.
 */
public class SortedMethod {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "orange", "grape", "kiwi");

        // Sort words alphabetically
        List<String> sortedWords = words.stream()
                .sorted()
                .toList();

        System.out.println(sortedWords);  // Output: [apple, banana, grape, kiwi, orange]

    }
}
