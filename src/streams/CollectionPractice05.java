package streams;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Exercise 5: Remove elements satisfying a condition safely while iterating
 *
 * Separate practice class for independent execution in IntelliJ IDEA.
 */
public class CollectionPractice05 {

    // Practice note: kept this example small so the result is easy to verify.
    public static void main(String[] args) {
List<Integer> safeRemoveList = new ArrayList<>(Arrays.asList(10, 20, 30, 40));
        Iterator<Integer> it = safeRemoveList.iterator();
        while (it.hasNext()) {
            if (it.next() > 20) {
                it.remove();
            }
        }
        System.out.println("5. Remove elements > 20 safely: " + safeRemoveList);
    }
}
