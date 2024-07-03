import java.util.HashMap;
import java.util.Map;

public class Tester {

    public static void main(String[] args) {
        HashMap<String, Double> studentMarks = new HashMap<>();
        studentMarks.put("Alice", 85.0);
        studentMarks.put("Bob", 92.0);
        studentMarks.put("Charlie", 87.0);
        studentMarks.put("Diana", 92.0);
        studentMarks.put("Eve", 70.0);
        studentMarks.put("Frank", 70.0);

        HashMap<String, Double> result = findMaxMinScorers(studentMarks);

        System.out.println("Maximum Marks Scorers:");
        for (Map.Entry<String, Double> entry : result.entrySet()) {
            if (entry.getValue().equals(result.get("maxScore"))) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }

        System.out.println("Minimum Marks Scorers:");
        for (Map.Entry<String, Double> entry : result.entrySet()) {
            if (entry.getValue().equals(result.get("minScore"))) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }
    }

    public static HashMap<String, Double> findMaxMinScorers(HashMap<String, Double> studentMarks) {
        HashMap<String, Double> result = new HashMap<>();
        if (studentMarks == null || studentMarks.isEmpty()) {
            return result;
        }

        double maxScore = Double.NEGATIVE_INFINITY;
        double minScore = Double.POSITIVE_INFINITY;

        for (Map.Entry<String, Double> entry : studentMarks.entrySet()) {
            double marks = entry.getValue();
            if (marks > maxScore) {
                maxScore = marks;
            }
            if (marks < minScore) {
                minScore = marks;
            }
        }

        result.put("maxScore", maxScore);
        result.put("minScore", minScore);

        for (Map.Entry<String, Double> entry : studentMarks.entrySet()) {
            if (entry.getValue() == maxScore) {
                result.put(entry.getKey() + "_max", entry.getValue());
            }
            if (entry.getValue() == minScore) {
                result.put(entry.getKey() + "_min", entry.getValue());
            }
        }

        return result;
    }
}
