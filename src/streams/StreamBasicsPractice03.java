package streams;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Exercise 3: Filter out non-numeric strings from a mixed list
 *
 * Separate practice class for independent execution in IntelliJ IDEA.
 */
public class StreamBasicsPractice03 {

    // Practice note: kept this example small so the result is easy to verify.
    public static void main(String[] args) {
        List<String> words = Arrays.asList("java", "radar", "404", "level", null, "stream", "lambda");

List<String> numericStrings = words.stream()
                .filter(Objects::nonNull)
                .filter(w -> w.matches("\\d+"))
                .toList();
        System.out.println("3. Numeric strings: " + numericStrings);
    }
}
