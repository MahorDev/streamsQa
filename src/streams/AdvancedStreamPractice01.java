package streams;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Exercise 1: Find maximum and minimum values from a list of integers
 *
 * Separate practice class for independent execution in IntelliJ IDEA.
 */
public class AdvancedStreamPractice01 {

    // Practice note: kept this example small so the result is easy to verify.
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(7, 14, 21, 28, 35, 42, 55, 68, 81);

int maxVal = numbers.stream().max(Integer::compareTo).orElse(0);
        int minVal = numbers.stream().min(Integer::compareTo).orElse(0);
        System.out.println("1. Max: " + maxVal + ", Min: " + minVal);
    }
}
