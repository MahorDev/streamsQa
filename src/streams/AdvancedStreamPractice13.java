package streams;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Exercise 13: Group a collection of strings based on starting character
 *
 * Separate practice class for independent execution in IntelliJ IDEA.
 */
public class AdvancedStreamPractice13 {

    // Practice note: kept this example small so the result is easy to verify.
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Apple", "Banana", "Avocado", "Cherry", "Apricot");

Map<Character, List<String>> groupedByFirstChar = words.stream()
                .collect(Collectors.groupingBy(w -> w.charAt(0)));
        System.out.println("13. Grouped by start character: " + groupedByFirstChar);
    }
}
