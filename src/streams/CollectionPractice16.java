package streams;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Exercise 16: Remove all elements of one collection from another
 *
 * Separate practice class for independent execution in IntelliJ IDEA.
 */
public class CollectionPractice16 {

    // Practice note: kept this example small so the result is easy to verify.
    public static void main(String[] args) {
List<Integer> removeFromList = new ArrayList<>(Arrays.asList(10, 20, 30, 40));
        removeFromList.removeAll(Arrays.asList(20, 40));
        System.out.println("16. List after removeAll: " + removeFromList);
    }
}
