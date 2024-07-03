import java.util.HashMap;
import java.util.Map;

public class Tester {

    public static void main(String[] args) {
        String input = "hello world";
        HashMap<Character, Integer> occurrences = findOccurrences(input);

        System.out.println("Character occurrences:");
        for (Map.Entry<Character, Integer> entry : occurrences.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public static HashMap<Character, Integer> findOccurrences(String str) {
        HashMap<Character, Integer> charCountMap = new HashMap<>();

        for (char ch : str.toCharArray()) {
            charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);
        }

        return charCountMap;
    }
}
