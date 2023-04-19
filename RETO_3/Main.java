import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = { 5, 3, 8, 4, 2 };
        System.out.println("Original array: " + Arrays.toString(arr));

        // Call the bubbleSort method from BubbleSort class
        BubbleSort.bubbleSort(arr);

        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
}
