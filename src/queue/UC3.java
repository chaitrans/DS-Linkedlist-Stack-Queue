package queue;
import linkedlist.UC9;

public class UC3 {
    UC9 linkedList = new UC9();

    public static void main(String[] args) {
        UC3 queue = new UC3();
        queue.enqueue(56);
        queue.enqueue(30);
        queue.enqueue(70);
        queue.show();
    }

    public void enqueue(int data){
        linkedList.append(data);
    }

    public void show(){
        linkedList.show();
    }
}
