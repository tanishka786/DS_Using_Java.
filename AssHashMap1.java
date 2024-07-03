import java.util.*;

public class Tester {

    public static void main(String[] args) {
        HashMap<String, Integer> salesMap = new HashMap<>();
        salesMap.put("Alice", 120);
        salesMap.put("Bob", 250);
        salesMap.put("Charlie", 180);
        salesMap.put("Diana", 220);
        salesMap.put("Eve", 150);

        List<String> sortedEmployees = sortSales(salesMap);

        System.out.println("Employees sorted by sales (descending order):");
        for (String employee : sortedEmployees) {
            System.out.println(employee);
        }
    }

    public static List<String> sortSales(HashMap<String, Integer> salesMap) {
        // Convert the entries of the HashMap to a list
        List<Map.Entry<String, Integer>> salesList = new ArrayList<>(salesMap.entrySet());

        // Sort the list based on sales values in descending order
        salesList.sort((entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue()));

        // Extract the names of the employees in sorted order
        List<String> sortedEmployees = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : salesList) {
            sortedEmployees.add(entry.getKey());
        }

        return sortedEmployees;
    }
}
