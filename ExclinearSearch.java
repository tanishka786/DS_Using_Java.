public class Tester {

    public static int searchElement(int[] arr, int target) {
        int iterations = 0;
        for (int i = 0; i < arr.length; i++) {
            iterations++;
            if (arr[i] == target) {
                return iterations;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {5, 3, 7, 1, 4, 9, 8};
        int target = 4;

        int result = searchElement(arr, target);
        if (result != -1) {
            System.out.println("TargetElement1 found in " + result + " iterations.");
        } else {
            System.out.println("TargetElement1 not found.");
        }

        target = 6;
        result = searchElement(arr, target);
        if (result != -1) {
            System.out.println("TargetElement2 found in " + result + " iterations.");
        } else {
            System.out.println("TargetElement2 not found.");
        }
    }
}
