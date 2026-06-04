package LinkedList.Questions.Basic;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Question6 {
    public static Node pairWiseSwap(Node head) {

        Node temp = head;
        Node prev = null;

        while (temp != null && temp.next != null) {
            Node nextNode = temp.next;
            temp.next = nextNode.next;
            nextNode.next = temp;
            if(prev == null) { head = nextNode; } else { prev.next = nextNode; }

            prev = temp;
            temp = temp.next;
        }

        return head;
    }

    static void display(Node head) {
        System.out.println("Printing Linked List.......");

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " - > ");
            temp = temp.next;
        }
        System.out.println(temp + "\n");
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);

        display(head);

        Node newHead = pairWiseSwap(head);

        display(newHead);   
    }
}
