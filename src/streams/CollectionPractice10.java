package streams;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Exercise 10: Check if a List is a palindrome
 *
 * Separate practice class for independent execution in IntelliJ IDEA.
 */
public class CollectionPractice10 {

    // Practice note: kept this example small so the result is easy to verify.
    public static void main(String[] args) {
List<Integer> palTestList = Arrays.asList(1, 2, 3, 2, 1);
        boolean isPalindrome = true;
        for (int i = 0, j = palTestList.size() - 1; i < j; i++, j--) {
            if (!Objects.equals(palTestList.get(i), palTestList.get(j))) {
                isPalindrome = false;
                break;
            }
        }
        System.out.println("10. List is palindrome: " + isPalindrome);
    }
}
