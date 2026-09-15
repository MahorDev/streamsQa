package streams;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Exercise 18: Sort entries of a Map based on keys or values
 *
 * Separate practice class for independent execution in IntelliJ IDEA.
 */
public class AdvancedStreamPractice18 {

    // Practice note: kept this example small so the result is easy to verify.
    public static void main(String[] args) {
Map<String, Integer> sampleMap = new HashMap<>();
        sampleMap.put("Banana", 2);
        sampleMap.put("Apple", 5);
        sampleMap.put("Cherry", 3);

        List<Map.Entry<String, Integer>> sortedByKey = sampleMap.entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .toList();
        List<Map.Entry<String, Integer>> sortedByValDesc = sampleMap.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .toList();
        System.out.println("18. Sorted Map by key: " + sortedByKey + ", by value desc: " + sortedByValDesc);
    }
}
