package streams;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Exercise 19: Simple in-memory phonebook system
 *
 * Separate practice class for independent execution in IntelliJ IDEA.
 */
public class CollectionPractice19 {

    // Practice note: kept this example small so the result is easy to verify.
    public static void main(String[] args) {
PhoneBook pb = new PhoneBook();
        pb.addContact("9812345670", "Karan");
        pb.addContact("9098765432", "Pooja");
        String searchedName = pb.searchContact("9812345670");
        pb.deleteContact("9098765432");
        System.out.println("19. Phonebook search: " + searchedName + ", Remaining: " + pb);
    }
}
