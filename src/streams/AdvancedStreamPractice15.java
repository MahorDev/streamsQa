package streams;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Exercise 15: Partition a list into fixed-size sublists
 *
 * Separate practice class for independent execution in IntelliJ IDEA.
 */
public class AdvancedStreamPractice15 {

    // Practice note: kept this example small so the result is easy to verify.
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(7, 14, 21, 28, 35, 42, 55, 68, 81);

List<List<Integer>> sublists = new ArrayList<>();
        int chunkSize = 3;
        for (int i = 0; i < numbers.size(); i += chunkSize) {
            int end = Math.min(i + chunkSize, numbers.size());
            sublists.add(new ArrayList<>(numbers.subList(i, end)));
        }
        System.out.println("15. Partitioned fixed-size sublists: " + sublists);
    }
}
