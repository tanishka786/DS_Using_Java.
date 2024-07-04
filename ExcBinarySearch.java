public class Tester {

    public static int searchElement(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        int iterations = 0;

        while (left <= right) {
            iterations++;
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                System.out.println("Element found in " + iterations + " iterations.");
                return mid;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        System.out.println("Element not found after " + iterations + " iterations.");
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 5, 7, 8, 9};
        int target = 4;

        int result = searchElement(arr, target);
        if (result != -1) {
            System.out.println("TargetElement1 found at index " + result + ".");
        } else {
            System.out.println("TargetElement1 not found.");
        }

        target = 6;
        result = searchElement(arr, target);
        if (result != -1) {
            System.out.println("TargetElement2 found at index " + result + ".");
        } else {
            System.out.println("TargetElement2 not found.");
        }
    }
}
