package streams;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Exercise 14: Find union and intersection of two collections
 *
 * Separate practice class for independent execution in IntelliJ IDEA.
 */
public class CollectionPractice14 {

    // Practice note: kept this example small so the result is easy to verify.
    public static void main(String[] args) {
        List<Integer> mergeA = Arrays.asList(10, 20, 30);
        List<Integer> mergeB = Arrays.asList(20, 30, 40);

Set<Integer> unionSet = new HashSet<>(mergeA);
        unionSet.addAll(mergeB);
        Set<Integer> interSet = new HashSet<>(mergeA);
        interSet.retainAll(mergeB);
        System.out.println("14. Union: " + unionSet + ", Intersection: " + interSet);
    }
}
