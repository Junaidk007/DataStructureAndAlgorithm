// Given the head of a linked list and an integer k, return the kth node from the end of the linked list. 
// If k is greater than the number of nodes in the list, return -1.

// Examples :

// Input: head: 1->2->3->4->5->6->7->8->9, k = 2
// Output: 8


package LinkedList.Questions.Basic;

class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Question2 {
    static int getKthFromLast(Node head, int k) {
        
        int len = 0;

        Node temp = head;

        while(temp != null) {
            temp = temp.next;
            len++;
        }

        if(len < k) return -1;

        temp = head;

        for(int i = 0; i < len - k; i++) {
            temp = temp.next;
        }
        
        return temp.data;
    }


    public static void main(String[] args) {
        
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        display(head);

        int data = getKthFromLast(head, 2);

        System.out.println("Kth Node Data from last : " + data);
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
