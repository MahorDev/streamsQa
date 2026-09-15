package streams;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Exercise 15: Find common elements across multiple collections
 *
 * Separate practice class for independent execution in IntelliJ IDEA.
 */
public class CollectionPractice15 {

    // Practice note: kept this example small so the result is easy to verify.
    public static void main(String[] args) {
List<Integer> col1 = Arrays.asList(1, 2, 3, 4);
        List<Integer> col2 = Arrays.asList(2, 3, 5, 6);
        List<Integer> col3 = Arrays.asList(3, 2, 7, 8);
        Set<Integer> commonAcrossAll = new HashSet<>(col1);
        commonAcrossAll.retainAll(col2);
        commonAcrossAll.retainAll(col3);
        System.out.println("15. Common across multiple collections: " + commonAcrossAll);
    }
}
