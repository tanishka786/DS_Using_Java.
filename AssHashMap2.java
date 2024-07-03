import java.util.HashMap;
import java.util.Map;

public class Tester {

    public static void main(String[] args) {
        HashMap<String, Integer> map1 = new HashMap<>();
        map1.put("Alice", 120);
        map1.put("Bob", 250);
        map1.put("Charlie", 180);

        HashMap<String, Integer> map2 = new HashMap<>();
        map2.put("Bob", 300);
        map2.put("Diana", 220);
        map2.put("Eve", 150);

        HashMap<String, Integer> mergedMap = mergeMaps(map1, map2);

        System.out.println("Merged Map:");
        for (Map.Entry<String, Integer> entry : mergedMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public static HashMap<String, Integer> mergeMaps(HashMap<String, Integer> map1, HashMap<String, Integer> map2) {
        HashMap<String, Integer> resultMap = new HashMap<>(map1);

        for (Map.Entry<String, Integer> entry : map2.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();

            if (resultMap.containsKey(key) && !resultMap.get(key).equals(value)) {
                int counter = 1;
                String newKey = "new" + key;
                while (resultMap.containsKey(newKey)) {
                    newKey = "new" + key + counter;
                    counter++;
                }
                resultMap.put(newKey, value);
            } else {
                resultMap.put(key, value);
            }
        }

        return resultMap;
    }
}
