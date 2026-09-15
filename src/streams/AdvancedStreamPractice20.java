package streams;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Exercise 20: Find all unique pairs whose sum equals a target value
 *
 * Separate practice class for independent execution in IntelliJ IDEA.
 */
public class AdvancedStreamPractice20 {

    // Practice note: kept this example small so the result is easy to verify.
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(7, 14, 21, 28, 35, 42, 55, 68, 81);

List<Integer> pairNumbers = Arrays.asList(2, 4, 3, 5, 6, -2, 4, 7, 8, 9);
        int targetSum = 7;
        Set<Integer> pairSeen = new HashSet<>();
        Set<String> uniqueSumPairs = new LinkedHashSet<>();
        for (int num : pairNumbers) {
            int complement = targetSum - num;
            if (pairSeen.contains(complement)) {
                uniqueSumPairs.add("(" + Math.min(num, complement) + ", " + Math.max(num, complement) + ")");
            }
            pairSeen.add(num);
        }
        System.out.println("20. Unique pairs summing to " + targetSum + ": " + uniqueSumPairs);
    }
}
