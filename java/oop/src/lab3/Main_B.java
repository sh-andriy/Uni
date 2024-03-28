package lab3;
import java.util.ArrayList;
import java.util.List;

public class Main_B {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Red");
        arrayList.add("Green");
        arrayList.add("Blue");
        arrayList.add("Yellow");
        arrayList.add("Black");

        System.out.println("Original ArrayList: " + arrayList);

        List<String> subList = arrayList.subList(1, 4);

        System.out.println("SubList: " + subList);
    }
}
