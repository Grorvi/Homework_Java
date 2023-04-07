import java.util.*;
public class PhoneBook {
    private  Map<String, List<String>> phoneBook;

    public PhoneBook() {
        phoneBook = new HashMap<>();
    }

    public void addNumber(String name, String number) {
        List<String> numbers = phoneBook.getOrDefault(name, new ArrayList<>());
        numbers.add(number);
        phoneBook.put(name, numbers);
    }

    public void printAll() {
        for (Map.Entry<String, List<String>> entry : phoneBook.entrySet()) {
            String name = entry.getKey();
            List<String> numbers = entry.getValue();
            System.out.println(name + ": " + String.join(", ", numbers));
        }
    }
}
