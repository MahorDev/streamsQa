package streams;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Exercise 5: Convert a list of strings to uppercase
 *
 * Separate practice class for independent execution in IntelliJ IDEA.
 */
public class StreamBasicsPractice05 {

    // Practice note: kept this example small so the result is easy to verify.
    public static void main(String[] args) {
        List<String> words = Arrays.asList("java", "radar", "404", "level", null, "stream", "lambda");
        List<String> nonNullWords = words.stream().filter(Objects::nonNull).toList();

List<String> upperStrings = nonNullWords.stream()
                .map(String::toUpperCase)
                .toList();
        System.out.println("5. Uppercase strings: " + upperStrings);
    }
}
