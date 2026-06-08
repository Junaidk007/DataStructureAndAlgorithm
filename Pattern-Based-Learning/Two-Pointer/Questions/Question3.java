// Given the head of a sorted linked list, delete all duplicates such that each 
// element appears only once. Return the linked list sorted as well.

// Example 1:

// Input: head = [1,1,2]
// Output: [1,2]

// Example 2:

// Input: head = [1,1,2,3,3]
// Output: [1,2,3]



class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Question3 {
    public static Node deleteDuplicates(Node head) {
        if (head == null || head.next == null) return head;

        Node ptr1 = head;
        Node ptr2 = head.next;

        while (ptr2 != null) {
            if (ptr1.data != ptr2.data) {
                ptr1 = ptr1.next;
                ptr2 = ptr2.next;
            } else {
                ptr1.next = ptr2.next;
                ptr2 = ptr2.next;
            }
        }

        return head;
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(1);
        head.next.next = new Node(2);
        head.next.next.next = new Node(3);
        head.next.next.next.next = new Node(3);
        head.next.next.next.next.next = new Node(3);
        head.next.next.next.next.next.next = new Node(4);

        Node result = deleteDuplicates(head);
        Node current = result;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}