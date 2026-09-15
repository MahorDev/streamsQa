package streams;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Exercise 7: Check if one collection is a subset of another
 *
 * Separate practice class for independent execution in IntelliJ IDEA.
 */
public class CollectionPractice07 {

    // Practice note: kept this example small so the result is easy to verify.
    public static void main(String[] args) {
List<Integer> smallSub = Arrays.asList(10, 20);
        List<Integer> largeSup = Arrays.asList(10, 20, 30, 40);
        boolean isSubset = largeSup.containsAll(smallSub);
        System.out.println("7. Is small a subset of large: " + isSubset);
    }
}
