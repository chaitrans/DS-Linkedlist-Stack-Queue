package linkedlist;

/**
 * We are creating linked list by appending data at last position
 * @author Chaitra NS
 * @since 25 Jul 2021
 */

public class UC3 {
    Node head;

    public static void main(String[] args) {
        UC3 linkedList = new UC3();
        linkedList.append(70);
        linkedList.append(30);
        linkedList.append(56);
        linkedList.show();
    }

    // 'append()' will append data at last position.
    public void append(int data) {
        // created object of 'Node' class
        Node node = new Node();

        // initializing 'node' of the linked-list
        node.data = data;
        node.next = null;   // at the time of node creation, the 'next' not refer to any other node

        // if the linked-list is empty which means 'head' is refer to 'null'
        if (head == null) {
            //Creating a first or head node
            head = node;
        } else {
            Node n = head;      // n is our temporary node
            while (n.next != null) {
                n = n.next;     // jumping to next node as 'n.next' contains next node address
            }
            n.next = node;
        }
    }

    // print the Linked-list
    public void show() {
        Node node = head;    //Similar int i = 0;
        while (node != null) {
            System.out.println(node.data);
            node = node.next;
        }
    }

}
