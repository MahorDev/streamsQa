package streams;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Exercise 8: Check if two collections are permutations of each other (multiset equality)
 *
 * Separate practice class for independent execution in IntelliJ IDEA.
 */
public class CollectionPractice08 {

    // Practice note: kept this example small so the result is easy to verify.
    public static void main(String[] args) {
List<Integer> permA = Arrays.asList(10, 20, 20, 30);
        List<Integer> permB = Arrays.asList(20, 30, 20, 10);
        Map<Integer, Long> freqA = permA.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        Map<Integer, Long> freqB = permB.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        boolean isPermutation = freqA.equals(freqB);
        System.out.println("8. Is permutation (matching counts): " + isPermutation);
    }
}
