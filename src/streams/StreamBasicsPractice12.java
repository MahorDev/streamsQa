package streams;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Exercise 12: Join all strings in a list using a comma delimiter
 *
 * Separate practice class for independent execution in IntelliJ IDEA.
 */
public class StreamBasicsPractice12 {

    // Practice note: kept this example small so the result is easy to verify.
    public static void main(String[] args) {
        List<String> words = Arrays.asList("java", "radar", "404", "level", null, "stream", "lambda");
        List<String> nonNullWords = words.stream().filter(Objects::nonNull).toList();

String joinedWords = nonNullWords.stream().collect(Collectors.joining(", "));
        System.out.println("12. Joined strings: " + joinedWords);
    }
}
