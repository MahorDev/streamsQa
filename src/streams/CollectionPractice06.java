package streams;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Exercise 6: Check if two collections are equal, ignoring the order of elements
 *
 * Separate practice class for independent execution in IntelliJ IDEA.
 */
public class CollectionPractice06 {

    // Practice note: kept this example small so the result is easy to verify.
    public static void main(String[] args) {
List<Integer> c1 = Arrays.asList(10, 20, 30);
        List<Integer> c2 = Arrays.asList(30, 10, 20);
        boolean setsEqual = new HashSet<>(c1).equals(new HashSet<>(c2));
        System.out.println("6. Collections equal ignoring order: " + setsEqual);
    }
}
