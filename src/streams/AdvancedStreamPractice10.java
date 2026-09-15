package streams;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Exercise 10: Find most frequently occurring element
 *
 * Separate practice class for independent execution in IntelliJ IDEA.
 */
public class AdvancedStreamPractice10 {

    // Practice note: kept this example small so the result is easy to verify.
    public static void main(String[] args) {
        List<Integer> frequencyInput = Arrays.asList(10, 20, 20, 30, 30, 30, 40);
        Map<Integer, Long> elementFrequency = frequencyInput.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

Integer mostFrequent = elementFrequency.entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .orElse(null);
        System.out.println("10. Most frequent element: " + mostFrequent);
    }
}
