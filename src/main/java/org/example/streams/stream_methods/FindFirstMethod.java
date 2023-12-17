package org.example.streams.stream_methods;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * Used for finding the first element in the stream.
 */
public class FindFirstMethod {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "orange", "grape", "kiwi");

        // Find the first word starting with 'a'
        Optional<String> firstMatch = words.stream()
                .filter(s -> s.startsWith("a"))
                .findFirst();

        System.out.println(firstMatch.orElse("No match"));  // Output: apple

    }
}
