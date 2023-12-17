package org.example.streams.stream_methods;

import java.util.Arrays;
import java.util.List;

/**
 * Used for performing an action on each element of the stream without modifying the stream.
 */
public class PeekMethod {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "orange", "grape", "kiwi");

        // Print each word and convert to uppercase
        List<String> modifiedWords = words.stream()
                .peek(System.out::println)
                .map(String::toUpperCase)
                .toList();

        System.out.println(modifiedWords);

    }
}
