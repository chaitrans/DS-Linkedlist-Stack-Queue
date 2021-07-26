package linkedlist;

/**
 * We are creating linked list by adding/inserting data at first position
 * @author Chaitra NS
 * @since 25 Jul 2021
 */

public class UC1UC2 {
    Node head;

    public static void main(String[] args) {
        UC1UC2 linkedList = new UC1UC2();
        linkedList.insert(70);
        linkedList.insert(30);
        linkedList.insert(56);
        linkedList.show();
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

    // print the Linked-list
    public void show() {
        Node node = head;    //Similar int i = 0;
        while (node != null) {
            System.out.println(node.data);
            node = node.next;
        }
    }
}