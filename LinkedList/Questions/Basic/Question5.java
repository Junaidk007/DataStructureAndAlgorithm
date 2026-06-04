// Given a singly linked list and a key, count the number of occurrences of the given 
// key in the linked list.

// Examples:

// Input: head: 1->2->1->2->1->3->1, key = 1

// Output: 4
// Explanation: 1 appears 4 times. 

package LinkedList.Questions.Basic;

class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Question5 {
    public static int count(Node head, int key) {
        int count = 0;
        Node temp = head;

        while(temp != null) {
            if (temp.data == key) count++;

            temp = temp.next;
        }

        return count;
    }

    static void display(Node head) {
        System.out.println("Printing Linked List.......");

        Node temp = head;

        while(temp != null) {
            System.out.print(temp.data + " - > ");
            temp = temp.next;
        }
        System.out.println(temp + "\n");
    }

    public static void main(String[] args) {
        
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(1);
        head.next.next.next = new Node(2);
        head.next.next.next.next = new Node(1);
        head.next.next.next.next.next = new Node(3);
        head.next.next.next.next.next.next = new Node(1);

        display(head);

        int count = count(head, 1);

        System.out.println("Occurences of 1 : " + count);
    }
}
