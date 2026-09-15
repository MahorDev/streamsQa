package streams;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Exercise 7: Count total number of unique elements
 *
 * Separate practice class for independent execution in IntelliJ IDEA.
 */
public class AdvancedStreamPractice07 {

    // Practice note: kept this example small so the result is easy to verify.
    public static void main(String[] args) {
        List<Integer> frequencyInput = Arrays.asList(10, 20, 20, 30, 30, 30, 40);

long uniqueCount = frequencyInput.stream().distinct().count();
        System.out.println("7. Total unique elements count: " + uniqueCount);
    }
}
