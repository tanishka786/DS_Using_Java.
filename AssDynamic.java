import java.util.ArrayList;
import java.util.List;

class Tester {
    
    static int count=0;
    
    
    public static void findWordSegments(List<String> wordsList, String inputString) {
        int n = inputString.length();
        boolean[] dp = new boolean[n + 1];
        dp[0] = true; // Empty substring is always segmentable
        
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                if (dp[j] && wordsList.contains(inputString.substring(j, i))) {
                    dp[i] = true;
                    break;
                }
            }
        }
        
        if (dp[n]) {
            count++;
        }
    }

	public static void main(String[] args){
	    List<String> wordsList = new ArrayList<String>();
	    wordsList.add("i");
	    wordsList.add("like");
	    wordsList.add("pizza");
	    wordsList.add("li");
	    wordsList.add("ke");
	    wordsList.add("pi");
	    wordsList.add("zza");

		String inputString = "ilikepizza";
		findWordSegments(wordsList, inputString);
		System.out.println("Number of segments: "+count);
	}
}               

output:-

Number of segments: 1