package linkedlist;

/**
 * We are deleting first node of the linked-list
 * @author Chaitra NS
 * @since 25 Jul 2021
 */
public class UC5 {
    Node head;

    public static void main(String[] args) {
        UC5 linkedList = new UC5();
        linkedList.append(56);
        linkedList.append(30);
        linkedList.append(70);
        linkedList.popFirst();
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

    // 'insert()' will add/insert node at first position
    public void insert(int data) {
        // created object of 'Node' class
        Node node = new Node();

        //Creating and initializing node of the linked-list
        node.data = data;
        node.next = null;   // at the time of node creation, the 'next' will not refer to any other node

        node.next = head;   // inserting node at first position by referring 'next' to head

        head = node;        // assign that node as a head
    }

    // 'popFirst()' will remove first node from linked-list
    public void popFirst() {
        head = head.next;
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
