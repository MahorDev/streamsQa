package streams;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Exercise 11: Check if a List is sorted in ascending or descending order
 *
 * Separate practice class for independent execution in IntelliJ IDEA.
 */
public class CollectionPractice11 {

    // Practice note: kept this example small so the result is easy to verify.
    public static void main(String[] args) {
List<Integer> orderTestList = Arrays.asList(10, 20, 30, 40);
        boolean isAscending = true;
        boolean isDescending = true;
        for (int i = 0; i < orderTestList.size() - 1; i++) {
            if (orderTestList.get(i) > orderTestList.get(i + 1)) isAscending = false;
            if (orderTestList.get(i) < orderTestList.get(i + 1)) isDescending = false;
        }
        System.out.println("11. Sorted ascending: " + isAscending + ", descending: " + isDescending);
    }
}
