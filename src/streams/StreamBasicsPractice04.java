package streams;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Exercise 4: Remove all null values from a collection using streams
 *
 * Separate practice class for independent execution in IntelliJ IDEA.
 */
public class StreamBasicsPractice04 {

    // Practice note: kept this example small so the result is easy to verify.
    public static void main(String[] args) {
        List<String> words = Arrays.asList("java", "radar", "404", "level", null, "stream", "lambda");

List<String> nonNullWords = words.stream()
                .filter(Objects::nonNull)
                .toList();
        System.out.println("4. Null values removed: " + nonNullWords);
    }
}
