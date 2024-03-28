package lab3;
import java.util.LinkedList;

public class Main_A {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Cherry");
        linkedList.add("Date");

        System.out.println("Original LinkedList: " + linkedList);

        linkedList.remove("Cherry");

        System.out.println("Updated LinkedList: " + linkedList);
    }
}
