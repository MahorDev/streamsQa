package streams;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Exercise 7: Remove duplicate elements from a list of integers using streams
 *
 * Separate practice class for independent execution in IntelliJ IDEA.
 */
public class StreamBasicsPractice07 {

    // Practice note: kept this example small so the result is easy to verify.
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2, 4, 6, 8, 10, 12, 14, 16, 18, 20);

List<Integer> dupesList = Arrays.asList(1, 2, 2, 3, 4, 4, 5);
        List<Integer> distinctInts = dupesList.stream().distinct().toList();
        System.out.println("7. Distinct integers: " + distinctInts);
    }
}
