import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

class Tester {

    public static List<Integer> removeDuplicates(List<Integer> list) {
        Set<Integer> set = new HashSet<>();
        List<Integer> uniqueList = new LinkedList<>();

        for (Integer num : list) {
            if (set.add(num)) { // HashSet's add method returns true if num was added (i.e., not already present)
                uniqueList.add(num);
            }
        }

        return uniqueList;
    }

    public static void main(String args[]) {
        List<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(15);
        list.add(21);
        list.add(15);
        list.add(10);

        List<Integer> updatedList = removeDuplicates(list);

        System.out.println("Linked list without duplicates:");
        for (Integer value : updatedList) {
            System.out.print(value + " ");
        }
    }

}
