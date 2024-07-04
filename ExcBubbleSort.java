public class Tester {

    public static void displayArray(int[] elements) {
        for (int element : elements) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void swap(int[] elements, int firstIndex, int secondIndex) {
        int temp = elements[firstIndex];
        elements[firstIndex] = elements[secondIndex];
        elements[secondIndex] = temp;
    }

    public static int bubbleSort(int[] elements) {
        int n = elements.length;
        int passes = 0;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (elements[j] > elements[j + 1]) {
                    swap(elements, j, j + 1);
                    swapped = true;
                }
            }
            passes++;
            System.out.println("Array after pass " + passes + ":");
            displayArray(elements);

            if (!swapped) break;  // If no elements were swapped, the array is already sorted
        }
        return passes;
    }

    public static void main(String[] args) {
        int[] arr = {5, 3, 7, 1, 4, 9, 8};

        System.out.println("Original array:");
        displayArray(arr);

        int passes = bubbleSort(arr);

        System.out.println("Sorted array after " + passes + " passes:");
        displayArray(arr);
    }
}
