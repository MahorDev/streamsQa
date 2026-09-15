package streams;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Exercise 11: Retrieve top 3 most frequently occurring elements
 *
 * Separate practice class for independent execution in IntelliJ IDEA.
 */
public class AdvancedStreamPractice11 {

    // Practice note: kept this example small so the result is easy to verify.
    public static void main(String[] args) {
        List<Integer> frequencyInput = Arrays.asList(10, 20, 20, 30, 30, 30, 40);
        Map<Integer, Long> elementFrequency = frequencyInput.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

List<Integer> top3Frequent = elementFrequency.entrySet().stream()
                .sorted(Map.Entry.<Integer, Long>comparingByValue().reversed())
                .limit(3)
                .map(Map.Entry::getKey)
                .toList();
        System.out.println("11. Top 3 most frequent elements: " + top3Frequent);
    }
}
