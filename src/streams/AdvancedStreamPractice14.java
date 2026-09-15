package streams;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Exercise 14: Partition integers based on whether they are greater than 50
 *
 * Separate practice class for independent execution in IntelliJ IDEA.
 */
public class AdvancedStreamPractice14 {

    // Practice note: kept this example small so the result is easy to verify.
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(7, 14, 21, 28, 35, 42, 55, 68, 81);

Map<Boolean, List<Integer>> gt50Partition = numbers.stream()
                .collect(Collectors.partitioningBy(n -> n > 50));
        System.out.println("14. Partitioned > 50: " + gt50Partition);
    }
}
