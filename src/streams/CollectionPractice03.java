package streams;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Exercise 3: Swap elements in a List at two given indices
 *
 * Separate practice class for independent execution in IntelliJ IDEA.
 */
public class CollectionPractice03 {

    // Practice note: kept this example small so the result is easy to verify.
    public static void main(String[] args) {
List<Integer> swapList = new ArrayList<>(Arrays.asList(10, 20, 30, 40));
        int idx1 = 1, idx2 = 3;
        Integer tempSwap = swapList.get(idx1);
        swapList.set(idx1, swapList.get(idx2));
        swapList.set(idx2, tempSwap);
        System.out.println("3. Swap indices 1 and 3: " + swapList);
    }
}
