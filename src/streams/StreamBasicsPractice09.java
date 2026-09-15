package streams;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Exercise 9: Skip first 2 elements and limit to next 3
 *
 * Separate practice class for independent execution in IntelliJ IDEA.
 */
public class StreamBasicsPractice09 {

    // Practice note: kept this example small so the result is easy to verify.
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2, 4, 6, 8, 10, 12, 14, 16, 18, 20);

List<Integer> skippedAndLimited = numbers.stream().skip(2).limit(3).toList();
        System.out.println("9. Skip 2, limit 3: " + skippedAndLimited);
    }
}
