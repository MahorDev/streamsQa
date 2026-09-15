package streams;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Exercise 21: Find longest sequence of consecutive numbers
 *
 * Separate practice class for independent execution in IntelliJ IDEA.
 */
public class AdvancedStreamPractice21 {

    // Practice note: kept this example small so the result is easy to verify.
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(7, 14, 21, 28, 35, 42, 55, 68, 81);

List<Integer> consecNums = Arrays.asList(100, 4, 200, 1, 3, 2);
        Set<Integer> consecSet = new HashSet<>(consecNums);
        int longestStreak = 0;
        for (int val : consecSet) {
            if (!consecSet.contains(val - 1)) {
                int curr = val;
                int streak = 1;
                while (consecSet.contains(curr + 1)) {
                    curr++;
                    streak++;
                }
                longestStreak = Math.max(longestStreak, streak);
            }
        }
        System.out.println("21. Longest consecutive sequence length: " + longestStreak);
    }
}
