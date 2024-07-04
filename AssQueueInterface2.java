import java.util.Stack;

public class StackUpdater {

    public static void main(String[] args) {
        // Creating a sample stack of characters
        Stack<Character> stack = new Stack<>();
        stack.push('A');
        stack.push('B');
        stack.push('C');
        stack.push('D');
        stack.push('E');
        stack.push('F');

        System.out.println("Original Stack: " + stack);

        // Updating the stack as per the requirement
        updateStack(stack);

        // Printing the updated stack
        System.out.println("Updated Stack: " + stack);
    }

    public static void updateStack(Stack<Character> stack) {
        if (stack.size() < 3) {
            // If the stack has less than 3 elements, cannot perform the operation
            System.out.println("Stack should have at least 3 elements to perform the operation.");
            return;
        }

        // Temporary stack to hold the bottom three elements
        Stack<Character> tempStack = new Stack<>();

        // Remove the bottom three elements from the original stack and push them to tempStack
        for (int i = 0; i < 3; i++) {
            tempStack.push(stack.remove(0));
        }

        // Push elements from tempStack back to the original stack (now at the top)
        while (!tempStack.isEmpty()) {
            stack.push(tempStack.pop());
        }
    }
}
