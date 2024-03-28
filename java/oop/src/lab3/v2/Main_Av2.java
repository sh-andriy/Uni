package lab3.v2;
class Node {
    String data;
    Node next;

    Node(String data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    public void add(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void remove(String key) {
        Node current = head, prev = null;

        if (current != null && current.data.equals(key)) {
            head = current.next;
            return;
        }

        while (current != null && !current.data.equals(key)) {
            prev = current;
            current = current.next;
        }

        if (current == null) return;

        prev.next = current.next;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }
}

public class Main_Av2 {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.printList();

        list.remove("Banana");
        list.printList();
    }
}
