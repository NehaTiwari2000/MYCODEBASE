package collection;

public class DummyLL {
    public static void main(String[] args) {
        LinkedListCollection linkedListCollection = new LinkedListCollection();
        linkedListCollection.addNodeAtFirst("Neha ");
        linkedListCollection.addNodeAtLast("Tiwari");
        linkedListCollection.addNodeAtFirst("Hello ");
        System.out.println(linkedListCollection);
    }
}

class LinkedListCollection {
    Node head;
    Integer llSize;


    LinkedListCollection() {
        llSize = 0;
    }

    @Override
    public String toString() {
        return "LinkedListCollection{" +
                "head=" + head +
                '}';
    }

    void addNodeAtFirst(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    void addNodeAtLast(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node trackNode = head;
        while (trackNode.next != null) {
            trackNode = trackNode.next;
        }
        trackNode.next = newNode;
    }

    class Node {
        String data;
        Node next;


        Node(String data) {
            this.data = data;
            this.next = null;
            llSize++;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "data='" + data + '\'' +
                    ", next=" + next +
                    '}';
        }
    }


}
