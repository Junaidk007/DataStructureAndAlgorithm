// Given a singly linked list head , your task is to remove every kth node from the linked list. 

// Examples:

// Input: head: 1 -> 2 -> 3 -> 4 -> 5 -> 6 -> 7 -> 8, k = 2
// Output: 1 -> 3 -> 5 -> 7


package LinkedList.Questions.Basic;

class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Question3 {
    static Node deleteKthNode(Node head, int k) {
        
        Node temp = head;
        
        if(head == null || k < 1) return head;

        if(k == 1) return null;

        while(temp != null) {
            for(int i = 2; i < k; i++) {
                if(temp != null) {
                    temp = temp.next;
                } else break;
            }

            if (temp == null || temp.next == null) break;

            temp.next = temp.next.next;
            temp = temp.next;
        }

        return head;
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
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);
        head.next.next.next.next.next.next = new Node(7);
        head.next.next.next.next.next.next.next = new Node(8);

        display(head);

        Node newHead = deleteKthNode(head, 1);

        display(newHead);
    }
}
