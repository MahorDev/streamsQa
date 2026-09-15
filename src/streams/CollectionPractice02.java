package streams;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Exercise 2: Reverse elements in a collection without using predefined reverse functions
 *
 * Separate practice class for independent execution in IntelliJ IDEA.
 */
public class CollectionPractice02 {

    // Practice note: kept this example small so the result is easy to verify.
    public static void main(String[] args) {
List<Integer> revList = new ArrayList<>(Arrays.asList(10, 20, 30, 40));
        int left = 0, right = revList.size() - 1;
        while (left < right) {
            Integer temp = revList.get(left);
            revList.set(left++, revList.get(right));
            revList.set(right--, temp);
        }
        System.out.println("2. Reverse list in-place: " + revList);
    }
}
