package streams;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Exercise 13: Merge two collections and remove duplicate elements
 *
 * Separate practice class for independent execution in IntelliJ IDEA.
 */
public class CollectionPractice13 {

    // Practice note: kept this example small so the result is easy to verify.
    public static void main(String[] args) {
List<Integer> mergeA = Arrays.asList(10, 20, 30);
        List<Integer> mergeB = Arrays.asList(20, 30, 40);
        Set<Integer> mergedNoDupes = new LinkedHashSet<>(mergeA);
        mergedNoDupes.addAll(mergeB);
        System.out.println("13. Merged without duplicates: " + mergedNoDupes);
    }
}
