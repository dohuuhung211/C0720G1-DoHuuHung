package generic_stack_queue.thuc_hanh.thuc_hanh_01;

import java.util.Stack;

class MyStack {
    public static void main(String[] args) {
        Stack myStack = new Stack();
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        myStack.push(4);
        System.out.println(myStack.get(1));
//        while (!myStack.isEmpty()){
//            System.out.println(myStack.pop());
//        }
    }
}

