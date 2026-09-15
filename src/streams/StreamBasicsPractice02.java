package streams;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Exercise 2: Filter palindromic strings from a list
 *
 * Separate practice class for independent execution in IntelliJ IDEA.
 */
public class StreamBasicsPractice02 {

    // Practice note: kept this example small so the result is easy to verify.
    public static void main(String[] args) {
        List<String> words = Arrays.asList("java", "radar", "404", "level", null, "stream", "lambda");

List<String> palindromicStrings = words.stream()
                .filter(Objects::nonNull)
                .filter(w -> w.contentEquals(new StringBuilder(w).reverse()))
                .toList();
        System.out.println("2. Palindromic strings: " + palindromicStrings);
    }
}
