import java.util.Scanner;

class Node {

    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }

}

public class LLOperation {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        Node n1 = new Node(10);
        Node n2 = new Node(20);

        Node head = n1;

        insert(head, 12);
        display(head);
    }

    public static void insert(Node head, int data) {
        Node newnNode = new Node(data);
        if (head == null) {
            newnNode.next = null;
            newnNode = head;
        }
        Node cur = head;
        while (cur != null) {
            cur = cur.next;
        }
        cur.next = newnNode;

    }

    public static void display(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + "->");
            current = current.next;
        }
    }

}