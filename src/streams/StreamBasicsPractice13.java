package streams;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Exercise 13: Flatten a list of lists using flatMap
 *
 * Separate practice class for independent execution in IntelliJ IDEA.
 */
public class StreamBasicsPractice13 {

    // Practice note: kept this example small so the result is easy to verify.
    public static void main(String[] args) {
List<List<Integer>> nestedLists = Arrays.asList(
                Arrays.asList(1, 2),
                Arrays.asList(3, 4),
                Arrays.asList(5, 6)
        );
        List<Integer> flatList = nestedLists.stream().flatMap(Collection::stream).toList();
        System.out.println("13. Flattened list: " + flatList);
    }
}
