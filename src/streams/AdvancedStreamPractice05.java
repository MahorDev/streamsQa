package streams;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Exercise 5: Count frequency of each element in a collection
 *
 * Separate practice class for independent execution in IntelliJ IDEA.
 */
public class AdvancedStreamPractice05 {

    // Practice note: kept this example small so the result is easy to verify.
    public static void main(String[] args) {
List<Integer> frequencyInput = Arrays.asList(10, 20, 20, 30, 30, 30, 40);
        Map<Integer, Long> elementFrequency = frequencyInput.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println("5. Element frequencies: " + elementFrequency);
    }
}
