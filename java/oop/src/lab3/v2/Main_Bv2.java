package lab3.v2;
import java.util.Arrays;

public class Main_Bv2 {
    public static String[] subArray(String[] arr, int start, int end) {
        if (start > end || start < 0 || end > arr.length) {
            return new String[0];
        }
        String[] result = new String[end - start];
        for (int i = start; i < end; i++) {
            result[i - start] = arr[i];
        }
        return result;
    }

    public static void main(String[] args) {
        String[] colors = {"Red", "Green", "Blue", "Yellow", "Black"};
        System.out.println("Original Array: " + Arrays.toString(colors));

        String[] subColors = subArray(colors, 1, 4);
        System.out.println("Sub Array: " + Arrays.toString(subColors));
    }
}
