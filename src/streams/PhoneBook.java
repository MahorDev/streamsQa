package streams;

import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    private final Map<String, String> contacts = new HashMap<>();

    public void addContact(String phoneNumber, String name) {
        contacts.put(phoneNumber, name);
    }

    public String searchContact(String phoneNumber) {
        return contacts.get(phoneNumber);
    }

    public boolean deleteContact(String phoneNumber) {
        return contacts.remove(phoneNumber) != null;
    }

    @Override
    public String toString() {
        return contacts.toString();
    }
}
