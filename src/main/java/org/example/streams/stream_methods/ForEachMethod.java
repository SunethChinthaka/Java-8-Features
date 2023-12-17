package org.example.streams.stream_methods;

import java.util.Arrays;
import java.util.List;

/**
 * Used for performing an action on each element.
 */
public class ForEachMethod {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "orange", "grape", "kiwi");

        // Print each word
        words.stream().forEach(System.out::println);

    }
}
