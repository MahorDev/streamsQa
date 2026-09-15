package streams;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Exercise 11: Check if any number in a list is divisible by 5
 *
 * Separate practice class for independent execution in IntelliJ IDEA.
 */
public class StreamBasicsPractice11 {

    // Practice note: kept this example small so the result is easy to verify.
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2, 4, 6, 8, 10, 12, 14, 16, 18, 20);

boolean anyDivBy5 = numbers.stream().anyMatch(n -> n % 5 == 0);
        System.out.println("11. Any divisible by 5: " + anyDivBy5);
    }
}
