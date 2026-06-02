package LinkedList.Operations;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Insertion {
    public static void main(String[] args) {
        Node first = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);
        Node head = first;
        first.next = second;
        second.next = third;

       display(head);

        // Insertion in LinkedList 

        // 1. Insert at Beginning

        System.out.println("\nInseting 5 at the beginning of list\n");
        
        Node newNode = new Node(5);
        newNode.next = head;
        head = newNode;

        display(head);

        // 2. Insert at End

        System.out.println("\nInserting 40 at the end of list\n");

        Node newNode2 = new Node(40);
        Node temp3 = head;

        while (temp3.next != null) {
            temp3 = temp3.next;
        }

        temp3.next = newNode2;

        display(head);

        // 3. Insert at Middle

        System.out.println("\nInserting 25 at the middle (20) of list\n");

        Node temp4 = head;

        while (temp4.data != 20 && temp4 != null) {
            temp4 = temp4.next;
        }

        if(temp4 != null) {
            Node newNode3 = new Node(25);

            newNode3.next = temp4.next;
            
            temp4.next = newNode3;
        }
        
        display(head);
    }


    static void display(Node head) {
        Node temp = head;
    
        System.out.print("Head - > ");
        
        while (temp != null) {
            System.out.print(temp.data + " - > ");
            temp = temp.next;
        }
    
        System.out.println("Null");
    }
}

