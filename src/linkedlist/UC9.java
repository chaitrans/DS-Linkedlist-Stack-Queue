package linkedlist;

/**
 * We are deleting node from linked-list and return the size of linked-list.
 * @author Chaitra NS
 * @since 25 Jul 2021
 */
public class UC9 {
    Node head;

    public static void main(String[] args) {
        UC9 linkedList = new UC9();
        linkedList.append(56);
        linkedList.append(30);
        linkedList.append(70);
        linkedList.insertAfter(30, 40);
        linkedList.deleteByValue(40);
        linkedList.show();
        int size = linkedList.size();
        System.out.println("Size of the linked-list is : " + size );
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

    // 'insertAfter()' will insert data after specific node value
    public void insertAfter(int after, int data) {
        // variable "after" stores the value after which we want to insert node in the linked-list

        Node node = new Node();
        node.data = data;
        node.next = null;

        Node n = head;
        while(n != null){
            if (n.data == after){
                node.next = n.next;
                n.next = node;
            }
            n = n.next;
        }
    }

    // 'deleteByValue()' will delete specific node from linked-list and it takes value/data as parameter
    public void deleteByValue(int data) {
        Node n = head;
        Node n1 = head;

        while (n.next != null){
            if(n.data == data){
                break;
            }
            n1 = n;
            n = n.next;
        }
        if (head.data == data){
            head = head.next;
        }else{
            n1.next = n.next;
            n.next = null;
        }
    }

    // 'size()' will return the size of the linked-list
    public int size() {
        Node n = head;
        int size = 0;
        while (n.next != null) {
            n = n.next;
            size++;
        }
        // Checking linked-list is empty or not.
        if (size > 0 || head.next == null) {
            size = size + 1;
            return size;
        }
        return size;
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