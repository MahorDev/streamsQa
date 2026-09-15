package streams;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Exercise 17: Convert one collection type into another (List to Set and back again)
 *
 * Separate practice class for independent execution in IntelliJ IDEA.
 */
public class CollectionPractice17 {

    // Practice note: kept this example small so the result is easy to verify.
    public static void main(String[] args) {
List<Integer> startList = Arrays.asList(10, 20, 10, 30);
        Set<Integer> setCon = new LinkedHashSet<>(startList);
        List<Integer> listCon = new ArrayList<>(setCon);
        System.out.println("17. List -> Set -> List: " + listCon);
    }
}
