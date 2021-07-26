package stack;

import linkedlist.UC1UC2;

public class UC1 {
    UC1UC2 linkedList = new UC1UC2();

    public static void main(String[] args) {
        UC1 stack = new UC1();
        stack.push(70);
        stack.push(30);
        stack.push(56);
        stack.show();
    }

    public void push(int data){
       linkedList.insert(data);
    }

    public void show(){
        linkedList.show();
    }
}
