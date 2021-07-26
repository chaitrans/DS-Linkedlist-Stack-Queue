package linkedlist;

/**
 * We are deleting last node of the linked-list
 * @author Chaitra NS
 * @since 25 Jul 2021
 */
public class UC6 {
    Node head;

    public static void main(String[] args) {
        UC6 linkedList = new UC6();
        linkedList.append(56);
        linkedList.append(30);
        linkedList.append(70);
        linkedList.popLast();
        linkedList.show();
    }

    // 'insert()' will add/insert node at first position
    public void insert(int data) {
        // created object of 'Node' class
        Node node = new Node();

        //Creating and initializing node of the linked-list
        node.data = data;
        node.next = null;   // at the time of node creation, the 'next' not refer to any other node

        node.next = head;   // inserting node at first position by referring 'next' to head

        head = node;        // assign that node as a head
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

    // 'insertAt()' will insert the data at specific position or index.
    public void insertAt(int position, int data) {
        Node node = new Node();
        node.data = data;
        node.next = null;

        if (position == 0) {
            insert(data);
        } else {
            Node n = head;
            int i = 0;
            while (i < position-1) {
                n = n.next;         // jumping to next node as 'n.next' contains next node address
                i++;
            }
            node.next = n.next;
            n.next = node;
        }
    }

    // 'popFirst()' will remove first node from linked-list
    public void popFirst() {
        head = head.next;
    }

    // 'popLast()' will remove last node from linked-list
    public void popLast() {
        Node n = head;
        Node n1 = head;
        while (n.next != null) {
            n1 = n;
            n = n.next;
        }
        n1.next = null;
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