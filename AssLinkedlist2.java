import java.util.LinkedList;
import java.util.List;

class Tester {
    
  public static List<Integer> findCommonElements(List<Integer> listOne, List<Integer> listTwo){
        List<Integer> commonElements = new LinkedList<>();
        
        // Create a copy of listOne to preserve its original contents
        List<Integer> copyListOne = new LinkedList<>(listOne);
        
        // Iterate through elements of listTwo
        for (Integer num : listTwo) {
            if (copyListOne.contains(num)) {
                commonElements.add(num);
                // Remove the element from copyListOne to handle duplicates
                copyListOne.remove(num);
            }
        }
        
        return commonElements;
    }
	
	public static void main(String arga[]){

		List<Integer> listOne = new LinkedList<Integer>();
		listOne.add(10);
		listOne.add(12);
		listOne.add(21);
		listOne.add(1);
		listOne.add(53);
		
		List<Integer> listTwo = new LinkedList<Integer>();
		listTwo.add(11);
		listTwo.add(21);
		listTwo.add(25);
		listTwo.add(53);
		listTwo.add(47);

		System.out.println(findCommonElements(listOne, listTwo));
	}
}                                  


output:--   java -cp /tmp/uzmG9H5eXX/Tester
[21, 53]

=== Code Execution Successful ===