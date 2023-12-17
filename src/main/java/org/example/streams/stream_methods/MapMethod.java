package org.example.streams.stream_methods;

import java.util.Arrays;
import java.util.List;

/**
 * Used for transforming elements using a given function.
 */
public class MapMethod {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "orange", "grape", "kiwi");

        // Convert words to uppercase
        List<String> uppercasedWords = words.stream()
                .map(String::toUpperCase)
                .toList();

        System.out.println(uppercasedWords);  // Output: [APPLE, BANANA, ORANGE, GRAPE, KIWI]

    }
}
