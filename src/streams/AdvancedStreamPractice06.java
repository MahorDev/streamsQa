package streams;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Exercise 6: Count occurrences of each word in a paragraph or text
 *
 * Separate practice class for independent execution in IntelliJ IDEA.
 */
public class AdvancedStreamPractice06 {

    // Practice note: kept this example small so the result is easy to verify.
    public static void main(String[] args) {
String paragraph = "java spring java sql spring java";
        Map<String, Long> wordFreq = Arrays.stream(paragraph.split("\\s+"))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println("6. Word occurrences: " + wordFreq);
    }
}
