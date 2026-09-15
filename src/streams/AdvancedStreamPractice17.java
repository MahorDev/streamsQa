package streams;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Exercise 17: Find all duplicate elements in a list
 *
 * Separate practice class for independent execution in IntelliJ IDEA.
 */
public class AdvancedStreamPractice17 {

    // Practice note: kept this example small so the result is easy to verify.
    public static void main(String[] args) {
        List<Integer> frequencyInput = Arrays.asList(10, 20, 20, 30, 30, 30, 40);

Set<Integer> allDupes = frequencyInput.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream()
                .filter(e -> e.getValue() > 1L)
                .map(Map.Entry::getKey)
                .collect(Collectors.toSet());
        System.out.println("17. All duplicate elements: " + allDupes);
    }
}
