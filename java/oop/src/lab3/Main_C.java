package lab3;
import java.util.HashSet;

public class Main_C {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("One");
        hashSet.add("Two");
        hashSet.add("Three");

        System.out.println("Original HashSet: " + hashSet);

        hashSet.clear();

        System.out.println("HashSet after clear: " + hashSet);
    }
}

