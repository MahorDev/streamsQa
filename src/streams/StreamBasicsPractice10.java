package streams;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Exercise 10: Retrieve the first element if present
 *
 * Separate practice class for independent execution in IntelliJ IDEA.
 */
public class StreamBasicsPractice10 {

    // Practice note: kept this example small so the result is easy to verify.
    public static void main(String[] args) {
        List<String> words = Arrays.asList("java", "radar", "404", "level", null, "stream", "lambda");
        List<String> nonNullWords = words.stream().filter(Objects::nonNull).toList();

Optional<String> firstString = nonNullWords.stream().findFirst();
        System.out.println("10. First string present: " + firstString.orElse("None"));
    }
}
