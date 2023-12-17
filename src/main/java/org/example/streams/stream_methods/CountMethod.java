package org.example.streams.stream_methods;

import java.util.Arrays;
import java.util.List;

/**
 * Used for counting the number of elements in the stream.
 */
public class CountMethod {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "orange", "grape", "kiwi");

        // Count the number of words starting with 'a'
        long count = words.stream()
                .filter(s -> s.startsWith("a"))
                .count();

        System.out.println(count);  // Output: 1

    }
}
