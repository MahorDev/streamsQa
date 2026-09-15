package streams;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Exercise 22: Generate all subsets of a given collection
 *
 * Separate practice class for independent execution in IntelliJ IDEA.
 */
public class AdvancedStreamPractice22 {

    // Practice note: kept this example small so the result is easy to verify.
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(7, 14, 21, 28, 35, 42, 55, 68, 81);

System.out.print("22. Subsets of [1, 2, 3]: ");
        generateSubsets(Arrays.asList(1, 2, 3), 0, new ArrayList<>());
        System.out.println();
    }


    private static void generateSubsets(List<Integer> numbers, int index, List<Integer> current) {
        if (index == numbers.size()) {
            System.out.print(current + " ");
            return;
        }

        // Choice 1: do not include this value.
        generateSubsets(numbers, index + 1, current);

        // Choice 2: include this value.
        current.add(numbers.get(index));
        generateSubsets(numbers, index + 1, current);

        // Backtrack before returning to the previous call.
        current.remove(current.size() - 1);
    }
}
