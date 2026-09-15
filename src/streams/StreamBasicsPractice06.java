package streams;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Exercise 6: Transform a list of strings into a list of their respective lengths
 *
 * Separate practice class for independent execution in IntelliJ IDEA.
 */
public class StreamBasicsPractice06 {

    // Practice note: kept this example small so the result is easy to verify.
    public static void main(String[] args) {
        List<String> words = Arrays.asList("java", "radar", "404", "level", null, "stream", "lambda");
        List<String> nonNullWords = words.stream().filter(Objects::nonNull).toList();

List<Integer> wordLengths = nonNullWords.stream()
                .map(String::length)
                .toList();
        System.out.println("6. String lengths: " + wordLengths);
    }
}
