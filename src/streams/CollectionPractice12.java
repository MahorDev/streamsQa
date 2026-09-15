package streams;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Exercise 12: Copy elements from one collection to another while preserving order
 *
 * Separate practice class for independent execution in IntelliJ IDEA.
 */
public class CollectionPractice12 {

    // Practice note: kept this example small so the result is easy to verify.
    public static void main(String[] args) {
List<Integer> srcList = Arrays.asList(10, 20, 30);
        List<Integer> destList = new ArrayList<>(srcList);
        System.out.println("12. Copied list preserving order: " + destList);
    }
}
