// You are given the head of a linked list, You have to return the value of the middle node of the 
// linked list.

// If the number of nodes is odd, return the middle node value.
// If the number of nodes is even, there are two middle nodes, so return the second middle node value.

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Question4 {
    public static int findMiddleNode(Node head) { // method 1
        int count = 0;
        Node temp = head;

        while (temp != null) {
            count++;
            temp = temp.next;
        }

        int middle = count / 2;
        temp = head;

        for (int i = 1; i <= middle; i++) {
            temp = temp.next;
        }

        return temp.data;
    }

    public static int findMiddleNode2(Node head) { // method 2 using fast and slow pointer
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        
        return slow.data;
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);

        display(head);

        int middle = findMiddleNode(head);

        System.out.println("Middle Node : " + middle);
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
}