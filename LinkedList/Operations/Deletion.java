package LinkedList.Operations;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Deletion {
    
    static void display(Node head) {
        Node temp = head;
    
        System.out.print("Head - > ");
        
        while (temp != null) {
            System.out.print(temp.data + " - > ");
            temp = temp.next;
        }
    
        System.out.println("Null");
    }


    public static void main(String[] args) {
        Node first = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);
        Node forth = new Node(40);
        Node fifth = new Node(50);

        Node head = first;
        first.next = second;
        second.next = third;
        third.next = forth;
        forth.next = fifth;

        display(head);

        // Deletion in LinkedList 

        // 1. Delete at Beginning

        System.out.println("\nDeleting 10 from beginning\n");
        
        head = head.next;

        display(head);

        // 2. Delete at End

        System.out.println("\nDeleting 50 from end\n");

        Node temp = head;

        while (temp.next.next != null) {
            temp = temp.next;
        }

        temp.next = null;

        display(head);

        // 3. Delete at Middle (30)

        System.out.println("\nDeleting 30 from middle\n");

        Node temp2 = head;

        while (temp2 != null && temp2.next.data != 30) {
            temp2 = temp2.next;
        }

        if (temp2 != null) {
            temp2.next = temp2.next.next;
        }

        display(head);
        
    }
}
