package streams;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Exercise 9: Check if all elements in a collection are unique
 *
 * Separate practice class for independent execution in IntelliJ IDEA.
 */
public class CollectionPractice09 {

    // Practice note: kept this example small so the result is easy to verify.
    public static void main(String[] args) {
List<Integer> uniqueTestList = Arrays.asList(10, 20, 30, 10);
        boolean allUnique = uniqueTestList.size() == new HashSet<>(uniqueTestList).size();
        System.out.println("9. All elements unique: " + allUnique);
    }
}
