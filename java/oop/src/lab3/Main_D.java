package lab3;
import java.util.HashMap;
import java.util.Map;
import java.util.Collection;

public class Main_D {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "A");
        map.put(2, "B");
        map.put(3, "C");

        System.out.println("Original map: " + map);

        Collection<String> values = map.values();

        System.out.println("Collection of values: " + values);
    }
}

