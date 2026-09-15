package streams;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Exercise 19: Find smallest and largest elements in a single iteration
 *
 * Separate practice class for independent execution in IntelliJ IDEA.
 */
public class AdvancedStreamPractice19 {

    // Practice note: kept this example small so the result is easy to verify.
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(7, 14, 21, 28, 35, 42, 55, 68, 81);

int minSingle = numbers.get(0);
        int maxSingle = numbers.get(0);
        for (int val : numbers) {
            if (val < minSingle) minSingle = val;
            if (val > maxSingle) maxSingle = val;
        }
        System.out.println("19. Single iteration -> Min: " + minSingle + ", Max: " + maxSingle);
    }
}
