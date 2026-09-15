package streams;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Exercise 18: Reverse the order of words in a sentence using collections
 *
 * Separate practice class for independent execution in IntelliJ IDEA.
 */
public class CollectionPractice18 {

    // Practice note: kept this example small so the result is easy to verify.
    public static void main(String[] args) {
String sentence = "Java is very powerful";
        List<String> wordsInSentence = new ArrayList<>(Arrays.asList(sentence.split(" ")));
        int wL = 0, wR = wordsInSentence.size() - 1;
        while (wL < wR) {
            String temp = wordsInSentence.get(wL);
            wordsInSentence.set(wL++, wordsInSentence.get(wR));
            wordsInSentence.set(wR--, temp);
        }
        System.out.println("18. Reverse words in sentence: \"" + String.join(" ", wordsInSentence) + "\"");
    }
}
