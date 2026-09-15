package streams;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Exercise 8: Sort a list of strings in reverse order
 *
 * Separate practice class for independent execution in IntelliJ IDEA.
 */
public class StreamBasicsPractice08 {

    // Practice note: kept this example small so the result is easy to verify.
    public static void main(String[] args) {
        List<String> words = Arrays.asList("java", "radar", "404", "level", null, "stream", "lambda");
        List<String> nonNullWords = words.stream().filter(Objects::nonNull).toList();

List<String> reverseSorted = nonNullWords.stream()
                .sorted(Comparator.reverseOrder())
                .toList();
        System.out.println("8. Strings in reverse order: " + reverseSorted);
    }
}
