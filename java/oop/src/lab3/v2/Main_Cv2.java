package lab3.v2;
import java.util.Arrays;

public class Main_Cv2 {
    public static void main(String[] args) {
        String[] hashSet = {"One", "Two", "Three"};
        System.out.println("Original Set: " + Arrays.toString(hashSet));

        hashSet = new String[0];

        System.out.println("Set after clear: " + Arrays.toString(hashSet));
    }
}
