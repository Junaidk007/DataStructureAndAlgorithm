// You are given the head of a singly linked list. You have to determine whether the given 
// linked list contains a loop or not. A loop exists in a linked list if the next pointer 
// of the last node points to any other node in the list (including itself), rather than 
// being null.


package LinkedList.Questions.Basic;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Question7 {
    public static boolean detectLoop(Node head) {
        
        Node fastPtr = head;
        Node slowPtr = head;

        while(fastPtr.next != null && fastPtr.next.next != null) {

            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;

            if( slowPtr == fastPtr) return true;
        }

        return false;
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next = head.next.next;

        boolean isLoop = detectLoop(head);

        System.out.println("Is Loop Present in Linked List: " + isLoop);
    }
}
