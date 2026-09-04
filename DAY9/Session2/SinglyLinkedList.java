package DAY9.Session2;

class Node {

    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class SinglyLinkedList {

    static Node head;

    // Insert at beginning
    static void insertAtBeginning(int data) {

        Node newNode = new Node(data);

        newNode.next = head;
        head = newNode;
    }

    // Print linked list
    static void print() {

        Node temp = head;

        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {

        insertAtBeginning(10);
        insertAtBeginning(20);
        insertAtBeginning(30);
        insertAtBeginning(40);
        insertAtBeginning(50);
        insertAtBeginning(60);

        print();
    }
}
