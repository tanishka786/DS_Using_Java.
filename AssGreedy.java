class Tester {

    public static int findSwapCount(String inputString) {
        int openCount = 0;        // Count of '('
        int unmatchedClose = 0;   // Count of ')' unmatched by '('
        int swapCount = 0;        // Number of swaps needed
        
        // Iterate through the string
        for (int i = 0; i < inputString.length(); i++) {
            char c = inputString.charAt(i);
            
            if (c == '(') {
                openCount++;
            } else if (c == ')') {
                if (openCount > 0) {
                    // Match this ')' with a '('
                    openCount--;
                } else {
                    // No '(' available to match, need a swap
                    unmatchedClose++;
                }
            }
        }
        
        // Number of swaps required is equal to unmatchedClose
        swapCount = unmatchedClose;
        
        return swapCount;
    }

    public static void main(String args[]) {
        String inputString = "())()(";
        System.out.println("Number of swaps: " + findSwapCount(inputString));
    }

}
             output:--


Number of swaps: 1