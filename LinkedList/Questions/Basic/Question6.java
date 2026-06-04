// Given a singly linked list. The task is to swap elements in the linked list pairwise. 
// For example, if the input list is 1 2 3 4, the resulting list after swaps will be 2 1 4 3.

// Note: You need to swap the nodes, not only the data. 

// Examples:

// Input: LinkedList: 1->2->2->4->5->6->7->8
// Output: 2->1->4->2->6->5->8->7

// Explanation: After swapping each pair considering (1,2), (2, 4), (5, 6).. so on as pairs, 
// we get 2, 1, 4, 2, 6, 5, 8, 7 as a new linked list.



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
