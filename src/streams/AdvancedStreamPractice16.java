package streams;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Exercise 16: Separate even and odd numbers into two distinct collections
 *
 * Separate practice class for independent execution in IntelliJ IDEA.
 */
public class AdvancedStreamPractice16 {

    // Practice note: kept this example small so the result is easy to verify.
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(7, 14, 21, 28, 35, 42, 55, 68, 81);

Map<Boolean, List<Integer>> partitioned = numbers.stream()
                .collect(Collectors.partitioningBy(n -> n % 2 == 0));
        List<Integer> evenCol = partitioned.get(true);
        List<Integer> oddCol = partitioned.get(false);
        System.out.println("16. Evens collection: " + evenCol + ", Odds collection: " + oddCol);
    }
}
