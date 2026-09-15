package streams;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Exercise 9: Find first non-repeating element in a collection
 *
 * Separate practice class for independent execution in IntelliJ IDEA.
 */
public class AdvancedStreamPractice09 {

    // Practice note: kept this example small so the result is easy to verify.
    public static void main(String[] args) {
List<Integer> nonRepInput = Arrays.asList(4, 5, 1, 2, 0, 4, 1, 2);
        Integer firstNonRepeatElem = nonRepInput.stream()
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream()
                .filter(entry -> entry.getValue() == 1L)
                .map(Map.Entry::getKey)
                .findFirst()
                .orElse(null);
        System.out.println("9. First non-repeating element: " + firstNonRepeatElem);
    }
}
