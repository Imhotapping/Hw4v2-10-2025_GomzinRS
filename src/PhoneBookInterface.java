import java.util.List;

public interface PhoneBookInterface {
    void add(String surname, String phoneNumber);
    List<String> get(String surname);
}