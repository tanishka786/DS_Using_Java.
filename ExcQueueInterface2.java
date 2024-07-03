import java.util.Deque;
import java.util.ArrayDeque;

class Tester {
    
    public static Deque<Integer> changeSmallest(Deque<Integer> inputStack) {
        if (inputStack.isEmpty()) {
            return inputStack;
        }
        
        int smallest = Integer.MAX_VALUE;
        int size = inputStack.size();
        Deque<Integer> tempStack = new ArrayDeque<>();
        
        // Find the smallest element and push all elements to tempStack
        while (!inputStack.isEmpty()) {
            int current = inputStack.pop();
            if (current < smallest) {
                smallest = current;
            }
            tempStack.push(current);
        }
        
        int countSmallest = 0;
        
        // Count occurrences of smallest element
        for (int i = 0; i < size; i++) {
            int current = tempStack.pop();
            if (current == smallest) {
                countSmallest++;
            }
            inputStack.push(current);
        }
        
        // Push all elements except smallest to tempStack
        while (countSmallest > 0) {
            int current = inputStack.pop();
            if (current != smallest) {
                tempStack.push(current);
            } else {
                countSmallest--;
            }
        }
        
        // Push smallest elements to the bottom of inputStack
        while (!tempStack.isEmpty()) {
            inputStack.push(tempStack.pop());
        }
        
        return inputStack;
    }


	public static void main(String[] args) {
		
		Deque<Integer> inputStack = new ArrayDeque<Integer>();
		inputStack.push(10);
		inputStack.push(8);
		inputStack.push(5);
		inputStack.push(12);
		inputStack.push(5);
	
		Deque<Integer> updatedStack = changeSmallest(inputStack);
		
		System.out.println("Stack After Modification:");
		for (Integer value : updatedStack)
			System.out.println(value);
	}
}


output :-   java -cp /tmp/HX2b1aPyxi/Tester
Stack After Modification:
12
8
10

=== Code Execution Successful ===