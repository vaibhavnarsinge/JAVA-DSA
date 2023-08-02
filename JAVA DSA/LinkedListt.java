class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    LinkedList() {
        head = null;
    }

    // Insert at the beginning
    void insertAtFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    // Insert at the end
    void insertAtLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    // Insert at a specific position
    void insertAtPos(int data, int pos) {
        if (pos <= 0) {
            System.out.println("Invalid position.");
            return;
        }

        if (pos == 1) {
            insertAtFirst(data);
            return;
        }

        Node newNode = new Node(data);
        Node current = head;
        for (int i = 1; i < pos - 1 && current != null; i++) {
            current = current.next;
        }
        if (current == null) {
            System.out.println("Invalid position.");
            return;
        }
        newNode.next = current.next;
        current.next = newNode;
    }

    // Delete at the beginning
    void deleteFirst() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        head = head.next;
    }

    // Delete at the end
    void deleteLast() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        if (head.next == null) {
            head = null;
            return;
        }

        Node current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
    }

    // Delete at a specific position
    void deleteAtPos(int pos) {
        if (pos <= 0) {
            System.out.println("Invalid position.");
            return;
        }

        if (pos == 1) {
            deleteFirst();
            return;
        }

        Node current = head;
        for (int i = 1; i < pos - 1 && current != null; i++) {
            current = current.next;
        }
        if (current == null || current.next == null) {
            System.out.println("Invalid position.");
            return;
        }
        current.next = current.next.next;
    }

    // Display the linked list
    void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    // Count the number of nodes in the linked list
    int count() {
        int count = 0;
        Node current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }
}

public class LinkedListt {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        
        list.insertAtFirst(3);
        list.insertAtFirst(2);
        list.insertAtFirst(1);
        
        list.insertAtLast(4);
        list.insertAtLast(5);
        
        list.insertAtPos(6, 4);
        
        list.display(); // Output: 1 -> 2 -> 3 -> 4 -> 6 -> 5 -> null
        
        System.out.println("Count: " + list.count()); // Output: Count: 6
        
        list.deleteFirst();
        list.deleteLast();
        list.deleteAtPos(3);
        
        list.display(); // Output: 2 -> 3 -> 6 -> null
        
        System.out.println("Count: " + list.count()); // Output: Count: 3
    }
}
