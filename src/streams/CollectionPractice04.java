package streams;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Exercise 4: Rotate elements in a List to the right by k steps
 *
 * Separate practice class for independent execution in IntelliJ IDEA.
 */
public class CollectionPractice04 {

    // Practice note: kept this example small so the result is easy to verify.
    public static void main(String[] args) {
List<Integer> rotList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        int k = 2;
        int rotK = k % rotList.size();
        for (int step = 0; step < rotK; step++) {
            Integer last = rotList.get(rotList.size() - 1);
            for (int i = rotList.size() - 1; i > 0; i--) {
                rotList.set(i, rotList.get(i - 1));
            }
            rotList.set(0, last);
        }
        System.out.println("4. Rotate right by " + k + ": " + rotList);
    }
}
