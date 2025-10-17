import java.util.*;

public class PhoneBook implements PhoneBookInterface {

    private static Map<String, List<String>> phoneBook;

    public PhoneBook() {
        phoneBook = new HashMap<>();
    }

    @Override
    public void add(String surname, String phoneNumber) {
        if (!phoneBook.containsKey(surname)) {
            phoneBook.put(surname, new ArrayList<>());
        }

        phoneBook.get(surname).add(phoneNumber);
    }

    @Override
    public List<String> get(String surname) {

        return phoneBook.getOrDefault(surname, Collections.emptyList());
    }

}