package org.example.streams.stream_methods;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * Used for finding any element in the stream.
 */
public class FindAnyMethod {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "orange", "grape", "kiwi");

        // Find any word starting with 'a'
        Optional<String> anyMatch = words.stream()
                .filter(s -> s.startsWith("a"))
                .findAny();

        System.out.println(anyMatch.orElse("No match"));  // Output: apple (or any other matching word)

    }
}
