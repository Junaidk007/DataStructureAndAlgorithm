// You are given the head of a singly linked list and an integer x. Delete the xth node (1-based indexing) 
// from the singly linked list.

// Examples:

// Input: x = 1,
    
// Output: 2 -> 3 -> 1 -> 7



package LinkedList.Questions.Basic;

class Node {
    int data; 
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Question1 {
    public static Node deleteNode(Node head, int x) {
        
        if (x == 1) {
            return head.next;
        }

        Node temp = head;

        for(int i = 2; i < x; i++) {
            temp = temp.next;
        }

        temp.next = temp.next.next;

        return head;
    }


    public static void main(String[] args) {
        Node node = new Node(10);
        node.next = new Node(20);
        node.next.next = new Node(30);
        node.next.next.next = new Node(40);

        Node head = node;

        display(head);

        Node newHead = deleteNode(head, 4);

        display(newHead);

    }


    static void display(Node head) {
        System.out.println("Printing Linked List.......\n");

        Node temp = head;

        while(temp != null) {
            System.out.print(temp.data + " - > ");
            temp = temp.next;
        }

        System.out.println(temp + "\n");
    }
    
}
