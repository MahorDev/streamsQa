package streams;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Exercise 2: Calculate average of a list of integers
 *
 * Separate practice class for independent execution in IntelliJ IDEA.
 */
public class AdvancedStreamPractice02 {

    // Practice note: kept this example small so the result is easy to verify.
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(7, 14, 21, 28, 35, 42, 55, 68, 81);

double avgVal = numbers.stream().mapToInt(Integer::intValue).average().orElse(0.0);
        System.out.println("2. Average: " + avgVal);
    }
}
