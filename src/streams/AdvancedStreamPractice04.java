package streams;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Exercise 4: Count strings starting with "A"
 *
 * Separate practice class for independent execution in IntelliJ IDEA.
 */
public class AdvancedStreamPractice04 {

    // Practice note: kept this example small so the result is easy to verify.
    public static void main(String[] args) {
List<String> words = Arrays.asList("Apple", "Banana", "Avocado", "Cherry", "Apricot");
        long countA = words.stream().filter(w -> w.startsWith("A")).count();
        System.out.println("4. Count strings starting with 'A': " + countA);
    }
}
