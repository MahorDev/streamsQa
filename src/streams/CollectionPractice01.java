package streams;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Exercise 1: Remove duplicate elements from a collection while maintaining insertion order
 *
 * Separate practice class for independent execution in IntelliJ IDEA.
 */
public class CollectionPractice01 {

    // Practice note: kept this example small so the result is easy to verify.
    public static void main(String[] args) {
List<Integer> listWithDupes = Arrays.asList(10, 20, 10, 30, 20);
        Set<Integer> uniquePreserved = new LinkedHashSet<>(listWithDupes);
        System.out.println("1. Remove dupes (maintain order): " + uniquePreserved);
    }
}
