package streams;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Exercise 1: Filter all even numbers from a list of integers
 *
 * Separate practice class for independent execution in IntelliJ IDEA.
 */
public class StreamBasicsPractice01 {

    // Practice note: kept this example small so the result is easy to verify.
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2, 4, 6, 8, 10, 12, 14, 16, 18, 20);

List<Integer> evenNums = numbers.stream().filter(n -> n % 2 == 0).toList();
        System.out.println("1. Even numbers: " + evenNums);
    }
}
